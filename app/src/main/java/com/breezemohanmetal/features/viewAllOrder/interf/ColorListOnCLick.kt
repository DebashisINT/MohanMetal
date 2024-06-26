package com.breezemohanmetal.features.viewAllOrder.interf

import com.breezemohanmetal.app.domain.NewOrderGenderEntity
import com.breezemohanmetal.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}