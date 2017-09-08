package com.ominext.store.SpringRestful.controler;


import com.ominext.store.SpringRestful.entity.Post;
import com.ominext.store.SpringRestful.entity.PostHistory;
import com.ominext.store.SpringRestful.entity.form.PostDTO;
import com.ominext.store.SpringRestful.repository.IsLikeRepository;
import com.ominext.store.SpringRestful.repository.PostHistoryRepository;
import com.ominext.store.SpringRestful.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts/history")
public class PostHistoryControler {
    @Autowired
    PostRepository postRepository;
    @Autowired
    PostHistoryRepository postHistoryRepository;
    @Autowired
    IsLikeRepository isLikeRepository;

    @RequestMapping(path = "/add/{postId}/{accId}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Integer addNewPostHistory(@PathVariable("postId") long postId, @PathVariable("accId") long accId) {
        PostHistory postHistory = new PostHistory(postId, accId);
        postHistoryRepository.save(postHistory);
        return 1;
    }

    @RequestMapping(path = "/{accId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<PostDTO> getListPosts(@PathVariable("accId") long accId) {
        List<PostHistory> list = postHistoryRepository.findAllByAccId(accId);
        List<PostDTO> dtoList = new ArrayList<>();
        for (PostHistory p : list) {

            Post post = postRepository.findOne(p.getPostId());
            long postId = post.getPostId();
            String postContent = post.getPostContent();
            String postTime = post.getPostTime();
            int postComment = post.getPostCountComment();
            int postLove = post.getPostCountLike();
            long postStoreId = post.getPostStoreId();
            String postStoreName = post.getPostStoreName();
            String postStoreAvatar = post.getPostStoreAvatar();
            String postImage = post.getPostImage();
            Long likeId = Long.valueOf(String.valueOf(accId).concat(String.valueOf(postId)));
            int i = 0;
            if (isLikeRepository.findOne(likeId) != null) {
                i = 1;

            }
            PostDTO postDTO = new PostDTO(postId, postContent, postTime,
                    postComment, postLove, postStoreId, postStoreName,
                    postStoreAvatar, postImage, i);
            dtoList.add(postDTO);
        }

        return dtoList;
    }

    @RequestMapping(path = "{accId}/{postId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Long deletePostHistory(@PathVariable("accId") long accId,@PathVariable("postId") long postId) {
        long check=0;
        try {
            PostHistory postHistory=postHistoryRepository.findAllByAccIdAndPostId(accId,postId);
            if(postHistory!=null){
                postHistoryRepository.delete(postHistory.getId());
                check = postId;
            }

        } catch (Exception e) {
            check = 0;
        }
        return check;
    }
}
