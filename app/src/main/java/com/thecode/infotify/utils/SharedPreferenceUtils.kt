package com.thecode.infotify.utils

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceUtils {


    const val IS_ONBOARDING_COMPLETED = "IS_ONBOARDING_COMPLETED"
    const val NIGHT_MODE = "NIGHT_MODE"


    private lateinit var sp: SharedPreferences

    // Editor for Shared preferences
    private lateinit var editor: SharedPreferences.Editor

    // Context
    private lateinit var context: Context

    fun init(mContext: Context) {
        context = mContext
        sp = mContext.getSharedPreferences(AppConstants.SP_APPNAME, 0)
        editor = sp.edit()
    }

    fun clearSession() {
        editor.clear()
        editor.commit()
    }

    fun setIsOnboardingCompleted() {
        editor.putBoolean(IS_ONBOARDING_COMPLETED, true)
        editor.commit()
    }

    fun getIsOnboardingCompleted(): Boolean {
        return sp.getBoolean(IS_ONBOARDING_COMPLETED, false)
    }

    fun isNightModeEnabled(): Boolean {
        return sp.getBoolean(NIGHT_MODE, false)
    }

    fun setIsNightModeEnabled(state: Boolean) {
        editor.putBoolean(NIGHT_MODE, state)
        editor.commit()
    }

}