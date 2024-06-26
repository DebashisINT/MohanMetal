package com.breezemohanmetal.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezemohanmetal.app.FileUtils
import com.breezemohanmetal.app.Pref
import com.breezemohanmetal.base.BaseResponse
import com.breezemohanmetal.features.addshop.model.AddLogReqData
import com.breezemohanmetal.features.addshop.model.AddShopRequestData
import com.breezemohanmetal.features.addshop.model.AddShopResponse
import com.breezemohanmetal.features.addshop.model.LogFileResponse
import com.breezemohanmetal.features.addshop.model.UpdateAddrReq
import com.breezemohanmetal.features.contacts.CallHisDtls
import com.breezemohanmetal.features.contacts.CompanyReqData
import com.breezemohanmetal.features.contacts.ContactMasterRes
import com.breezemohanmetal.features.contacts.SourceMasterRes
import com.breezemohanmetal.features.contacts.StageMasterRes
import com.breezemohanmetal.features.contacts.StatusMasterRes
import com.breezemohanmetal.features.contacts.TypeMasterRes
import com.breezemohanmetal.features.dashboard.presentation.DashboardActivity
import com.breezemohanmetal.features.login.model.WhatsappApiData
import com.breezemohanmetal.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}