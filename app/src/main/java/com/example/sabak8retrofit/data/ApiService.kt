package com.example.sabak8retrofit.data

import retrofit2.http.GET

interface ApiService {
    @GET("/api/v2/facts/today")
    suspend fun getFact():FactTody
}
