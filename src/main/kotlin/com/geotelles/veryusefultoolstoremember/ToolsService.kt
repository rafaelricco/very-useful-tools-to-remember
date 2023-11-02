package com.geotelles.veryusefultoolstoremember

import org.springframework.stereotype.Service

@Service
class ToolsService(
    private val toolsRepository: ToolsRepository
) {
    fun getAll() : List<Tool> {
        return toolsRepository.getAll()
    }

    fun getByTag(tag: String) : List<Tool> {
        return toolsRepository.getByTag("%$tag%")
    }

    fun create(tool: Tool) : Tool {
        return toolsRepository.save(tool)
    }

    fun delete(id: Int) {
        toolsRepository.deleteById(id)
    }
}