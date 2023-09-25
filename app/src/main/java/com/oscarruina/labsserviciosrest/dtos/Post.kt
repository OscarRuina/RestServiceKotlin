package com.oscarruina.labsserviciosrest.dtos

import com.squareup.moshi.JsonClass

//serializar/deserializar la informacion
@JsonClass(generateAdapter = true)
data class Post(
    var id:Int?,
    var title:String,
    var userId:Int
)
