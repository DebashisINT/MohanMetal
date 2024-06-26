package com.breezemohanmetal.features.location.shopRevisitStatus

import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.location.model.ShopDurationRequest
import com.breezemohanmetal.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}