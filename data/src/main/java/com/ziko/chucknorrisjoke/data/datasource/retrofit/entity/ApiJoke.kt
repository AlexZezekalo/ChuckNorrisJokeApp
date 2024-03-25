package com.ziko.chucknorrisjoke.data.datasource.retrofit.entity

import com.google.gson.annotations.SerializedName
import com.ziko.chucknorrisjoke.domain.entity.IJoke

data class ApiJoke(
    @SerializedName("id")
    override val id: String,
    @SerializedName("value")
    override val text: String,
    @SerializedName("icon_url")
    override val iconUrl: String,
    @SerializedName("categories")
    override val category: List<String>,
    @SerializedName("created_at")
    override val createdAt: String,
    @SerializedName("updated_at")
    override val updatedAt: String,
    @SerializedName("url")
    override val webUrl: String,
) : IJoke