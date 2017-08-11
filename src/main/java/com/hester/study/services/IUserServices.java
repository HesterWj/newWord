package com.hester.study.services;


import com.hester.study.entity.User;

/**
 * @Author: wangjie27
 * @Description:
 * @Date: Created in  2017/8/9 13:48
 * @Modified By:
 */

public interface IUserServices {

   public  User getUserfindById(Integer id);

  /*  List<User> findAll();
    //这里只是插入一个数据
    void addUser(User user);

    //这里插入多个数据
    void addUsers(List<User> list);

    void deleteById(Integer id);

    void deleteByIds(List<Integer> ids);

    void deleteByArrayIds(Integer []ids);

    void deleteByMapIds(Map<String,Object> map);*/
}
