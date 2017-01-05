package com.codeup.dao;

import com.codeup.models.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matt on 1/5/17.
 */
public class ListPosts implements Posts{
    private List<Post> allPosts;

    public ListPosts(){
        allPosts = new ArrayList<>();
    }

    @Override
    public List<Post> getAllPosts() {
        return allPosts;
    }

    @Override
    public void savePost(Post post) {
    allPosts.add(post);
    }
}
