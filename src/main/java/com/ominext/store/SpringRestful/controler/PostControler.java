package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.*;
import com.ominext.store.SpringRestful.entity.form.PostDTO;
import com.ominext.store.SpringRestful.repository.IsLikeRepository;
import com.ominext.store.SpringRestful.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("posts")
public class PostControler {
    @Autowired
    PostRepository postRepository;
    @Autowired
    IsLikeRepository isLikeRepository;

    //thêm một post mới
    @RequestMapping(path = "/add", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Post addNewPost(@RequestBody Post post) {
        postRepository.save(post);
        return post;
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE})

    @ResponseBody
    public Post updatePost(@RequestBody Post post) {
        postRepository.save(post);
        return post;
    }

    //lấy ra số cmt của một post
    @RequestMapping(path = "/coundCmt/{postId}", method = RequestMethod.GET)
    @ResponseBody
    public Integer getCountPostCmt(@PathVariable("postId") long postId) {
        Post post = postRepository.findAllByPostId(postId);
        return post.getPostCountComment();
    }

    //cập nhật cmt của một post
    @RequestMapping(path = "/coundCmt/{postId}", method = RequestMethod.PUT)
    @ResponseBody
    public Integer updateCountPostCmt(@PathVariable("postId") long postId) {
        Post p = postRepository.findAllByPostId(postId);
        int postCmt = p.getPostCountComment() + 1;
        p.setPostCountComment(postCmt);
        postRepository.save(p);
        return postCmt;
    }

    //cap nhat like cua mot post
    @RequestMapping(path = "/coundlike/{postId}", method = RequestMethod.PUT)
    @ResponseBody
    public Integer updateCountPostLove(@PathVariable("postId") long postId, @RequestBody int i) {
        Post p = postRepository.findAllByPostId(postId);
        int postLove = p.getPostCountLike();
        if (i == 1) {
            if (postLove > 0) {
                postLove--;
            }
        } else if (i == 0) {
            postLove++;
        }
        p.setPostCountLike(postLove);
        postRepository.save(p);
        return postLove;
    }

    //lấy toàn bộ post
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Post> getAllPost() {
        return postRepository.findAll();
    }

    @RequestMapping(path = "/allcustom", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    List<Post> get() {
        return postRepository.allPost();
    }


    @RequestMapping(path = "/all/{accId}/{curentPage}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<PostDTO> getAllPosts(@PathVariable("accId") long accId, @PathVariable("curentPage") int curentPage) {
        List<PostDTO> listDto = new ArrayList<>();
        List<Post> posts = postRepository.allPost();
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
            listDto.add(postDTO);

        }
        int fromIndex = curentPage * 10;
        int toIndex = fromIndex + 10;
        List<PostDTO> sublist = new ArrayList<>();
        if (listDto.size() > toIndex) {
            sublist = listDto.subList(fromIndex, toIndex);
        } else {
            if (fromIndex < listDto.size()) {
                sublist = listDto.subList(fromIndex, listDto.size());
            }
        }
        return sublist;

    }


    @RequestMapping(path = "/allpost", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Post> getAllp(long postAccId) {
        return postRepository.allPost();
    }

    //xóa một post
    @RequestMapping(path = "/{postId}", method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Long deletePost(@PathVariable("postId") long postId) {
        postRepository.delete(postId);
        return postId;
    }

    //lấy ra những post của một cửa hàng
    @RequestMapping(value = "/{storeId}/{accId}/{curentPage}", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    List<PostDTO> getPostStore(@PathVariable("storeId") long storeId,
                               @PathVariable("accId") long accId,
                               @PathVariable("curentPage") int curentPage) {
        List<PostDTO> listDto = new ArrayList<>();
        List<Post> posts = postRepository.findAllByPostStoreId(storeId);
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
            listDto.add(postDTO);

        }
        int fromIndex = curentPage * 10;
        int toIndex = fromIndex + 10;
        List<PostDTO> sublist = new ArrayList<>();
        if (listDto.size() > toIndex) {
            sublist = listDto.subList(fromIndex, toIndex);
        } else {
            if (fromIndex < listDto.size()) {
                sublist = listDto.subList(fromIndex, listDto.size());
            }
        }
        return sublist;
    }
}
