package com.MvcPersonalBlog.mvcPersonalBlog.Repository;

import com.MvcPersonalBlog.mvcPersonalBlog.Entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
