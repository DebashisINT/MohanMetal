package com.breezemohanmetal.features.login.model.productlistmodel

import com.breezemohanmetal.app.domain.ModelEntity
import com.breezemohanmetal.app.domain.ProductListEntity
import com.breezemohanmetal.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}