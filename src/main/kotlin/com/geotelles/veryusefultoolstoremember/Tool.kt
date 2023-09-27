package com.geotelles.veryusefultoolstoremember

data class Tool(
    val id: Int,
    val title: String,
    val link: String,
    val description: String,
    val tags: List<String>
)
