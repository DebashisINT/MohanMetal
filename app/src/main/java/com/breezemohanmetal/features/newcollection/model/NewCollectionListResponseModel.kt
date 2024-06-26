package com.breezemohanmetal.features.newcollection.model

import com.breezemohanmetal.app.domain.CollectionDetailsEntity
import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}