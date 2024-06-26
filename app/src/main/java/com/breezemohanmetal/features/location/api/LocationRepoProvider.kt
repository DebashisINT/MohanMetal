package com.breezemohanmetal.features.location.api

import com.breezemohanmetal.features.location.shopdurationapi.ShopDurationApi
import com.breezemohanmetal.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}