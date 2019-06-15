package com.eatsmartai.frontend.android.ui.auth

import com.eatsmartai.frontend.android.data.db.entity.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}