package com.sqlhero.blogservice.dao;

import com.sqlhero.blogservice.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/7/10.
 */

public interface BlogDao extends JpaRepository<Blog, Long> {

    List<Blog> findByUsername(String username);


}
