package com.mytests.spring.springktautoinject.components

import com.mytests.spring.springktautoinject.beans.BeanOne
import com.mytests.spring.springktautoinject.beans.BeanTwo
import org.springframework.stereotype.Component


@Component
class CompoThree {


    private val bean2: BeanTwo
    private val bean1: BeanOne

    constructor(
        bean1: BeanOne,
        bean2: BeanTwo
    ) {
        this.bean1 = bean1
        this.bean2 = bean2
    }

    fun display() {

        println(bean1.toString())


    }
}
