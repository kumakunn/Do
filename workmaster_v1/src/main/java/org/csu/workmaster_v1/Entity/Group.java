package org.csu.workmaster_v1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
    public long GroupId;
    public String GroupName;
    public String GroupDescription;
    public List<Long> UserList =new ArrayList<Long>();
    public long GroupAvatar;

    public Group(long groupId, String groupName, String groupDescription, long GroupAvatar) {
        GroupId = groupId;
        GroupName = groupName;
        GroupDescription = groupDescription;
        this.GroupAvatar = GroupAvatar;
    }

    public long getGroupId() {
        return GroupId;
    }

    public void setGroupId(long groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getGroupDescription() {
        return GroupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        GroupDescription = groupDescription;
    }

    public List<Long> getUserList() {
        return UserList;
    }

    public void setUserList(List<Long> userList) {
        UserList = userList;
    }

    public long getGroupAvatar() { return GroupAvatar; }

    public void setGroupAvatar(long groupAvatar) { GroupAvatar = groupAvatar; }
}
