package com.ominext.store.SpringRestful.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    long postId;
    String postContent;
    String postTime;
    int postCountComment;
    int postCountLike;
    long postStoreId;
    String postStoreName;
    String postStoreAvatar;
    String postImage;


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
