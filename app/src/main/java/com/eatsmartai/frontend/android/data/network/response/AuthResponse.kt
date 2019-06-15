package com.eatsmartai.frontend.android.data.network.response

import com.eatsmartai.frontend.android.data.db.entity.User

data class AuthResponse(
    val success: Boolean? = null,
    val message: String? = null,
    val user: User? = null,
    val token: String? = null
)