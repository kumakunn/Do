package org.csu.workmaster_v1.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User implements Serializable {
    public long id;
    public String studentid;
    public String userpassword;
    public int verification_status=0;
    public long avatar=0 ;
    public String username;
    public List<Long> GroupList = new ArrayList<Long>();

    public User(){}

    public User(String studentid, String userpassword, String username) {
        this.studentid = studentid;
        this.userpassword = userpassword;
        this.username = username;
        id = new Random().nextInt(10000000);
    }

    public User(String username, String userpassword, long id) {
        this.username = username;
        this.userpassword = userpassword;
        this.id = id;
    }

    public User(long id, String studentId, String userpassword, long avatar, String username) {
        this.id = id;
        studentid = studentId;
        this.userpassword = userpassword;
        this.avatar = avatar;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentid;
    }

    public void setStudentId(String studentId) {
        studentid = studentId;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getVerification_status() {
        return verification_status;
    }

    public void setVerification_status(int verification_status) {
        verification_status = verification_status;
    }

    public long getAvatar() {
        return avatar;
    }

    public void setAvatar(long avatar) {
        avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Long> getGroupList() {
        return GroupList;
    }

    public void setGroupList(List<Long> groupList) {
        GroupList = groupList;
    }

    public String toString(){
        return  ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
