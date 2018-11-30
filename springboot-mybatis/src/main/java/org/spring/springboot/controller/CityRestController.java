package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by bysocket on 07/02/2017.
 */
@Controller
@RequestMapping(value = "/city")
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserList(ModelMap map) {
            map.addAttribute("cityList",cityService.findAllCity());
        System.out.println(cityService.findAllCity());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        map.addAttribute("city", new City());
        map.addAttribute("action", "create");
        return "cityForm";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCity(ModelMap map, @ModelAttribute @Valid City city) {
        cityService.insertCity(city);
        return "redirect:/city/";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String getCity(@PathVariable Long id, ModelMap map) {
        map.addAttribute("city", cityService.findCityById(id.intValue()));
        map.addAttribute("action", "update");
        return "cityForm";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putCity(ModelMap map,
                          @ModelAttribute @Valid City city,
                          BindingResult bindingResult) {
        cityService.updateCity(city);
        return "redirect:/city/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteCity(ModelMap map,
                             @PathVariable Long id) {
        cityService.deleteCity(id.intValue());
        return "redirect:/city/";
    }



}
