package com.tjy.myblog.Service;

import com.tjy.myblog.vo.User;

/**
 * @Author tjy
 * @Date 2020/2/29 19:46
 */

public interface UserLoginService {
    public User chechUser(String username,String password);
}
