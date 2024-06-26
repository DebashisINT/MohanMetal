package com.breezemohanmetal.features.viewAllOrder.interf

import com.breezemohanmetal.app.domain.NewOrderProductEntity
import com.breezemohanmetal.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}