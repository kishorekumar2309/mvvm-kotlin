package com.eatsmartai.frontend.android.data.repository

import com.eatsmartai.frontend.android.data.network.RestAPI
import com.eatsmartai.frontend.android.data.network.response.AuthResponse
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {
        return RestAPI().userLogin(email, password)
    }
}