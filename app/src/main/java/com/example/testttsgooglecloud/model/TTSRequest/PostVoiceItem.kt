package com.example.testttsgooglecloud.model.TTSRequest


data class PostVoiceItem(
    val customVoice: CustomVoice,
    val languageCode: SupportLanguage,
    val name: String,
    val ssmlGender: String
)

enum class SupportLanguage(val languageCode: String) {
    KR(languageCode = "ko-KR"),
    US(languageCode = "en-US"),
    JP(languageCode = "ja-JP"),
}

data class CustomVoice(
    val model: String,
    val reportedUsage: List<String>
)