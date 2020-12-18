package com.gurami.fleetmanagement.controllers;

import com.gurami.fleetmanagement.models.Country;
import com.gurami.fleetmanagement.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getCountries(Model model){
        List<Country> countryList = countryService.getCountries();
        //pass list of countries to html
        model.addAttribute("countries",countryList);
        return "country";
    }
    @RequestMapping(value = "/countries/addNew", method = RequestMethod.POST)
    @ResponseBody
    public RedirectView addNew(Country country){
        countryService.saveCountry(country);
        //return "/countries";
        //return  "redirect:/countries";
        return new RedirectView("/countries");

    }

    @RequestMapping("countries/findById")
    @ResponseBody
    public Optional<Country> findById(Integer id){
        return countryService.findById(id);
    }

    @RequestMapping(value="/countries/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public RedirectView update(Country country){
        countryService.saveCountry(country);
        //return "countries";
        //return  "redirect:/countries";
        return new RedirectView("/countries");
        //return new ModelAndView("redirect:/countries");
    }

    @RequestMapping(value="/countries/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        countryService.delete(id);
        //return "country";
        return  "redirect:/countries";
        //return new ModelAndView("redirect:/countries");
    }
}
