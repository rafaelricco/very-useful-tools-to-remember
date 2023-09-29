package com.geotelles.veryusefultoolstoremember

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/tools")
class ToolsController(
    private val toolsService: ToolsService
) {
    @GetMapping
    fun getAll() : List<Tool> {
        return toolsService.getAll()
    }

    @GetMapping
    fun getByTag(@RequestParam tag: String) : ResponseEntity<List<Tool>> {
        return ResponseEntity.ok().body(toolsService.getByTag(tag))
    }

    @PostMapping
    fun create (@RequestBody tool: Tool, uriBuilder: UriComponentsBuilder) : ResponseEntity<Tool> {
        val toolResponse = toolsService.create(tool)
        val uri = uriBuilder.path("/tools/${toolResponse.id}").build().toUri()
        return ResponseEntity.created(uri).body(toolResponse)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete (@PathVariable id: Int) {
        toolsService.delete(id)
    }





}