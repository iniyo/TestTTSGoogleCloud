package com.example.testttsgooglecloud.entity


import com.example.testttsgooglecloud.model.TTSRequest.AudioConfig
import com.example.testttsgooglecloud.model.TTSRequest.EnableTimePointing
import com.example.testttsgooglecloud.model.TTSRequest.Input
import com.example.testttsgooglecloud.model.TTSRequest.PostVoiceItem

data class PostText(
    val input: Input,
    val postVoiceItem: PostVoiceItem,
    val audioConfig: AudioConfig,
    val enableTimePointing: EnableTimePointing
)