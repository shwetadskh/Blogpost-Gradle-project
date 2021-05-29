package com.techtalentsouth.TechTalentBlog.service;


import com.techtalentsouth.TechTalentBlog.model.BlogPost;

import java.util.Optional;

// this service is going to serve as a contract
// for our implementation
public interface BlogPostService {

    // create
    BlogPost addNewBlogPost(BlogPost blogPost);

    // read
    Iterable<BlogPost> getAllBlogPosts();

    //delete
    String deletePostById(Long id);


    ///////// edit
    BlogPost findById(Long id);


    BlogPost save(BlogPost actualPost);
}
