package com.breezemohanmetal.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.breezemohanmetal.app.AppConstant

@Entity(tableName = AppConstant.CRM_TYPE_MASTER)
data class TypeMasterEntity (
    @PrimaryKey(autoGenerate = true) var sl_no: Int = 0,
    @ColumnInfo var type_id:Int = 0,
    @ColumnInfo var type_name:String = ""
)