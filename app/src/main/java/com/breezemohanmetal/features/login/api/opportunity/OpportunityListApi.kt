package com.breezemohanmetal.features.login.api.opportunity

import com.breezemohanmetal.app.NetworkConstant
import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezemohanmetal.features.login.model.productlistmodel.ProductListResponseModel
import com.breezemohanmetal.features.orderITC.SyncDeleteOppt
import com.breezemohanmetal.features.orderITC.SyncEditOppt
import com.breezemohanmetal.features.orderITC.SyncOppt
import com.breezemohanmetal.features.orderITC.SyncOrd
import com.breezemohanmetal.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by Saikat on 20-11-2018.
 */
interface OpportunityListApi {
    @FormUrlEncoded
    @POST("CRMOpportunityDetails/OpportunityStatusList")
    fun getOpportunityStatusList(@Field("session_token") session_token: String): Observable<OpportunityStatusListResponseModel>

    @POST("CRMOpportunityDetails/OpportunityDetailSave")
    fun saveOpportunity(@Body syncOppt: SyncOppt): Observable<BaseResponse>

    @POST("CRMOpportunityDetails/OpportunityDetailEdit")
    fun editOpportunity(@Body syncEditOppt: SyncEditOppt): Observable<BaseResponse>

    @POST("CRMOpportunityDetails/OpportunityDetailDelete")
    fun deleteOpportunity(@Body syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("CRMOpportunityDetails/OpportunityDetailLists")
    fun getOpportunityL(@Field("user_id") user_id: String): Observable<OpportunityListResponseModel>
    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): OpportunityListApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(OpportunityListApi::class.java)
        }
    }
}