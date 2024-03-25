package com.ziko.chucknorrisjoke.data.datasource.retrofit.entity

import com.google.gson.annotations.SerializedName
import com.ziko.chucknorrisjoke.domain.entity.IJoke
import com.ziko.chucknorrisjoke.domain.entity.IJokeList

data class ApiJokeList(
    @SerializedName("total")
    override val total: Int,
    @SerializedName("result")
    override val jokes: List<IJoke>
) : IJokeList