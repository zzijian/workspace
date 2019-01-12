package org.spring.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/yourtest")
public class YourTestController {


    @RequestMapping(method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        return "yourtest" ;
    }


}
