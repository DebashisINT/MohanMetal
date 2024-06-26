package com.breezemohanmetal.features.viewAllOrder.model

import com.breezemohanmetal.app.domain.NewOrderColorEntity
import com.breezemohanmetal.app.domain.NewOrderGenderEntity
import com.breezemohanmetal.app.domain.NewOrderProductEntity
import com.breezemohanmetal.app.domain.NewOrderSizeEntity
import com.breezemohanmetal.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

