package com.breezemohanmetal.features.login.model.productlistmodel

import com.breezemohanmetal.app.domain.NewOrderScrOrderEntity
import com.breezemohanmetal.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}