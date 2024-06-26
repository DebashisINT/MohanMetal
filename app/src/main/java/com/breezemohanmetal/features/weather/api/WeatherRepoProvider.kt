package com.breezemohanmetal.features.weather.api

import com.breezemohanmetal.features.task.api.TaskApi
import com.breezemohanmetal.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}