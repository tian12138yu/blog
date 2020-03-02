package com.tjy.myblog.dao;

import com.tjy.myblog.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author tjy
 * @Date 2020/2/29 19:48
 */

public interface UserDao extends JpaRepository<User,Long>{
    User findByUsernameAndPassword(String username,String passworrd);

}
