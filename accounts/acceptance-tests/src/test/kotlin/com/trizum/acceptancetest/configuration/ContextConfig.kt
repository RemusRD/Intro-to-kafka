package com.trizum.acceptancetest.configuration

import java.io.File
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.testcontainers.containers.DockerComposeContainer
import org.testcontainers.containers.wait.strategy.Wait


@Configuration
public class ContextConfig {
    @Bean
    fun dockerCompose() = DockerComposeContainer(
        File("../docker-compose.yml")
    ).withExposedService(
        "accounts", 8080
    ).apply {
        start()
    }
}