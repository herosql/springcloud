package com.sqlhero.userservice.client.hystrix;

import com.sqlhero.userservice.client.AuthServiceClient;
import com.sqlhero.userservice.entity.Jwt;
import org.springframework.stereotype.Component;

/**
 * @author ：sqlhero.
 * @date ：Created in 8:36 2018/12/3
 * @description ：熔断器
 * @modified By：
 * @version: 0.0.1
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {

    @Override
    public Jwt getToken(String authorization, String type, String username, String password) {
        System.out.println("---------opps getToken hystrix---------");
        
        return null;
    }
}
