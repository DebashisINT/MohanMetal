package com.breezemohanmetal.features.lead.api

import com.breezemohanmetal.features.NewQuotation.api.GetQuotListRegRepository
import com.breezemohanmetal.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}