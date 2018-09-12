package org.csu.workmaster_v1.Entity;

public class Notificaion {
    public long NoficationId;
    public long SenderId;
    public long Receiver;
    public String NotifictionContent;
    public long time;
    public long GroupId;
    public int  NotificationStatus;

    public Notificaion(long noficationId, long senderId, long receiver, String notifictionContent, long time, long groupId, int notificationStatus) {
        NoficationId = noficationId;
        SenderId = senderId;
        Receiver = receiver;
        NotifictionContent = notifictionContent;
        this.time = time;
        GroupId = groupId;
        NotificationStatus = notificationStatus;
    }

    public long getNoficationId() {
        return NoficationId;
    }

    public void setNoficationId(long noficationId) {
        NoficationId = noficationId;
    }

    public long getSenderId() {
        return SenderId;
    }

    public void setSenderId(long senderId) {
        SenderId = senderId;
    }

    public long getReceiver() {
        return Receiver;
    }

    public void setReceiver(long receiver) {
        Receiver = receiver;
    }

    public String getNotifictionContent() {
        return NotifictionContent;
    }

    public void setNotifictionContent(String notifictionContent) {
        NotifictionContent = notifictionContent;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getGroupId() {
        return GroupId;
    }

    public void setGroupId(long groupId) {
        GroupId = groupId;
    }

    public int getNotificationStatus() {
        return NotificationStatus;
    }

    public void setNotificationStatus(int notificationStatus) {
        NotificationStatus = notificationStatus;
    }
}
