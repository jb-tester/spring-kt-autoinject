package com.mytests.spring.springktautoinject.components

import com.mytests.spring.springktautoinject.beans.BeanOne
import com.mytests.spring.springktautoinject.beans.BeanTwo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class CompoTwo {

    private lateinit var bean2: BeanTwo
    private lateinit var bean1: BeanOne

    @Autowired
    constructor(
        bean1: BeanOne,
        bean2: BeanTwo,
    )
    {
        this.bean1 = bean1
        this.bean2 = bean2
    }

    constructor()


}
