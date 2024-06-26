package com.breezemohanmetal.features.newcollectionreport

import com.breezemohanmetal.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}