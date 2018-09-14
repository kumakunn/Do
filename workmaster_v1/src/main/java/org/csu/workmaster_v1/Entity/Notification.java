package org.csu.workmaster_v1.Entity;

public class Notification {
    public long notificationId;
    public long senderId;
    public long receiver;
    public String notifictionContent;
    public long time;
    public long groupId;
    public int  notificationStatus;

    public Notification(){

    }

    public Notification(long notificationId, long senderId, long receiver, String notifictionContent, long time, long groupId, int notificationStatus) {
        this.notificationId = notificationId;
        this.senderId = senderId;
        this.receiver = receiver;
        this.notifictionContent = notifictionContent;
        this.time = time;
        this.groupId = groupId;
        this.notificationStatus = notificationStatus;
    }

    public long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiver() {
        return receiver;
    }

    public void setReceiver(long receiver) {
        this.receiver = receiver;
    }

    public String getNotifictionContent() {
        return notifictionContent;
    }

    public void setNotifictionContent(String notifictionContent) {
        this.notifictionContent = notifictionContent;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public int getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(int notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}
