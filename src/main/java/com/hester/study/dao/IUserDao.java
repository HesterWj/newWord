package com.hester.study.dao;

import com.hester.study.entity.User;
import org.springframework.stereotype.Repository;

/**
 *Created By wangjie27
 *@Description:
 *@Date: Created in  2017/8/9  13:42
 */
@Repository
public interface IUserDao {

   public User findById(Integer id);

   /* List<User> findAll();
    //这里只是插入一个数据
    void addUser(User user);

    //这里插入多个数据
    void addUsers(List<User> list);

    void deleteById(Integer id);

    void deleteByIds(List<Integer> ids);

    void deleteByArrayIds(Integer []ids);

    void deleteByMapIds(Map<String,Object> map);*/
}
