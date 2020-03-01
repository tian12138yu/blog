package com.tjy.myblog.Service.ServiceImpl;

import com.tjy.myblog.Service.UserLoginService;
import com.tjy.myblog.dao.UserDao;
import com.tjy.myblog.util.MD5;
import com.tjy.myblog.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author tjy
 * @Date 2020/2/29 19:48
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    UserDao userDao;
    @Override
    public User chechUser(String username, String password) {
        return userDao.findByUsernameAndPassword(username, MD5.code(password));
    }
}
