package com.breezemohanmetal.features.survey.api

import com.breezemohanmetal.features.photoReg.api.GetUserListPhotoRegApi
import com.breezemohanmetal.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}