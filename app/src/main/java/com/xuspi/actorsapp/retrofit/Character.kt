package com.xuspi.actorsapp.retrofit

import com.squareup.moshi.JsonClass

// import com.squareup.moshi.Json

@JsonClass(generateAdapter = true)
data class Character(

    //@Json(name = "actor")
    val actor: String,
    val image: String
)
