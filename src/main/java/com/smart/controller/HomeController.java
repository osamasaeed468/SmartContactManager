package com.smart.controller;

import com.smart.dao.UserRepository;
import com.smart.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model)
    {
      //  model.addAttribute("Title","Home - Smart Contact Manager");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model)
    {
       // model.addAttribute("About","About - Smart Contact Manager");
        return "about";
    }






//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping("/test")
//    @ResponseBody
//    public String test() {
//
//        User user = new User();
//        user.setName("Osama Saeed");
//        user.setEmail("osamasaeed@yahoo.com");
//
//        userRepository.save(user);
//        return "Working";
//    }
}
