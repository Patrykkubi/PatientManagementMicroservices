# Patient Management Microservices System

A backend distributed system built with Spring Boot demonstrating microservices architecture, event-driven communication, API Gateway routing, authentication, and inter-service communication using Kafka and REST.

<img width="1536" height="1024" alt="architecture" src="https://github.com/user-attachments/assets/cca22a22-b977-4d15-960d-9f969ba33846" />

## Key Features

- Microservices architecture with independent services
- API Gateway as a single entry point
- JWT-based authentication
- Kafka-based event-driven communication
- REST-based inter-service communication (Feign/WebClient)
- Dockerized services

## Architecture

This system consists of multiple independent microservices:

- API Gateway – single entry point for all requests
- Auth Service – handles authentication and JWT token generation
- Patient Service – manages patient data
- Billing Service – handles billing/account creation logic
- Analytics Service – processes events and analytics data
- API Requests Service – internal test communication layer

Communication patterns:
- REST (Spring Web / WebClient)
- Kafka (event-driven messaging)
- JWT authentication via API Gateway
  
  
## Tech Stack

- Java 17+
- Spring Boot
- Spring Cloud Gateway
- Spring Security + JWT
- Spring WebFlux / WebClient
- Kafka
- Docker
- Maven
- PostgreSQL

## System Design

The system is designed using a microservices architecture where each service is independently deployable.

### Key design decisions:
- API Gateway handles routing and authentication
- Services communicate via REST and Kafka events
- Each service has its own database (if needed)
- Loose coupling between services

Example flow:

1. User registers via API Gateway
2. Auth Service issues JWT token
3. Patient Service creates patient record
4. Billing Service is triggered via REST/Kafka
5. Analytics Service consumes events asynchronously

## Services Overview

### API Gateway
Routes all incoming requests and handles authentication filters.

### Auth Service
Responsible for:
- User authentication
- JWT token generation

### Patient Service
Handles:
- Patient CRUD operations
- Business logic for patient management

### Billing Service
Handles billing account creation and processing.

### Analytics Service
Consumes Kafka events and processes analytics data.
