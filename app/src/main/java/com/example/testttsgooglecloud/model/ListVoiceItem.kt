package com.example.testttsgooglecloud.model


/**
 * Data class representing a list of voice items used in speech synthesis or recognition.
 *
 * @property languageCodes The BCP-47 compliant language codes (e.g., "en-US", "ko-KR") representing the supported languages for this voice.
 * @property name The primary name of the voice to be used in STT (Speech-to-Text) or TTS (Text-to-Speech) operations.
 * @property ssmlGender The gender of the voice used in synthesis (e.g., MALE, FEMALE, NEUTRAL).
 * @property naturalSampleRateHertz The sample rate of the voice, in hertz. A higher value indicates better audio quality (default: 24000 Hz).
 */

data class ListVoiceItem(
    val languageCodes: List<String>,
    val name: String,
    val ssmlGender: SsmlVoiceGender,
    val naturalSampleRateHertz: Int,
)


enum class SupportLanguage(val languageCode: String) {
    KR("ko-KR"),
    US("en-US"),
    JP("ja-JP"),
}

enum class SsmlVoiceGender(
    val gender: String
) {
    SSML_VOICE_GENDER_UNSPECIFIED("SSML_VOICE_GENDER_UNSPECIFIED"),
    MALE("male"),
    FEMALE("female"),
    NEUTRAL("neutral")
}