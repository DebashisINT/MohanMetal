package com.breezemohanmetal.features.activities.api

import com.breezemohanmetal.features.member.api.TeamApi
import com.breezemohanmetal.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}