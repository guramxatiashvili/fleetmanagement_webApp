package com.gurami.fleetmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    @RequestMapping("/index")
    public String goHome(){

        return "index";
    }
    @RequestMapping("/index.html")
    public String goHomeSecond(){

        return "index";
    }
}
