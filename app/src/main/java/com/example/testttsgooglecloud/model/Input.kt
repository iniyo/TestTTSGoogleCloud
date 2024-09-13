package com.example.testttsgooglecloud.model


data class Input(
    // Union field input_source can be only one of the following:
    val ssml: String,
    val text: String
    // End of list of possible types for union field input_source.
)