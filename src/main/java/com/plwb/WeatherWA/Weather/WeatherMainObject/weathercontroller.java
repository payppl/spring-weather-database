package com.plwb.WeatherWA.Weather.WeatherMainObject;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.plwb.WeatherWA.Weather.WeatherObjects.Main;
import com.plwb.WeatherWA.Weather.WeatherObjects.Weather;
import java.util.List;


public class weathercontroller {

    private Main main;

    @JsonProperty(value="weather")
    private List<Weather> weather;

    private String name;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
