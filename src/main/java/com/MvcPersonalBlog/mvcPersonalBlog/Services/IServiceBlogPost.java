package com.MvcPersonalBlog.mvcPersonalBlog.Services;

import com.MvcPersonalBlog.mvcPersonalBlog.Entity.BlogPost;

import java.util.List;
import java.util.Optional;

public interface IServiceBlogPost {
    List<BlogPost> getAllBlogPosts();
    Optional<BlogPost> getBlogPostById(Long id);
    BlogPost createBlogPost(BlogPost blogPost);
    boolean updateBlogPostById(Long id);
    void deleteBlogPostById(Long id);
}
