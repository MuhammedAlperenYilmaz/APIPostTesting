
# API Post Request Test Automation

Welcome to the API Post Request test automation project! This project demonstrates how to automate API post requests using RestAssured in Java. The code sends a post request to a specified URL with a JSON request body, validates the response, and performs assertions on the returned data.

## Table of Contents

- [Project Description](#project-description)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Scenario](#scenario)
    - [Test Scenario](#test-scenario)

## Project Description

This code automates API post requests using RestAssured in Java. It constructs a JSON request body, sends a post request to a specified URL, and validates the response by performing assertions on the returned data.

## Usage

To use this code:

1. Ensure you have the necessary dependencies installed, including RestAssured.

2. Compile and run the `API_PostRequest` class.

3. The code sends a post request to the specified URL with the JSON request body and validates the response.

## Dependencies

This project relies on the following dependencies:

- **RestAssured**: A Java library that simplifies REST API testing.

To install the dependencies, you can use a build tool such as Maven or Gradle to manage them, or you can install them manually.

## Scenario

### Test Scenario

## Test Scenario: API Post Request Validation

### Objective:
To verify that the API post request is sent successfully and the response data matches the expected data.

### Preconditions:
- Ensure that the RestAssured library is properly installed and configured.

### Test Steps:
1. **Send Post Request:**
    - Construct a JSON request body with specified data.
    - Send a post request to the specified URL with the JSON request body.

2. **Validate Response:**
    - Verify that the response has a content type of JSON and a status code of 201 (Created).
    - Compare the response body with the expected data.

### Expected Results:
- The post request should be sent successfully, and the response should have a content type of JSON and a status code of 201.
- The response body should match the expected data.

### Notes:
- Monitor the execution of the test to ensure that the post request is sent correctly and the response is validated as expected.
- Review the console output and any log files generated by the test for debugging purposes.