package com.breezemohanmetal.features.viewAllOrder.orderOptimized

import com.breezemohanmetal.app.domain.ProductOnlineRateTempEntity
import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}