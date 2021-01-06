package com.gurami.fleetmanagement.controllers;

import com.gurami.fleetmanagement.models.Country;
import org.springframework.stereotype.Controller;

import com.gurami.fleetmanagement.models.Location;
import com.gurami.fleetmanagement.services.CountryService;
import com.gurami.fleetmanagement.services.StateService;
import com.gurami.fleetmanagement.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired	private StateService stateService;
    @Autowired	private CountryService countryService;
    @Autowired  private LocationService locationService;

    @GetMapping("/location")
    public String getStates(Model model) {

        //List<State> stateList = stateService.getStates();
        List<Country> countryList = countryService.getCountries();
        List<Location> locationList = locationService.getLocations();

        model.addAttribute("countries", countryList);
        model.addAttribute("locations", locationList);
        //model.addAttribute("states", stateList);
        return "location";
    }

    @PostMapping("/location/addNew")
    public String addNew(Location location) {
        locationService.save(location);
        return "redirect:/location";
    }

    @RequestMapping("location/findById")
    @ResponseBody
    public Optional<Location> findById(int id) {
        return locationService.findById(id);
    }

    @RequestMapping(value="/location/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/location";
    }

    @RequestMapping(value="/location/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        locationService.delete(id);
        return "redirect:/location";
    }
}
