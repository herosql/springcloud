package com.sqlhero.uaaservice.dao;


import com.sqlhero.uaaservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sqlhero
 * @date 2018/12/04
 */

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
