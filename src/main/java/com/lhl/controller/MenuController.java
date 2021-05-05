package com.lhl.controller;

import com.lhl.dao.MenuDao;
import com.lhl.entity.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuDao menuDao;

    @GetMapping("/getMenus")
    @ResponseBody
    public HashMap<String,Object> getAllMenus(){
        HashMap<String, Object> map = new HashMap<>();
        List<MainMenu> menus = menuDao.getMenus();
        String flag = "false";
        if(menus!=null) {
            map.put("menus",menus);
            flag = "ok";
        }
        map.put("flag",flag);
        return map;
    }
}
