package com.trizum.scenarios

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class Component {
    @PostConstruct
    fun init() {
        println("Component initialized")
    }
}