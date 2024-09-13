package com.example.testttsgooglecloud.entity

import com.example.testttsgooglecloud.model.TTSRequest.AudioConfig


data class ResponseTTS(
    val audioConfig: AudioConfig,
    val audioContent: String,
    val timepoints: List<Any>
)