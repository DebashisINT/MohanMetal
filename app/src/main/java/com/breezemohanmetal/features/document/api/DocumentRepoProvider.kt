package com.breezemohanmetal.features.document.api

import com.breezemohanmetal.features.dymanicSection.api.DynamicApi
import com.breezemohanmetal.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}