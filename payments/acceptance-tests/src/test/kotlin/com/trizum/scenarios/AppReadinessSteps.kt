package com.trizum.scenarios

import com.github.kittinunf.fuel.core.ResponseResultOf
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.jackson.responseObject
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.springframework.beans.factory.annotation.Autowired
import org.testcontainers.containers.DockerComposeContainer

class AppReadinessSteps {
    private lateinit var response: ResponseResultOf<Map<String, String>>

    @Given("^The application is ready$")
    fun `app is ready`() {
        //
    }

    @When("^I send a GET request to the health endpoint$")
    fun `I send a GET request to the health endpoint`() {
        response = "actuator/health".httpGet().responseObject<Map<String, String>>()
    }

    @Then("^I should receive a 200 OK response with status UP$")
    fun `I should receive a 200 OK response with status UP`() {
        assert(response.second.statusCode == 200)
        assert(response.third.get()["status"] == "UP")
    }
}