package com.ominext.store.SpringRestful.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_islike")
public class IsLike {
    @Id
    private long islikeId;
    private long islikePost;
    private long islikeAcc;

    public long getIslikePost() {
        return islikePost;
    }

    public void setIslikePost(long islikePost) {
        this.islikePost = islikePost;
    }

    public long getIslikeAcc() {
        return islikeAcc;
    }

    public void setIslikeAcc(long islikeAcc) {
        this.islikeAcc = islikeAcc;
    }

    public long getIslikeId() {
        return islikeId;
    }

    public void setIslikeId(long islikeId) {
        this.islikeId = islikeId;
    }
}
