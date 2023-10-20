package com.geotelles.veryusefultoolstoremember

import org.springframework.stereotype.Repository

@Repository
class ToolsRepositoryFake : ToolsRepository {

    var bancoDeDados = HashMap<Int, Any>()

    val listTools = mutableListOf(
        Tool(
            1,
            "Notion",
            "https://notion.so",
            "All in one tool to organize teams and ideas. Write, plan, collaborate, and get organized.",
            tags = listOf(
                "organization",
                "planning",
                "collaboration",
                "writing",
                "calendar"
            )
        ),
        Tool(
            2,
            "json-server",
            "https://github.com/typicode/json-server",
            "Fake REST API based on a json schema. Useful for mocking and creating APIs for front-end devs to consume in coding challenges.",
            tags = listOf(
                "api",
                "json",
                "schema",
                "node",
                "github",
                "rest"
            )
        ),
        Tool(
            3,
            "fastify",
            "https://www.fastify.io/",
            "Extremely fast and simple, low-overhead web framework for NodeJS. Supports HTTP2.",
            tags = listOf(
                "web",
                "framework",
                "node",
                "http2",
                "https",
                "localhost"
            )
        )
    )

    override fun getAll(): List<Tool> {
        return listTools
    }

    override fun getByTag(tag: String): List<Tool> {
        return listTools.filter { it.tags.contains(tag) }
    }

    override fun create(tool: Tool): Tool {
        val maxId = listTools.maxOf { it.id }
        tool.id = maxId + 1
        listTools.add(tool)
        return tool
    }

    override fun delete(id: Int) {
        listTools.removeIf { it.id == id }
    }
}