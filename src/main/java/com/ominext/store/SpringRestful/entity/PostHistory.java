package com.ominext.store.SpringRestful.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_post_history")
public class PostHistory  {

    @Id
    long postId;
    long accId;

    public PostHistory(long postId, long accId) {
        this.postId = postId;
        this.accId = accId;
    }

    public PostHistory() {
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }
}
