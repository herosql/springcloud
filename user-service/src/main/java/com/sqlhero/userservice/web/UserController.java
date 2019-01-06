package com.sqlhero.userservice.web;

import com.sqlhero.common.annotation.SysLogger;
import com.sqlhero.common.dto.RespDTO;
import com.sqlhero.userservice.entity.User;
import com.sqlhero.userservice.service.UserService;
import com.sqlhero.userservice.util.BPwdEncoderUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fangzhipeng on 2017/7/10.
 */
@RestController
@RefreshScope
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "注册", notes = "username和password为必选项")
    @PostMapping("/registry")
    @SysLogger("registry")
    public User createUser(@RequestBody User user){
        //参数判读省略,判读该用户在数据库是否已经存在省略
        String entryPassword= BPwdEncoderUtils.BCryptPassword(user.getPassword());
        user.setPassword(entryPassword);
        return userService.createUser(user);
    }

    @ApiOperation(value = "登录", notes = "username和password为必选项")
    @PostMapping("/login")
    @SysLogger("login")
    public RespDTO login(@RequestBody User user){
        //参数判读省略
      return  userService.login(user.getUsername(),user.getPassword());
    }

    @ApiOperation(value = "根据用户名获取用户", notes = "根据用户名获取用户")
    @PostMapping("/{username}")
    @PreAuthorize("hasRole('USER')")
    @SysLogger("getUserInfo")
   // @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public RespDTO getUserInfo(@PathVariable("username") String username){
        //参数判读省略
        User user=  userService.getUserInfo(username);
        return RespDTO.onSuc(user);
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("/test")
    public String test(){
        return this.foo;
    }
}
