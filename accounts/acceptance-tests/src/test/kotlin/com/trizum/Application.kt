package com.trizum

import com.github.kittinunf.fuel.core.FuelManager
import com.trizum.configuration.ContextConfig
import io.cucumber.spring.CucumberContextConfiguration
import jakarta.annotation.PostConstruct
import org.springframework.test.context.ContextConfiguration

@CucumberContextConfiguration
@ContextConfiguration(classes = [ContextConfig::class])
class Application {
    @PostConstruct
    fun init() {
        FuelManager.instance.basePath = "http://localhost:8080"
    }

}
