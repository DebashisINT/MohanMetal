package com.breezemohanmetal.features.photoReg.present

import com.breezemohanmetal.app.domain.ProspectEntity
import com.breezemohanmetal.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}