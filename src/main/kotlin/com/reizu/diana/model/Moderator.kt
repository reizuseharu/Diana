package com.reizu.diana.model

import com.fasterxml.jackson.annotation.JsonValue

enum class Moderator(@JsonValue val fieldName: String) {

    MODERATOR("moderator"),

    SUPER_MODERATOR("super-moderator")

}
