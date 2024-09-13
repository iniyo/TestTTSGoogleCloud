package com.example.testttsgooglecloud.model


data class PostVoiceItem(
    val customVoice: CustomVoice,
    val languageCode: String,
    val name: String,
    val ssmlGender: String
)

data class CustomVoice(
    val model: String,
    val reportedUsage: List<String>
)