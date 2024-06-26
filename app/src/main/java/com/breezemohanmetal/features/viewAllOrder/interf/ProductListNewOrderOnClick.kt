package com.breezemohanmetal.features.viewAllOrder.interf

import com.breezemohanmetal.app.domain.NewOrderGenderEntity
import com.breezemohanmetal.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}