package com.sqlhero.userservice.client;

import com.sqlhero.userservice.client.hystrix.AuthServiceHystrix;
import com.sqlhero.userservice.entity.Jwt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：sqlhero.
 * @date ：Created in 8:33 2018/12/3
 * @description ：获取JWT
 * @modified By：
 * @version: 0.0.1
 *
 */
@FeignClient(value = "uaa-service",fallback =AuthServiceHystrix.class )
public interface AuthServiceClient {

    @PostMapping(value = "/oauth/token")
    Jwt getToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
                 @RequestParam("username") String username, @RequestParam("password") String password);
}
