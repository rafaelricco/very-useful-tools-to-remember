package com.geotelles.veryusefultoolstoremember

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "very_useful_tools", schema = "very_useful_tools")
data class Tool(
    @Id
    var id: Int,
    val title: String,
    val link: String,
    val description: String,
    val tags: List<String>
)
