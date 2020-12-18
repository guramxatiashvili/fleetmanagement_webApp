package com.gurami.fleetmanagement.controllers;

import com.gurami.fleetmanagement.models.State;
import com.gurami.fleetmanagement.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping("/states")
    public String getStates(Model model){
        List<State> stateList = stateService.getStates();
        //pass list of states to html
        model.addAttribute("states",stateList);
        return "state";
    }
    @RequestMapping(value = "/states/addNew", method = RequestMethod.POST)
    @ResponseBody
    public RedirectView addNew(State state){
        stateService.saveState(state);
        return new RedirectView("/states");

    }

    @RequestMapping("states/findById")
    @ResponseBody
    public Optional<State> findById(Integer id){
        return stateService.findById(id);
    }

    @RequestMapping(value="/states/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public RedirectView update(State state){
        stateService.saveState(state);
        return new RedirectView("/states");
    }

    @RequestMapping(value="/states/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        stateService.delete(id);
        return  "redirect:/states";
    }
}
