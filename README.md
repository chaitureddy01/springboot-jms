# Spring Boot JMS Demo

## Overview

This project demonstrates asynchronous messaging using Java Message Service (JMS) with Spring Boot.

## Technologies Used

- Java 17
- Spring Boot
- Spring JMS
- Maven
- ActiveMQ

## Features

- Send messages to a JMS queue
- Receive messages from a JMS queue
- REST API to publish messages
- Asynchronous message processing

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── controller
│   │       ├── producer
│   │       ├── consumer
│   │       └── SpringBootJmsApplication.java
│   └── resources
│       └── application.properties
└── test
```

## How to Run

1. Start the ActiveMQ broker.
2. Run the Spring Boot application.
3. Use Postman to call the REST endpoint.
4. Verify the message is received in the console.

## Tech Stack

- Spring Boot
- Spring JMS
- ActiveMQ
- Maven
- Java 17

## Author

**Chaitanya Reddy**
