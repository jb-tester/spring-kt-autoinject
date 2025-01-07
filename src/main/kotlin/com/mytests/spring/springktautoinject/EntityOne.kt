package com.mytests.spring.springktautoinject

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class EntityOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Int? = null

    private val test1: String? = null
    private val test2: String? = null
    private val test3 = 0
}
