package com.techtalentsouth.TechTalentBlog.Repository;

import com.techtalentsouth.TechTalentBlog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
