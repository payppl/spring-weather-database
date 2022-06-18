package com.plwb.WeatherWA.Weather.WeatherObjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RealFeelTemps {

    @JsonProperty(value = "Metric")
    private MetricRFT metric;

    public MetricRFT getMetric() {
        return metric;
    }

    public void setMetric(MetricRFT metric) {
        this.metric = metric;
    }

}
