package com.sqlhero.blogservice.client.hystrix;

import com.sqlhero.blogservice.client.UserServiceClient;
import com.sqlhero.common.dto.RespDTO;
import com.sqlhero.blogservice.entity.User;
import org.springframework.stereotype.Component;


/**
 * Created by fangzhipeng on 2017/5/31.
 */
@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }
}
