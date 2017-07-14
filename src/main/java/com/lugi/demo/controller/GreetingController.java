package com.lugi.demo.controller;

import com.lugi.demo.model.User;
import com.lugi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fengcs on 2017/7/14.
 */
@Controller
public class GreetingController {

    @Autowired
    UserService userService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=true, defaultValue="World") String name, Model model) {
        User user = userService.findByName(name);
        model.addAttribute("name", name+user.getId());
        return "greeting";
    }
}
