package com.gurami.fleetmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

import javax.xml.crypto.dsig.XMLValidateContext;

@SpringBootApplication

public class FleetmanagementApplication extends WebMvcAutoConfiguration {

    public static void main(String[] args) {
		SpringApplication.run(FleetmanagementApplication.class, args);
	}

}
