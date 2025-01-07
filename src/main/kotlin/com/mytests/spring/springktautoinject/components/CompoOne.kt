package com.mytests.spring.springktautoinject.components

import com.mytests.spring.springktautoinject.beans.BeanOne
import com.mytests.spring.springktautoinject.beans.BeanTwo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component


@Component
class CompoOne(@Value("foo") var foo: String) {
    @Autowired
    private lateinit var bean2: BeanTwo

    @Autowired
    lateinit var b1: BeanOne


    fun display() {
        println(foo)
        println(b1)
    }


}
