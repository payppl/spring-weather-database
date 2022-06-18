package com.plwb.WeatherWA.Weather.WeatherController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.plwb.WeatherWA.Weather.WeatherMainObject.WeatherList;

@Controller
public class WeatherController {

    @GetMapping(value = "/weather")
    public ModelAndView getWeathertemp() {
        ModelAndView mav = new ModelAndView("/weather");
        RestTemplate restTemplate = new RestTemplate();
        final String result = "http://dataservice.accuweather.com/currentconditions/v1/264351?apikey=XIK1bDCRoCYuJSpPjJ48KJEGClAJZkRs&language=pl-PL&details=true";
        ResponseEntity<WeatherList[]> response = restTemplate.getForEntity(result, WeatherList[].class);
        WeatherList[] list = response.getBody();
        mav.addObject("realfeel", list[0].getRealfeeltemps().getMetric());
        System.out.println(list[0].getRealfeeltemps().getMetric());
        return mav;
    }
}
