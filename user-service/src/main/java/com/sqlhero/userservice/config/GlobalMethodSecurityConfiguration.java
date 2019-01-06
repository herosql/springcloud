package com.sqlhero.userservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author ：sqlhero.
 * @date ：Created in 11:12 2018/12/4
 * @description ：令牌授权
 * @modified By：
 * @version: 0.0.1
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GlobalMethodSecurityConfiguration {

}
