package com.MvcPersonalBlog.mvcPersonalBlog.Services;

import com.MvcPersonalBlog.mvcPersonalBlog.Entity.BlogPost;
import com.MvcPersonalBlog.mvcPersonalBlog.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostServiceImpl implements IServiceBlogPost{
    @Autowired
    private BlogPostRepository blogpostRepository;


    @Override
    public List<BlogPost> getAllBlogPosts() {
        return blogpostRepository.findAll();
    }

    @Override
    public Optional<BlogPost> getBlogPostById(Long id) {
        return blogpostRepository.findById(id);
    }

    @Override
    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogpostRepository.save(blogPost);
    }

    @Override
    public void updateBlogPostById(Long id) {

    }

    @Override
    public void deleteBlogPostById(Long id) {

    }
}
