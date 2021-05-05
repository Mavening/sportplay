package com.lhl.controller;

import com.lhl.dao.UserDao;
import com.lhl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/login")
    @ResponseBody
    public Map<String,Object> login(@RequestBody User user){
        String flag = "false";
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(user);
        User user1 = userDao.getUserByMessage(user.getUsername(),user.getPassword());
        if(user1!=null) flag = "ok";
        map.put("flag",flag);
        map.put("user",user1);
        return map;
    }
}
