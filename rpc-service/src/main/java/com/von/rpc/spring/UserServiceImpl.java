package com.von.rpc.spring;

import com.von.rpc.common.annotation.MRpcService;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 9:38
 */
@MRpcService
public class UserServiceImpl implements UserService {


    @Override
    public void addUser(User user) {
        System.out.println(user);
    }
}
