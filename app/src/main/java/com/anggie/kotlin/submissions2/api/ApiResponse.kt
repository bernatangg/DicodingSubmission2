package com.anggie.kotlin.submissions2.api

import com.anggie.kotlin.submissions2.model.MatchDetail

data class ApiResponse(
        val events: List<MatchDetail>,
        val teams: List<MatchDetail>
)