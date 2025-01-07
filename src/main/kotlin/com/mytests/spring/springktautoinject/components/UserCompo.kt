package com.mytests.spring.springktautoinject.components

import org.springframework.stereotype.Component

/**
 **
 * <p>Created by irina on 1/7/2025.</p>
 **
 */
@Component
class UserCompo{
    private final val firstUsedCompo: FirstUsedCompo

    constructor(firstUsedCompo: FirstUsedCompo) {
        this.firstUsedCompo = firstUsedCompo
    }
}
