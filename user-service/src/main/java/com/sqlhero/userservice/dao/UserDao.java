package com.sqlhero.userservice.dao;


import com.sqlhero.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：sqlhero.
 * @date ：Created in 10:38 2018/12/3
 * @description ：UserDao
 * @modified By：
 * @version: 0.0.1
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
