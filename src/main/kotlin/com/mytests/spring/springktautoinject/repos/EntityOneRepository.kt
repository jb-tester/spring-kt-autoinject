package com.mytests.spring.springktautoinject.repos

import com.mytests.spring.springktautoinject.EntityOne
import org.springframework.data.repository.CrudRepository

/**
 **
 * <p>Created by irina on 1/3/2025.</p>
 **
 */
interface EntityOneRepository : CrudRepository<EntityOne?, Int?> {

    fun findByTest1(test1: String): MutableList<EntityOne>
}
