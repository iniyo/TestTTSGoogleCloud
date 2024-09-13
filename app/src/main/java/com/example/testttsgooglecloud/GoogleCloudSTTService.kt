package com.example.testttsgooglecloud

import com.example.testttsgooglecloud.entity.Voices
import retrofit2.http.GET
import retrofit2.http.Query


interface GoogleCloudSTTService {

    @GET
    suspend fun getSpeechToText(
        @Query("text") text: String
    )

    @GET
    suspend fun getSynthesizeSpeech(
        @Query("text") text: String
    )

    @GET("v1beta1/voices")
    suspend fun getSynthesizeVoicesList(): Voices

}