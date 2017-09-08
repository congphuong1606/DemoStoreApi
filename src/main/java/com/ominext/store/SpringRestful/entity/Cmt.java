package com.ominext.store.SpringRestful.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cmt")
public class Cmt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cmt_id")
    long cmtId;
    long cmtAccId;
    String cmtAccAvatar;
    @Column(name = "cmt_post_id")
    long cmtPostId;
    String cmtContent;
    String cmtTime;
    String cmtAccName;

    public String getCmtAccName() {
        return cmtAccName;
    }

    public void setCmtAccName(String cmtAccName) {
        this.cmtAccName = cmtAccName;
    }

    public long getCmtId() {
        return cmtId;
    }

    public void setCmtId(long cmtId) {
        this.cmtId = cmtId;
    }

    public long getCmtAccId() {
        return cmtAccId;
    }

    public void setCmtAccId(long cmtAccId) {
        this.cmtAccId = cmtAccId;
    }

    public String getCmtAccAvatar() {
        return cmtAccAvatar;
    }

    public void setCmtAccAvatar(String cmtAccAvatar) {
        this.cmtAccAvatar = cmtAccAvatar;
    }

    public long getCmtPostId() {
        return cmtPostId;
    }

    public void setCmtPostId(long cmtPostId) {
        this.cmtPostId = cmtPostId;
    }

    public String getCmtContent() {
        return cmtContent;
    }

    public void setCmtContent(String cmtContent) {
        this.cmtContent = cmtContent;
    }

    public String getCmtTime() {
        return cmtTime;
    }

    public void setCmtTime(String cmtTime) {
        this.cmtTime = cmtTime;
    }
}
