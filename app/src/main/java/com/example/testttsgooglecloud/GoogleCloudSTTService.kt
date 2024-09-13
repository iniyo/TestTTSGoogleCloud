package com.example.testttsgooglecloud

import com.example.testttsgooglecloud.entity.PostText
import com.example.testttsgooglecloud.entity.Voices
import com.example.testttsgooglecloud.entity.ResponseTTS
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


// google request type site: https://cloud.google.com/text-to-speech/docs/reference/rest/v1beta1/text/synthesize#TimepointType


interface GoogleCloudSTTService {

    @POST("v1beta1/text:synthesize")
    suspend fun getSpeechToText(
        @Body requestBody: PostText
    ): Response<ResponseTTS>

    @GET("v1beta1/voices")
    suspend fun getSynthesizeVoicesList(): Voices

}