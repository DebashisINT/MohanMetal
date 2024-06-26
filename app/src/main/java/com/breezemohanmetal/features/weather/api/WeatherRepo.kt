package com.breezemohanmetal.features.weather.api

import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.task.api.TaskApi
import com.breezemohanmetal.features.task.model.AddTaskInputModel
import com.breezemohanmetal.features.weather.model.ForeCastAPIResponse
import com.breezemohanmetal.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}