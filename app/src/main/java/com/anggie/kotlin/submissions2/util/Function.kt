package com.anggie.kotlin.submissions2.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

    @SuppressLint("SimpleDateFormat")
    fun strToDate(strDate: String?, pattern: String = "yyyy-MM-dd"): Date {
        val format = SimpleDateFormat(pattern)
        val date = format.parse(strDate)

        return date
    }

    @SuppressLint("SimpleDateFormat")
    fun changeFormatDate(date: Date?): String? = with(date?: Date()) {
        SimpleDateFormat("EEE, dd MMM yyy").format(this)
    }
