package com.ssm.web;


import com.ssm.entity.ShuDong;
import com.ssm.service.impl.ShuDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/shudong")
public class ShuDongController {

    @Autowired
    private ShuDongService shuDongService;

    @ResponseBody
    @RequestMapping(value = "/all")
    public List<ShuDong> getAllShuDong(){
        return shuDongService.queryAll();
    }

    @ResponseBody
    @RequestMapping(value = "/insert")
    public int insertShuDong(){
        return shuDongService.insertShuDong();
    }

}
