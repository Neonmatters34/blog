package com.codeup.dao;

//import com.codeup.models.Post;
import org.hibernate.Session;
import com.codeup.models.HibernateUtil;
import org.hibernate.SessionFactory;
/**
 * Created by Matt on 1/5/17.
 */
public class DaoFactory {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();
    private static Posts postsDao;

    public static Posts getPostsDao(){
        if (postsDao == null){
            postsDao = new HibernatePostsDao(session);
        }
        return postsDao;
    }
}
