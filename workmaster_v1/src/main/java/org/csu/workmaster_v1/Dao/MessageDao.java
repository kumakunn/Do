

package org.csu.workmaster_v1.Dao;

import org.csu.workmaster_v1.Entity.Message;

public interface MessageDao {

    public void saveMessage(Message message);
    public Message findMessageByMessageName(String MessageName);
    public void updateMessage(Message message);
    public void deleteMessageById(Long id);
}


