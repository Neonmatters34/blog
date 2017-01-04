package com.codeup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Matt on 1/4/17.
 */
@Controller
public class MathController {
    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }
    @RequestMapping(path = "/add/{numberOne}/and/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String add(@PathVariable int numberOne, @PathVariable int numberTwo ) {
        return numberOne + "+" + numberTwo + "=" + (numberOne + numberTwo);
    }
    @RequestMapping(path = "subtract/{numberOne}/from/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberTwo + "-" + numberOne + "=" + (numberTwo-numberOne);
    }
    @RequestMapping(path = "divide/{numberOne}/by/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne + "/" + numberTwo + "=" + (numberOne/numberTwo);
    }
    @RequestMapping(path = "multiply/{numberOne}/by/{numberTwo}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int numberOne, @PathVariable int numberTwo){
        return numberOne + "x" + numberTwo + "=" + (numberOne*numberTwo);
    }
}
