package com.ominext.store.SpringRestful.entity.form;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ominext.store.SpringRestful.entity.Post;

import java.io.Serializable;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PostDTO implements Serializable {
    long postId;
    String postContent;
    String postTime;
    int postCountComment;
    int postCountLike;
    long postStoreId;
    String postStoreName;
    String postStoreAvatar;
    String postImage;
    int isLike;


    public PostDTO(long postId, String postContent, String postTime, int postComment, int postLove, long postStoreId,
                   String postStoreName, String postStoreAvatar, String postImage, int isLike) {
        this.postId = postId;
        this.postContent = postContent;
        this.postTime = postTime;
        this.postCountComment = postComment;
        this.postCountLike = postLove;
        this.postStoreId = postStoreId;
        this.postStoreName = postStoreName;
        this.postStoreAvatar = postStoreAvatar;
        this.postImage = postImage;
        this.isLike = isLike;
    }
    public PostDTO(Post item, int isLike) {
        long postId = item.getPostId();
        String postContent = item.getPostContent();
        String postTime = item.getPostTime();
        int postComment = item.getPostCountComment();
        int postLove = item.getPostCountLike();
        long postStoreId = item.getPostStoreId();
        String postStoreName = item.getPostStoreName();
        String postStoreAvatar = item.getPostStoreAvatar();
        String postImage = item.getPostImage();
        this.isLike = isLike;
    }

    public PostDTO() {
    }

    public long getPostId() {
        return postId;
    }
    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public int getPostCountComment() {
        return postCountComment;
    }

    public void setPostCountComment(int postCountComment) {
        this.postCountComment = postCountComment;
    }

    public int getPostCountLike() {
        return postCountLike;
    }

    public void setPostCountLike(int postCountLike) {
        this.postCountLike = postCountLike;
    }

    public int getIsLike() {
        return isLike;
    }

    public void setIsLike(int isLike) {
        this.isLike = isLike;
    }

    public long getPostStoreId() {
        return postStoreId;
    }

    public void setPostStoreId(long postStoreId) {
        this.postStoreId = postStoreId;
    }

    public String getPostStoreName() {
        return postStoreName;
    }

    public void setPostStoreName(String postStoreName) {
        this.postStoreName = postStoreName;
    }

    public String getPostStoreAvatar() {
        return postStoreAvatar;
    }

    public void setPostStoreAvatar(String postStoreAvatar) {
        this.postStoreAvatar = postStoreAvatar;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

}
