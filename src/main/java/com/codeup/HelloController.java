package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Matt on 1/4/17.
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }
}
