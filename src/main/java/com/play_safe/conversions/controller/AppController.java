package com.play_safe.conversions.controller;

import com.play_safe.conversions.service.AppServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/conversion")
@Tag(name = "Conversion System")
public class AppController {

    @Autowired
    AppServices appServices;

    @CrossOrigin
    @GetMapping( value = "/ktoc/{kelvin}", produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(description = "Convert Kelvin passed as path parameter into Celsius")
    public double convertIntoCelsius( @PathVariable("kelvin") double kelvin) {
        return  appServices.covertIntoCelsius(kelvin);
    }
    @CrossOrigin
    @GetMapping( value = "/ctok/{celsius}",produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(description = "Convert Celsius passed as path parameter into Kelvin")
    public double convertIntoKelvin( @PathVariable("celsius") double celsius) {
        return  appServices.convertIntoKelvin(celsius);
    }

    @CrossOrigin
    @GetMapping( value = "/mtok/{miles}", produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(description = "Convert miles passed as path parameter into Kilo meter")
    public double convertIntoKiloMeter( @PathVariable("miles") double miles) {
        return  appServices.convertIntoKiloMeter(miles);
    }

    @CrossOrigin
    @GetMapping( value = "/ktom/{km}", produces = {MediaType.APPLICATION_JSON_VALUE})
    @Operation(description = "Convert Kilo meter passed as path parameter into miles ")
    public double convertIntoMiles( @PathVariable("km") double km) {
        return appServices.convertIntoMiles(km);
    }


}
