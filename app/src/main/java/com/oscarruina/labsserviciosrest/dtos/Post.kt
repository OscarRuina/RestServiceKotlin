package com.oscarruina.labsserviciosrest.dtos

import com.squareup.moshi.JsonClass

//Genero un adapter para deserializar/serializar json en un tipo particular
@JsonClass(generateAdapter = true)
data class Post(
    var id: Int?,
    var title: String,
    var body: String,
    var userId: Int,
)
