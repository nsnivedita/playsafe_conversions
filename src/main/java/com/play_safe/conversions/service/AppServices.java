package com.play_safe.conversions.service;

import org.springframework.stereotype.Service;

@Service
public class AppServices {

    public double covertIntoCelsius(double kelvin){
        double celsius = kelvin - 273.13;
        return celsius;
    }

    public  double convertIntoKelvin(double celsius){
        double kelvin = celsius + 273.13;
        return kelvin;
    }

    public double convertIntoKiloMeter(double miles){
        double km = miles * 1.60934;
        return km;
    }

    public double convertIntoMiles(double km){
        double miles = (km) / 1.60934;
        return miles;
    }
}
