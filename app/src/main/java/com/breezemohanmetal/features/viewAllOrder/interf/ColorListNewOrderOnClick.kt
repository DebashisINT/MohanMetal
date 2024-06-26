package com.breezemohanmetal.features.viewAllOrder.interf

import com.breezemohanmetal.app.domain.NewOrderColorEntity
import com.breezemohanmetal.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}