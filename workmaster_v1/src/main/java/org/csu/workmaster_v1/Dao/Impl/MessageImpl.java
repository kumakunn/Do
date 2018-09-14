package org.csu.workmaster_v1.Dao.Impl;


import org.csu.workmaster_v1.Dao.MessageDao;
import org.csu.workmaster_v1.Entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class MessageImpl implements MessageDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     *
     * @param message
     */
    @Override
    public void saveMessage(Message message) {
        mongoTemplate.save(message);
    }

    /**
     * 根据消息名查询对象
     *
     * @param messageName
     * @return
     */
    @Override
    public Message findMessageByMessageName(String messageName) {
        Query query = new Query(Criteria.where("messageName").is(messageName));
        Message message = mongoTemplate.findOne(query, Message.class);
        return message;
    }

    /**
     * 更新消息对象
     *
     * @param message
     */
    @Override
    public void updateMessage(Message message) {
        Query query = new Query(Criteria.where("messageId").is(message.getMessageId()));
        Update update = new Update().set("messageName", message.getMessageName()).set("messageContent", message.getMessageContent()).set("time", message.getTime());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, Message.class);
    }

    /**
     * 删除对象
     * @param messageId
     */
    @Override
    public void deleteMessageById(Long messageId){
        Query query = new Query(Criteria.where("messageId").is(messageId));
        mongoTemplate.remove(query,Message.class);
    }
}



