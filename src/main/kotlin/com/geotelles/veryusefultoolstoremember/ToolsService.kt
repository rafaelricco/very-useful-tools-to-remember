package com.geotelles.veryusefultoolstoremember

class ToolsService(
    private val toolsRepository: ToolsRepository
) {
    fun getAll() : List<Tool> {
        return toolsRepository.getAll()
    }

    fun getByTag(tag: String) : List<Tool> {
        return toolsRepository.getByTag(tag)
    }

    fun create(tool: Tool) : Tool {
        return toolsRepository.create(tool)
    }

    fun delete(id: Int) {
        toolsRepository.delete(id)
    }
}