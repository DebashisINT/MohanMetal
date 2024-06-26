package com.breezemohanmetal.features.viewAllOrder.interf

import com.breezemohanmetal.app.domain.NewOrderGenderEntity
import com.breezemohanmetal.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}