package com.example.testttsgooglecloud.model.TTSRequest

/**
 * Data class representing the configuration for audio synthesis.
 *
 * @property audioEncoding The format in which the audio will be encoded, such as MP3 or LINEAR16.
 * @property speakingRate The rate of speech (default is 1.0). A value of 2.0 means the speech is twice as fast as normal.
 * @property pitch The pitch level of the speech, measured in semitones. A value of 0 is normal, with positive values increasing pitch and negative values lowering it.
 * @property volumeGainDb The volume gain in decibels. Positive values increase the volume, negative values decrease it.
 * @property sampleRateHertz The sample rate of the audio in hertz (Hz). Higher values yield better sound quality.
 * @property effectsProfileId The audio effects profile that applies specific tuning for different device classes, such as wearable or handset.
 */

data class AudioConfig(
    val audioEncoding: AudioEncoding,
    val speakingRate: Number,
    val pitch: Number,
    val volumeGainDb: Number,
    val sampleRateHertz: Int,
    val effectsProfileId: SupportAudioProfile,
)

/**
 * Enum class representing different audio profiles for various device types.
 */
enum class SupportAudioProfile(val profileName: String) {
    /** 스마트시계 및 기타 웨어러블 기기 (예: Apple Watch, Wear OS 시계) */
    WEARABLE_CLASS_DEVICE("wearable-class-device"),

    /** 스마트폰 (예: Google Pixel, Samsung Galaxy, Apple iPhone) */
    HANDSET_CLASS_DEVICE("handset-class-device"),

    /** 오디오 재생용 이어폰 또는 헤드폰 (예: Sennheiser 헤드폰) */
    HEADPHONE_CLASS_DEVICE("headphone-class-device"),

    /** 소형 가정용 스피커 (예: Google Home Mini) */
    SMALL_BLUETOOTH_SPEAKER_CLASS_DEVICE("small-bluetooth-speaker-class-device"),

    /** 스마트 홈 스피커 (예: Google Home) */
    MEDIUM_BLUETOOTH_SPEAKER_CLASS_DEVICE("medium-bluetooth-speaker-class-device"),

    /** 홈 엔터테인먼트 시스템 또는 스마트 TV (예: Google Home Max, LG TV) */
    LARGE_HOME_ENTERTAINMENT_CLASS_DEVICE("large-home-entertainment-class-device"),

    /** 차량용 스피커 */
    LARGE_AUTOMOTIVE_CLASS_DEVICE("large-automotive-class-device"),

    /** 대화형 음성 응답(IVR) 시스템 */
    TELEPHONY_CLASS_APPLICATION("telephony-class-application")
}


/**
 * Enum class representing different audio encoding formats for text-to-speech output.
 */
enum class AudioEncoding {
    /** Not specified. Will result in `google.rpc.Code.INVALID_ARGUMENT`. */
    AUDIO_ENCODING_UNSPECIFIED,

    /** Uncompressed 16-bit signed little-endian samples (Linear PCM). Audio content returned as LINEAR16 also contains a WAV header. */
    LINEAR16,

    /** MP3 audio at 32kbps. */
    MP3,

    /** MP3 at 64kbps. */
    MP3_64_KBPS,

    /**
     * Opus encoded audio wrapped in an ogg container.
     * The result can be played natively on Android and in browsers (Chrome, Firefox).
     * Offers higher quality than MP3 at a similar bitrate.
     */
    OGG_OPUS,

    /** 8-bit samples using G.711 PCMU/mu-law. Audio content returned as MULAW also contains a WAV header. */
    MULAW,

    /** 8-bit samples using G.711 PCMU/A-law. Audio content returned as ALAW also contains a WAV header. */
    ALAW
}
