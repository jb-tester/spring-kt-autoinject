package com.mytests.spring.springktautoinject

import com.mytests.spring.springktautoinject.components.CompoOne
import com.mytests.spring.springktautoinject.components.CompoThree
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKtAutoinjectApplication(
    private val compoThree: CompoThree,
    private val compoOne: CompoOne
): CommandLineRunner {
    override fun run(vararg args: String?) {
        compoThree.display()
        compoOne.display()
    }
}

fun main(args: Array<String>) {
    runApplication<SpringKtAutoinjectApplication>(*args)
}
