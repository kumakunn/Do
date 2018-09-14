package org.csu.workmaster_v1.Dao;

import org.csu.workmaster_v1.Entity.Notification;

public interface NotificationDao {

    public void saveNotification(Notification notification);
    public Notification findNotificationByNotificationId(Long id);
    public void updateNotification(Notification notification);
    public void deleteNotificationById(Long id);
}
