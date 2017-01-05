package com.codeup;

import com.codeup.dao.DaoFactory;
import com.codeup.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by Matt on 1/5/17.
 */
@Controller
public class PostsController {
    @GetMapping("/posts")
    public String showPosts(Model model){
        List<Post> posts = DaoFactory.getPostsDao().getAllPosts();
        model.addAttribute("posts", posts);
        return "posts/index";
    }
}
