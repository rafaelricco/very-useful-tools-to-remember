package com.geotelles.veryusefultoolstoremember

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ToolsRepository : CrudRepository<Tool, Int> {
    @Query("SELECT * FROM very_useful_tools.very_useful_tools")
    fun getAll(): List<Tool>

    @Query(
        """
            SELECT * 
            FROM very_useful_tools.very_useful_tools as vst
            WHERE vst.tags LIKE :tag
        """
    )
    fun getByTag(tag: String): List<Tool>
}