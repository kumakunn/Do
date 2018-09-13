package org.csu.workmaster_v1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public long TaskId;
    public long GroupId;
    public String TaskName;
    public String TaskContent;
    public long Time;
    public long TaskPublisher;
    public List UserDone= new ArrayList<Long>();
    public String FileFormat;
    public List FileList = new ArrayList<Long>();

    public Task(long taskId, long groupId, String taskName, String taskContent, long time, long taskPublisher, String fileFormat) {
        TaskId = taskId;
        GroupId = groupId;
        TaskName = taskName;
        TaskContent = taskContent;
        Time = time;
        TaskPublisher = taskPublisher;
        FileFormat = fileFormat;
    }

    public long getTaskId() {
        return TaskId;
    }

    public void setTaskId(long taskId) {
        TaskId = taskId;
    }

    public long getGroupId() {
        return GroupId;
    }

    public void setGroupId(long groupId) {
        GroupId = groupId;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public String getTaskContent() {
        return TaskContent;
    }

    public void setTaskContent(String taskContent) {
        TaskContent = taskContent;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }

    public long getTaskPublisher() {
        return TaskPublisher;
    }

    public void setTaskPublisher(long taskPublisher) {
        TaskPublisher = taskPublisher;
    }

    public List getUserDone() {
        return UserDone;
    }

    public void setUserDone(List userDone) {
        UserDone = userDone;
    }

    public String getFileFormat() {
        return FileFormat;
    }

    public void setFileFormat(String fileFormat) {
        FileFormat = fileFormat;
    }

    public List getFileList() {
        return FileList;
    }

    public void setFileList(List fileList) {
        FileList = fileList;
    }
}
