package com.hester.study.services.impl;

import com.hester.study.dao.IUserDao;
import com.hester.study.entity.User;
import com.hester.study.services.IUserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: wangjie27
 * @Description:
 * @Date: Created in  2017/8/9 13:50
 * @Modified By:
 */

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserServices{
    @Resource
    private IUserDao userDao;


    public User getUserfindById(Integer id) {
        return userDao.findById(id);
    }




    /*public List<User> findAll() {
        return userDao.findAll();
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void addUsers(List<User> list) {
        userDao.addUsers(list);
    }

    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

    public void deleteByIds(List<Integer> ids) {
        userDao.deleteByIds(ids);
    }

    public void deleteByArrayIds(Integer[] ids) {
        userDao.deleteByArrayIds(ids);
    }

    public void deleteByMapIds(Map<String, Object> map) {
        userDao.deleteByMapIds(map);
    }*/
}
