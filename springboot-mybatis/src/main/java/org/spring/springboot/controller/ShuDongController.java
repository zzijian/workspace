package org.spring.springboot.controller;

import org.spring.springboot.domain.ShuDong;
import org.spring.springboot.service.ShuDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/shudong")
public class ShuDongController {
    @Autowired
    private ShuDongService shuDongService;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserList(ModelMap map) {
        map.addAttribute("shuDongList",shuDongService.queryAll());
        System.out.println(shuDongService.queryAll());
        return "shudong";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        map.addAttribute("shuDong", new ShuDong());
        map.addAttribute("action", "create");
        return "shuDongForm";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCity(ModelMap map, @ModelAttribute @Valid ShuDong shuDong) {
        shuDongService.insertShuDong(shuDong);
        return "redirect:/shudong/";
    }


}
