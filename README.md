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


---

## 🔌 API Endpoints

### ➕ Create User

POST /users

**Request Body**
```json
{
  "name": "Amit",
  "age": 25
}

📄 Get All Users

GET /users

🔍 Get User By ID

GET /users/{id}

✏️ Update User

PUT /users/{id}

❌ Delete User

DELETE /users/{id}

## 🛠 Database Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## 📦 How to Run the Project

mvn spring-boot:run

Server will start at:

http://localhost:8080

##📮 Testing

Tested using Postman

Verified POST, GET, PUT, DELETE operations