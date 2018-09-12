package org.csu.workmaster_v1.Dao;

import org.csu.workmaster_v1.Entity.User;

public interface UserDao {

    public void saveUser(User user);
    public User findUserByUserName(String userName);
    public void updateUser(User user);
    public void deleteUserById(Long id);
}
