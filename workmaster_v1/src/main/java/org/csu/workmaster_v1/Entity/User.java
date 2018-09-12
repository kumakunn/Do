package org.csu.workmaster_v1.Entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    public long id;
    public String StudentId;
    public String userpassword;
    public int Verification_status;
    public long Avatar ;
    public String username;
    public List<Long> GroupList = new ArrayList<Long>();

    public User(){}

    public User(String username, String userpassword, long id) {
        this.username = username;
        this.userpassword = userpassword;
        this.id = id;
    }

    public User(long id, String studentId, String userpassword, long avatar, String username) {
        this.id = id;
        StudentId = studentId;
        this.userpassword = userpassword;
        Avatar = avatar;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentId() { return StudentId; }

    public void setStudentId(String studentId) {   StudentId = studentId; }

    public int getVerification_status() {  return Verification_status; }

    public void setVerification_status(int verification_status) {  Verification_status = verification_status; }

    public long getAvatar() {return Avatar; }

    public void setAvatar(long avatar) { Avatar = avatar; }

    public List<Long> getGroupList() { return GroupList; }

    public void setGroupList(ArrayList<Long> groupList) { GroupList = groupList; }

    public String toString(){
        return  ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
