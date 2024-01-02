package com.xuspi.actorsapp.retrofit

import com.xuspi.actorsapp.retrofit.Character
import retrofit2.http.GET

interface CharacterApi {

    @GET("characters")
    suspend fun getCharacters(): List<Character>
}