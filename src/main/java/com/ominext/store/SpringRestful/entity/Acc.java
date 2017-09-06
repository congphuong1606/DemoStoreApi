package com.ominext.store.SpringRestful.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbl_acc")
public class Acc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "acc_id")
    private long accId;
    private String accType;
    private int accNumber;
    private String accName;
    private String accFullName;
    private String accPass;
    private String accAvatar;


    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccFullName() {
        return accFullName;
    }

    public void setAccFullName(String accFullName) {
        this.accFullName = accFullName;
    }

    public String getAccPass() {
        return accPass;
    }

    public void setAccPass(String accPass) {
        this.accPass = accPass;
    }

    public String getAccAvatar() {
        return accAvatar;
    }

    public void setAccAvatar(String accAvatar) {
        this.accAvatar = accAvatar;
    }
}
