package com.codeup.dao;

import com.codeup.models.Post;

/**
 * Created by Matt on 1/5/17.
 */
public interface Posts {
     java.util.List<Post> getAllPosts();
    void savePost(Post post);
}
