package com.breezemohanmetal.features.stockCompetetorStock.api

import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.orderList.model.NewOrderListResponseModel
import com.breezemohanmetal.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezemohanmetal.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}