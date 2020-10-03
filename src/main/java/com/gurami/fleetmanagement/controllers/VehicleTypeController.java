package com.gurami.fleetmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
    @GetMapping("/vehicletype")
    public String getVehicletype(){
        return "vehicleType";
    }
}
