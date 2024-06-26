package com.breezemohanmetal.features.dashboard.presentation.api.dayStartEnd

import com.breezemohanmetal.features.stockCompetetorStock.api.AddCompStockApi
import com.breezemohanmetal.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}