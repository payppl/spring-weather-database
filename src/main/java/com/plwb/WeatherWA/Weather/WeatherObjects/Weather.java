package com.plwb.WeatherWA.Weather.WeatherObjects;

public class Weather {

    private String main;
    private String description;

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
