package com.breezemohanmetal.features.location.shopRevisitStatus

import com.breezemohanmetal.features.location.shopdurationapi.ShopDurationApi
import com.breezemohanmetal.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}