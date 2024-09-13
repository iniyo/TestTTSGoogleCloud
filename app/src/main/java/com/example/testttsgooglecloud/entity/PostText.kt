package com.example.testttsgooglecloud.entity


import com.example.testttsgooglecloud.model.AudioConfig
import com.example.testttsgooglecloud.model.EnableTimePointing
import com.example.testttsgooglecloud.model.Input
import com.example.testttsgooglecloud.model.PostVoiceItem

data class PostText(
    val input: Input,
    val postVoiceItem: PostVoiceItem,
    val audioConfig: AudioConfig,
    val enableTimePointing: EnableTimePointing
)