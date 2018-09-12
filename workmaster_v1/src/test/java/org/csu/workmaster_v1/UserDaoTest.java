package org.csu.workmaster_v1;

import org.csu.workmaster_v1.Dao.UserDao;
import org.csu.workmaster_v1.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {
        User user=new User();
        user.setId(121312l);
        user.setUsername("shuxin");
        user.setUserpassword("shuxinOld");
        userDao.saveUser(user);
        System.out.println("done");
    }

    @Test
    public void findUserByUserName(){
        User user= userDao.findUserByUserName("shuxin");
        System.out.println("user is "+user);
    }

    @Test
    public void updateUser(){
        User user=new User();
        user.setId(6l);
        user.setUsername("shuxin123");
        user.setUserpassword("shuxin123");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById(){
        userDao.deleteUserById(3l);
    }

}