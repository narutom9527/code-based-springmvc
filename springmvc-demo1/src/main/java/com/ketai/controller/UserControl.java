package com.ketai.controller;

import com.ketai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserControl {

    @Autowired
    UserService userService;

    @RequestMapping("/list.html")
    public String userList(Model model){
        model.addAttribute("userList", userService.getUserList());
        return "index";
    }

    @RequestMapping("/test.json")
    public @ResponseBody  Map testJson(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "啊啊");
        map.put("b","哔哔");
        return map;
    }
}
