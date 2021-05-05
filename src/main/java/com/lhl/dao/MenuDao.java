package com.lhl.dao;

import com.lhl.entity.MainMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDao {
    List<MainMenu> getMenus();

}
