package org.csu.workmaster_v1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Message {
    public long messageid;
    public long groupid;
    public String messagename;
    public String messagecontent;
    public long time;
    public long messagepublisher;
    public List<Long> userreaded;

    public Message(long messageid, long groupid, String messagename, String messagecontent, long time, long messagepublisher) {
        this.messageid = messageid;
        this.groupid = groupid;
        this.messagename = messagename;
        this.messagecontent = messagecontent;
        this.time = time;
        this.messagepublisher = messagepublisher;
    }

    public long getMessageid() {
        return messageid;
    }

    public void setMessageid(long messageid) {
        this.messageid = messageid;
    }

    public long getGroupid() {
        return groupid;
    }

    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    public String getMessagename() {
        return messagename;
    }

    public void setMessagename(String messagename) {
        this.messagename = messagename;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getMessagepublisher() {
        return messagepublisher;
    }

    public void setMessagepublisher(long messagepublisher) {
        this.messagepublisher = messagepublisher;
    }

    public List<Long> getUserreaded() {
        return userreaded;
    }

    public void setUserreaded(List<Long> userreaded) {
        this.userreaded = userreaded;
    }
}
