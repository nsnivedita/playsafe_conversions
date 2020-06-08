package com.play_safe.conversions.controller;

import com.play_safe.conversions.service.AppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/conversion")
public class AppController {

    @Autowired
    AppServices appServices;

    @CrossOrigin
    @GetMapping( value = "/ktoc/{kelvin}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public double convertIntoCelsius( @PathVariable("kelvin") double kelvin) {
        return  appServices.covertIntoCelsius(kelvin);
    }
    @CrossOrigin
    @GetMapping( value = "/ctok/{celsius}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public double convertIntoKelvin( @PathVariable("celsius") double celsius) {
        return  appServices.convertIntoKelvin(celsius);
    }

    @CrossOrigin
    @GetMapping( value = "/mtok/{miles}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public double convertIntoKiloMeter( @PathVariable("miles") double miles) {
        return  appServices.convertIntoKiloMeter(miles);
    }

    @CrossOrigin
    @GetMapping( value = "/ktom/{km}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public double convertIntoMiles( @PathVariable("km") double km) {
        return appServices.convertIntoMiles(km);
    }


}
