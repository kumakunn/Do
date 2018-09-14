package org.csu.workmaster_v1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public long taskid;
    public long groupid;
    public String taskname;
    public String taskcontent;
    public long time;
    public long taskpublisher;
    public List userdone = new ArrayList<Long>();
    public String fileformat;
    public List fileList = new ArrayList<Long>();

    public Task(long taskid, long groupid, String taskname, String taskcontent, long time, long taskpublisher, List userdone, String fileformat) {
        this.taskid = taskid;
        this.groupid = groupid;
        this.taskname = taskname;
        this.taskcontent = taskcontent;
        this.time = time;
        this.taskpublisher = taskpublisher;
        this.userdone = userdone;
        this.fileformat = fileformat;
    }

    public long getTaskid() {
        return taskid;
    }

    public void setTaskid(long taskid) {
        this.taskid = taskid;
    }

    public long getGroupid() {
        return groupid;
    }

    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTaskcontent() {
        return taskcontent;
    }

    public void setTaskcontent(String taskcontent) {
        this.taskcontent = taskcontent;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTaskpublisher() {
        return taskpublisher;
    }

    public void setTaskpublisher(long taskpublisher) {
        this.taskpublisher = taskpublisher;
    }

    public List getUserdone() {
        return userdone;
    }

    public void setUserdone(List userdone) {
        this.userdone = userdone;
    }

    public String getFileformat() {
        return fileformat;
    }

    public void setFileformat(String fileformat) {
        this.fileformat = fileformat;
    }

    public List getFileList() {
        return fileList;
    }

    public void setFileList(List fileList) {
        this.fileList = fileList;
    }
}

