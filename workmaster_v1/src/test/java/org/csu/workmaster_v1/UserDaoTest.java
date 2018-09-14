package org.csu.workmaster_v1;

import org.csu.workmaster_v1.Dao.UserDao;
import org.csu.workmaster_v1.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {
        User user=new User("3901160203","shuxintest","舒鑫");
        userDao.saveUser(user);
    }
    @Test
    public void testAddGroup() throws Exception{
        User user = userDao.findUserByusername("舒鑫");
        /*List list = user.getGroupList();
        list.add(112312312);
        userDao.saveUser(user);*/
        System.out.println(user);
    }
    @Test
    public void testStudentId() throws Exception{
        User user = userDao.findUserByStudentid("3901160203");
        if(user == null){
            System.out.println("没有找到");
        }else{
            List list = user.getGroupList();
            list.add(9999999);
            userDao.saveUser(user);
        }
    }
}