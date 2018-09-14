package org.csu.workmaster_v1.Dao.Impl;

import org.csu.workmaster_v1.Dao.NotificationDao;
import org.csu.workmaster_v1.Entity.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class NotificationImpl implements NotificationDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveNotification(Notification notification) {
        mongoTemplate.save(notification);
    }

    @Override
    public Notification findNotificationByNotificationId(Long notificationId) {
        Query query = new Query(Criteria.where("notificationId").is(notificationId));
        Notification notification = mongoTemplate.findOne(query, Notification.class);
        return notification;
    }

    @Override
    public void updateNotification(Notification notification) {
        Query query = new Query(Criteria.where("notificationId").is(notification.getNotificationId()));
        Update update = new Update().set("notifictionContent", notification.getNotifictionContent()).set("groupId", notification.getGroupId()).set("time", notification.getTime());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Notification.class);
    }

    @Override
    public void deleteNotificationById(Long notificationId) {
        Query query = new Query(Criteria.where("notificationId").is(notificationId));
        mongoTemplate.remove(query,Notification.class);
    }
}
