package com.geotelles.veryusefultoolstoremember

interface ToolsRepository {

    fun getAll(): List<Tool>

    fun getByTag(tag: String): List<Tool>

    fun create(tool: Tool): Tool

    fun delete(id: Int)
}