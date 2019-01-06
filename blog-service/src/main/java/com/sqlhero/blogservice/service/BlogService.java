package com.sqlhero.blogservice.service;


import com.sqlhero.blogservice.client.UserServiceClient;
import com.sqlhero.common.dto.RespDTO;
import com.sqlhero.common.exception.CommonException;
import com.sqlhero.common.exception.ErrorCode;
import com.sqlhero.blogservice.dao.BlogDao;
import com.sqlhero.blogservice.dto.BlogDetailDTO;
import com.sqlhero.blogservice.entity.Blog;
import com.sqlhero.blogservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sqlhero.blogservice.util.UserUtils;

import java.util.List;

/**
 * Created by fangzhipeng on 2017/7/10.
 */
@Service
public class BlogService {

    @Autowired
    BlogDao blogDao;

    @Autowired
    UserServiceClient userServiceClient;

    public Blog postBlog(Blog blog) {
        return blogDao.save(blog);
    }

    public List<Blog> findBlogs(String username) {
        return blogDao.findByUsername(username);
    }


    public BlogDetailDTO findBlogDetail(Long id) {
//        Blog blog =  blogDao.findOne(id);
        Blog blog = blogDao.findById(id).orElse(null);
        if (null == blog) {
            throw new CommonException(ErrorCode.BLOG_IS_NOT_EXIST);
        }
        RespDTO<User> respDTO = userServiceClient.getUser(UserUtils.getCurrentToken(), blog.getUsername());
        if (respDTO==null) {
            throw new CommonException(ErrorCode.RPC_ERROR);
        }
        BlogDetailDTO blogDetailDTO = new BlogDetailDTO();
        blogDetailDTO.setBlog(blog);
        blogDetailDTO.setUser(respDTO.data);
        return blogDetailDTO;
    }

}
