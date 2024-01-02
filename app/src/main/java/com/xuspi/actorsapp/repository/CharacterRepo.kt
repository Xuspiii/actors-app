package com.xuspi.actorsapp.repository

import com.xuspi.actorsapp.retrofit.Character
import com.xuspi.actorsapp.retrofit.CharacterApi

class CharacterRepo(private val characterApi: CharacterApi) {

    suspend fun getCharacters(): List<Character> {
        return characterApi.getCharacters()
    }
}