package com.plwb.WeatherWA.Weather.WeatherMainObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.plwb.WeatherWA.Weather.WeatherObjects.RealFeelTemps;

public class WeatherList {
    @JsonProperty(value = "RealFeelTemperature")
    private RealFeelTemps realfeeltemps;

    public RealFeelTemps getRealfeeltemps() {
        return realfeeltemps;
    }

    public void setRealfeeltemps(RealFeelTemps realfeeltemps) {
        this.realfeeltemps = realfeeltemps;
    }

}
