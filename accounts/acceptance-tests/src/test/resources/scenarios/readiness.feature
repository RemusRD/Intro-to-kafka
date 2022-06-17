Feature: Application readiness
  Scenario: Application is ready
    Given The application is ready
    When I send a GET request to the health endpoint
    Then I should receive a 200 OK response with status UP