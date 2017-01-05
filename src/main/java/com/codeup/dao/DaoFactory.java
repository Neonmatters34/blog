package com.codeup.dao;

/**
 * Created by Matt on 1/5/17.
 */
public class DaoFactory {
    private static Posts postsDao;
    public static Posts getPostsDao(){
        if (postsDao == null){
            postsDao = new ListPosts();
        }
        return postsDao;
    }
}
