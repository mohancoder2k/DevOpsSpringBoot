#  Spring Boot Microservices – Dockerized Deployment

This repository contains a **fully dockerized Spring Boot microservices system**, built as part of **Module 12: Deployment & Containerization**.  
The project demonstrates real-world microservices concepts including service discovery, API gateway routing, inter-service communication, database handling, and Docker containerization.

---

##  Microservices Overview

The system consists of the following services:

- **Eureka Server** – Service discovery & registration  
- **API Gateway** – Central entry point and request routing  
- **Order Service** – Handles order placement  
- **Inventory Service** – Manages product inventory (MySQL-backed)  
- **MySQL** – Database for Inventory Service  

All services are containerized and run on a shared Docker network.

---

##  Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Cloud Netflix Eureka**
- **Spring Cloud Gateway**
- **OpenFeign**
- **Spring Data JPA**
- **MySQL**
- **Docker**

---

##  Key Features Implemented

- 1) Service Discovery & Load Balancing (Eureka)
- 2) API Gateway & Dynamic Routing
- 3) Inter-Service Communication using Feign Client
- 4) Database per Service (Inventory Service with MySQL)
- 5) Dockerizing Spring Boot Microservices
- 6) Docker Networking (container-to-container communication)
- 7) End-to-End request flow through API Gateway

---

##  Project Structure

```text
.
├── api-gateway
├── order-service
├── inventory-service
├── eureka-server
└── README.md
