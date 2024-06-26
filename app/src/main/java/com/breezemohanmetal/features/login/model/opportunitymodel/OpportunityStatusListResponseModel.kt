package com.breezemohanmetal.features.login.model.opportunitymodel

import com.breezemohanmetal.app.domain.OpportunityStatusEntity
import com.breezemohanmetal.app.domain.ProductListEntity
import com.breezemohanmetal.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}