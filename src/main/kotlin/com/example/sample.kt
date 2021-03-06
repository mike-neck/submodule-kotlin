package com.example

import com.fasterxml.jackson.databind.ObjectMapper
import kotlin.reflect.KClass


fun main(args: Array<String>) {
    val json = """{
        |  "message_id": 10
        |, "user": {
        |    "user_id": 20
        |  , "name": "太郎"
        |  , "created": "2017-11-02T12:00:00.000"
        |  }
        |, "text": "ウホッいい男"
        |, "created": "2017-12-18T12:00:00.000"
        |}""".trimMargin()
    val mapper = JsonConfig().get()
    val message = mapper.readValue<Message>(json)
    println(message)
}

inline fun <reified T: Any> ObjectMapper.readValue(json: String, kc: KClass<T> = T::class): T = this.readValue(json, kc.java)
