package org.csu.workmaster_v1.Dao.Impl;

import org.csu.workmaster_v1.Dao.UserDao;
import org.csu.workmaster_v1.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserImpl implements UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

     //更新对象
    @Override
    public void updateUser(User user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("username", user.getUsername()).set("userpassword", user.getUserpassword());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update, User.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,User.class);
    }

     //删除对象
    @Override
    public void deleteUserById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,User.class);
    }

     //创建对象
    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    // 根据用户Id查询对象
    @Override
    public User findUserByUserId(long id) {
        Query query=new Query(Criteria.where("id").is(id));
        User user =  mongoTemplate.findOne(query , User.class);
        return user;
    }
    //更新密码
    @Override
    public void updatePsw(long userId,String psw) {
        Query query=new Query(Criteria.where("id").is(userId));
        User user =  mongoTemplate.findOne(query , User.class);
        user.setUserpassword(psw);
    }
    //更新头像
    @Override
    public void updateAvatar(long userId, long Avator) {
        Query query=new Query(Criteria.where("id").is(userId));
        User user =  mongoTemplate.findOne(query , User.class);
        user.setAvatar(Avator);
    }
    //更新组信息
    @Override
    public void updateGroup(long userId,long GroupId) {
        Query query=new Query(Criteria.where("id").is(userId));
        User user =  mongoTemplate.findOne(query , User.class);
        List GroupList= user.getGroupList();
        GroupList.add(GroupId);
    }

    @Override
    public User findUserByusername(String username) {
        Query query=new Query(Criteria.where("username").is(username));
        User user =  mongoTemplate.findOne(query , User.class);
        return user;
    }

    @Override
    public User findUserByStudentid(String studentid) {
        Query query=new Query(Criteria.where("Studentid").is(studentid));
        User user =  mongoTemplate.findOne(query , User.class);
        return user;
    }
}