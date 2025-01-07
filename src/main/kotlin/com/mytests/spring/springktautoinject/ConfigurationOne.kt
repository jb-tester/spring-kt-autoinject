package com.mytests.spring.springktautoinject

import com.mytests.spring.springktautoinject.beans.BeanOne
import com.mytests.spring.springktautoinject.beans.BeanTwo
import com.mytests.spring.springktautoinject.services.ServiceOne
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 **
 * <p>Created by irina on 1/3/2025.</p>
 **
 */
@Configuration
open class ConfigurationOne {

    @Bean
    open fun bean1(): BeanOne = BeanOne()
    @Bean
    open fun bean2(): BeanTwo = BeanTwo()
}
