package com.example.weather_forecast_alisher.remote_data;

import com.example.weather_forecast_alisher.models.Model;
import com.example.weather_forecast_alisher.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    String URL_KEY ="b211aae5545e8d3de75404d096930c95";
    String BASE_URL ="https://api.openweathermap.org";
    @GET("/data/2.5/weather")
    Call<Model>
    getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);
    @GET("/data/2.5/weather?q=London&appid=b211aae5545e8d3de75404d096930c95")
    Call<WeatherModel>
    getWeather(
            @Query("q") String name,
             @Query("appid")String key);
}
