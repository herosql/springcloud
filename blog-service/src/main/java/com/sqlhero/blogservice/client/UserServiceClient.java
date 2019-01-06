package com.sqlhero.blogservice.client;

import com.sqlhero.blogservice.client.hystrix.UserServiceHystrix;
import com.sqlhero.common.dto.RespDTO;
import com.sqlhero.blogservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;



/**
 * Created by fangzhipeng on 2017/5/27.
 */

@FeignClient(value = "user-service",fallback = UserServiceHystrix.class )
public interface UserServiceClient {

    @PostMapping(value = "/user/{username}")
    RespDTO<User> getUser(@RequestHeader(value = "Authorization") String token, @PathVariable("username") String username);
}



