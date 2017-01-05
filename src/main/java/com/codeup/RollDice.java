package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Matt on 1/4/17.
 */
@Controller
public class RollDice {
    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }
}
