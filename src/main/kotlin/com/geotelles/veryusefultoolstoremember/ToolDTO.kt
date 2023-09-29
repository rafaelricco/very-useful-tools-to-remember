package com.geotelles.veryusefultoolstoremember

data class ToolDTO(
    var title: String,
    var link: String,
    var description: String,
    var tags: List<String>
) {
    fun toDomain() : Tool {
        return Tool(
            title = this.title,
            link = this.link,
            description = this.description,
            tags = this.tags
        )
    }
}

fun Tool.toDTO() : ToolDTO = ToolDTO(
    title,
    link,
    description,
    tags
)