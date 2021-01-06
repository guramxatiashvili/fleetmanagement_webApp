package com.gurami.fleetmanagement.controllers;

import com.gurami.fleetmanagement.models.Country;
import com.gurami.fleetmanagement.models.State;
import com.gurami.fleetmanagement.services.StateService;
import com.gurami.fleetmanagement.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @Autowired	private StateService stateService;
    @Autowired	private CountryService countryService;


    @GetMapping("/state")
    public String getStates(Model model) {
        List<State> stateList = stateService.getStates();
        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries", countryList);

        return "state";
    }

    @PostMapping("/state/addNew")
    public String addNew(State state) {
        stateService.save(state);
        return "redirect:/state";
    }

    @RequestMapping("state/findById")
    @ResponseBody
    public Optional<State> findById(int id) {
        return stateService.findById(id);
    }

    @RequestMapping(value="/state/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(State state) {
        stateService.save(state);
        return "redirect:/state";
    }

    @RequestMapping(value="/state/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        stateService.delete(id);
        return "redirect:/state";
    }
}
