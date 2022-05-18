package com.maylbus.collectives.cleanarchitecturelogin.model

data class User(val name: String, val genre: Genre? = null, val age: Int? = null)

data class Genre(val male: Boolean = false, val female: Boolean = false)