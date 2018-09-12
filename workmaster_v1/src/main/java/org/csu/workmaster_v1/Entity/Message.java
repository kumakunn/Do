package org.csu.workmaster_v1.Entity;

import java.util.ArrayList;
import java.util.List;

public class Message {
    public long MessageId;
    public long GroupId;
    public String MessageName;
    public String MessageContent;
    public long time;
    public long MessagePublisher;
    public List<Long> UserReaded;

    public Message(long messageId, long groupId, String messageName, String messageContent, long time, long messagePublisher) {
        MessageId = messageId;
        GroupId = groupId;
        MessageName = messageName;
        MessageContent = messageContent;
        this.time = time;
        MessagePublisher = messagePublisher;
    }

    public long getMessageId() {
        return MessageId;
    }

    public void setMessageId(long messageId) {
        MessageId = messageId;
    }

    public long getGroupId() {
        return GroupId;
    }

    public void setGroupId(long groupId) {
        GroupId = groupId;
    }

    public String getMessageName() {
        return MessageName;
    }

    public void setMessageName(String messageName) {
        MessageName = messageName;
    }

    public String getMessageContent() {
        return MessageContent;
    }

    public void setMessageContent(String messageContent) {
        MessageContent = messageContent;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getMessagePublisher() {
        return MessagePublisher;
    }

    public void setMessagePublisher(long messagePublisher) {
        MessagePublisher = messagePublisher;
    }

    public List<Long> getUserReaded() {
        return UserReaded;
    }

    public void setUserReaded(List<Long> userReaded) {
        UserReaded = userReaded;
    }
}
