package com.reizu.diana.utility

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

object Resource {

    val OBJECT_MAPPER: ObjectMapper
        get() {
            val objectMapper = jacksonObjectMapper()
            objectMapper.propertyNamingStrategy = PropertyNamingStrategy.KEBAB_CASE

            return objectMapper
        }

}
