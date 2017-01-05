package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Matt on 1/4/17.
 */
@Controller
public class ConditionsController {

    @RequestMapping(path = "/conditions/{status}", method = RequestMethod.GET)
    public String conditions(@PathVariable String status){
        return "/conditions";
    }
}
