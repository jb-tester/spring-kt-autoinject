package com.mytests.spring.springktautoinject.components

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 **
 * <p>Created by irina on 1/3/2025.</p>
 **
 */
@Component
class CompoZero

@Component
class CompoA(private val compoZero: CompoZero) {
}


@Component
class CompoB(private val compoA: CompoA) {

}
@Component
class CompoC {
@Autowired lateinit var compoB: CompoB

}