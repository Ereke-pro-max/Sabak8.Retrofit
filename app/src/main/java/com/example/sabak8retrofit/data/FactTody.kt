package com.example.sabak8retrofit.data

import com.google.gson.annotations.SerializedName

data class FactTody(
    @SerializedName("id")
    val id: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("parmalink")
    val permalink: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("source-url")
    val source_url: String,
    @SerializedName("text")
    val text: String
)