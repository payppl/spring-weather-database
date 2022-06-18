package com.plwb.WeatherWA.Weather.WeatherObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetricRFT {
    @JsonProperty(value = "Value")
    private int Value;
    @JsonProperty(value = "Phrase")
    private String Phrase;

    public int getValue() {
        return Value;
    }

    public String getPhrase() {
        return Phrase;
    }

    public void setValue(int value) {
        Value = value;
    }

    public void setPhrase(String phrase) {
        Phrase = phrase;
    }
}
