package org.csu.workmaster_v1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public long groupid;
    public String groupname;
    public String groupgescription;
    public List<Long> userlist =new ArrayList<Long>();
    public long groupavatar;

    public Group(long groupid, String groupname, String groupgescription, long groupavatar) {
        this.groupid = groupid;
        this.groupname = groupname;
        this.groupgescription = groupgescription;
        this.groupavatar = groupavatar;
    }

    public long getGroupid() {
        return groupid;
    }

    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupgescription() {
        return groupgescription;
    }

    public void setGroupgescription(String groupgescription) {
        this.groupgescription = groupgescription;
    }

    public List<Long> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<Long> userlist) {
        this.userlist = userlist;
    }

    public long getGroupavatar() {
        return groupavatar;
    }

    public void setGroupavatar(long groupavatar) {
        this.groupavatar = groupavatar;
    }
}
