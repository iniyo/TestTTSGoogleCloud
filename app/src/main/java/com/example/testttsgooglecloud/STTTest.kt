package com.example.testttsgooglecloud

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class STTTest {
    val retrofit: GoogleCloudSTTService = Retrofit.Builder()
        .baseUrl("https://texttospeech.googleapis.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(GoogleCloudSTTService::class.java)

    suspend fun getSpeechToText(text: String) {
        retrofit.getSpeechToText(text)
    }

}