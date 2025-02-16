package com.example.weather_forecast_alisher.models;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {
    @SerializedName("icon")
    String icon;
    @SerializedName("cod")
    Integer cod;
}
