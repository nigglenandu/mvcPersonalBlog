package com.MvcPersonalBlog.mvcPersonalBlog.Services;

import com.MvcPersonalBlog.mvcPersonalBlog.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostServiceImpl implements IServiceBlogPost{
    @Autowired
    private BlogPostRepository blogpostRepository;

}
