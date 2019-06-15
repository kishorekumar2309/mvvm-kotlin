package com.eatsmartai.frontend.android.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_USER_ID = 0

@Entity
data class User(
    @SerializedName("_id") var id: String? = null,
    var email: String? = null,
    var password: String? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var gender: String? = null,
    var birthDate: String? = null,
    var city: String? = null,
    var zipCode: String? = null,
    var height: Float? = null,
    var weight: Float? = null,
    var createdOn: String? = null,
    @SerializedName("__v") var version: Int? = null
) {
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}