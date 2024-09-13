package com.example.testttsgooglecloud.model


data class EnableTimePointing(
    val timePointType: TimePointType
)

enum class TimePointType (val type: String) {
    UNSPECIFIED("TIMEPOINT_TYPE_UNSPECIFIED"),
    SSML_MARK("SSML_MARK"),
}