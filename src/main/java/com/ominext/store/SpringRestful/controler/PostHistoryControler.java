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
        List<Post> posts = new ArrayList<>();
        for (PostHistory p : list) {
            Post post = postRepository.findOne(p.getPostId());
            posts.add(post);
        }
        for (Post item : posts) {
            long postId = item.getPostId();
            String postContent = item.getPostContent();
            String postTime = item.getPostTime();
            int postComment = item.getPostCountComment();
            int postLove = item.getPostCountLike();
            long postStoreId = item.getPostStoreId();
            String postStoreName = item.getPostStoreName();
            String postStoreAvatar = item.getPostStoreAvatar();
            String postImage = item.getPostImage();
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

    @RequestMapping(path = "/{postId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Long deletePostHistory(@PathVariable("postId") long postId) {
        long check;
        try {
            postHistoryRepository.delete(postId);
            check = postId;
        } catch (Exception e) {
            check = 0;
        }
        return check;
    }
}
