package com.example.lovecalculator48.remote

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun calculateLove(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "45b28df03fmsh8eeb628c6f29d40p1d202bjsn47081ca0dc87",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ): retrofit2.Call<LoveModel>
}