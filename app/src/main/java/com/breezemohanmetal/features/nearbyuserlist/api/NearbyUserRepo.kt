package com.breezemohanmetal.features.nearbyuserlist.api

import com.breezemohanmetal.app.Pref
import com.breezemohanmetal.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezemohanmetal.features.newcollection.model.NewCollectionListResponseModel
import com.breezemohanmetal.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}