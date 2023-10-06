package com.geotelles.veryusefultoolstoremember

data class Tool(
    var id: Int,
    val title: String,
    val link: String,
    val description: String,
    val tags: List<String>
)
