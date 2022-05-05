package com.example

import io.swagger.v3.oas.annotations.media.Schema

@Schema(name = "EncodingEnum")
enum class Encoding {
    HS_256,
    MPEG4
}