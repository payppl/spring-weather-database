package com.plwb.WeatherWA.Weather.WeatherController;

import com.plwb.WeatherWA.Weather.WeatherMainObject.weathercontroller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WeatherController {

    String apikey = "b42fb993aa25b6f11c7ce09803bc33f3";
    String lat = "51.96336";
    String longi = "19.29139";

    @GetMapping(value="/weather")
    public ModelAndView getWeathertemp() {
        ModelAndView mav = new ModelAndView("/weather");
        RestTemplate restTemplate = new RestTemplate();
        final String result = "https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon="
                + longi + "&APPID=" + apikey + "&units=metric&lang=pl";
        ResponseEntity<weathercontroller> response = restTemplate.getForEntity(result, weathercontroller.class);
        mav.addObject("main", response.getBody().getMain());
        mav.addObject("city", response.getBody().getName());
        mav.addObject("weather", response.getBody().getWeather().get(0));
        return mav;
    }
}
