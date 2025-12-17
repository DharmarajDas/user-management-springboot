# User Management System (Spring Boot)

A beginner-friendly Spring Boot project built step-by-step to understand
core backend concepts like REST APIs, layered architecture, JPA, and MySQL.

---

## 🚀 Tech Stack
- Java 21
- Spring Boot
- Spring Web (REST APIs)
- Spring Data JPA
- MySQL
- Maven
- Postman
- Git & GitHub

---

## 📌 Features (Completed till Step 4)
- Create User (POST)
- Get All Users (GET)
- Get User by ID
- Update User
- Delete User
- Exception Handling
- Database integration using JPA

---

## 🧱 Project Architecture

user-management
├── src
│ └── main
│ ├── java
│ │ └── com.example.usermanagement
│ │ ├── controller
│ │ │ └── UserController.java
│ │ ├── service
│ │ │ └── UserService.java
│ │ ├── repository
│ │ │ └── UserRepository.java
│ │ ├── model
│ │ │ └── User.java
│ │ ├── exception
│ │ │ └── UserNotFoundException.java
│ │ └── UserManagementApplication.java
│ └── resources
│ └── application.properties
├── pom.xml
├── README.md

Postman (Client)
↓ JSON
Controller (REST API)
↓ Java Object
Service (Business Logic)
↓
Repository (JPA)
↓
Hibernate (ORM)
↓ SQL
MySQL Database


