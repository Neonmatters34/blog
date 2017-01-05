package com.codeup;

import com.codeup.dao.DaoFactory;
import com.codeup.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/posts/create")
    public String showCreatePage(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }
    @PostMapping("/posts/create")
    public String createNewPost(@ModelAttribute Post post){
        DaoFactory.getPostsDao().savePost(post);
        return "redirect:/posts";
    }
}
