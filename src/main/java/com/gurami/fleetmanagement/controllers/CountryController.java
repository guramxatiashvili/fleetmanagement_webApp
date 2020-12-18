package com.gurami.fleetmanagement.controllers;

import com.gurami.fleetmanagement.models.Country;
import com.gurami.fleetmanagement.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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
    public String addNew(Country country){
        countryService.saveCountry(country);
        return "country";
        //return new ModelAndView("redirect:/countries");
    }

    @RequestMapping("countries/findById")
    @ResponseBody
    public Optional<Country> findById(Integer id){
        return countryService.findById(id);

    }
}
