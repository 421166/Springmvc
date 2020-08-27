package com.hanyue.controller;

import com.hanyue.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/Controller")
    public String Controller(Model model){
        System.out.println("controller执行了");
        User user = new User();
        user.setAge(11);
        user.setUsername("姐姐");
        user.setPassword("1234");
        model.addAttribute("user",user);
     return "success";
    }
}
