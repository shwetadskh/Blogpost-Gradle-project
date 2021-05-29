package com.techtalentsouth.TechTalentBlog.service;

import com.techtalentsouth.TechTalentBlog.Repository.BlogPostRepository;
import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    BlogPostRepository blogPostRepository;

//    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
//        this.blogPostRepository = blogPostRepository;
//    }

    @Override
    public BlogPost addNewBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    @Override
    public Iterable<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public String deletePostById(Long id) {
        blogPostRepository.deleteById(id);
        return "Your post has been deleted.";
    }

    @Override
    public BlogPost findById(Long id) {
        return blogPostRepository.findById(id).orElseThrow();
    }

    @Override
    public BlogPost save(BlogPost post) {
        return blogPostRepository.save(post);

    }

}
