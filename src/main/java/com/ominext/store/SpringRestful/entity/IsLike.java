package com.ominext.store.SpringRestful.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_islike")
public class IsLike {
    @Id
    private long islikeId;



    public long getIslikeId() {
        return islikeId;
    }

    public void setIslikeId(long islikeId) {
        this.islikeId = islikeId;
    }
}
