# 🍊 REST API with Spring Boot & MySQL Database

This project is a basic CRUD REST API built with Spring Boot and Java 19, designed to manage fruits stored in a MySQL database. It's part of a training task focused on mastering HTTP verbs, relational database integration, and structured exception handling.

## 🧾 Project Overview

- Implements a complete Create, Read, Update, Delete (CRUD) application 🎯  
- Uses MySQL as the persistent relational database 💾  
- Built following the Model-Service-Controller architecture 🧱  
- Includes a centralized `GlobalExceptionHandler` for clean error responses 🛡️  
- Integrates Swagger for live API documentation and testing 💬  

## 🚀 Technologies Used

- Java 19 ☕  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- MySQL Driver 🐬  
- Gradle  
- Swagger UI (via Springdoc OpenAPI)  
- Global Exception Handling with `@RestControllerAdvice`  

## 📦 Package Structure

```
cat.itacademy.s04.t02.n02
├── controllers
├── model
├── services
├── repository
└── exception

```

## 🍍 Entity: Fruit

```java
public class Fruit {
    private int id;
    private String name;
    private int quantityKilos;
}
```

### 🔧 API Endpoints

🟢 POST → /fruits/add
Adds a new fruit to the database.

```
json
{
  "name": "Strawberry",
  "quantityKilos": 10
}

```

🟡 PUT → /fruits/update
Updates an existing fruit based on its ID.

```
json
{
  "id": 3,
  "name": "Apple",
  "quantityKilos": 15
}

```

🔴 DELETE → /fruits/delete/{id}
Deletes a fruit by its ID.
```

Example: /fruits/delete/2

```

🔍 GET → /fruits/getOne/{id}
Returns a single fruit by its ID.

```
Example: /fruits/getOne/5

```

📄 GET → /fruits/getAll
Returns a list of all fruits stored.


### 📚 Resources Used
Spring Boot CRUD Operations using MySQL Database

Spring Boot MySQL CRUD Example - Java Guides

### 🛡️ Error Handling

All errors are managed through a custom GlobalExceptionHandler, which returns consistent JSON responses for exceptions like:

Entity not found ❌

Invalid input data 📛

Duplicate entries ♻️

### 📖 Swagger UI
You can explore and test the API using Swagger at:

🔗 http://localhost:8080/swagger-ui/index.html

Swagger is powered by Springdoc OpenAPI and automatically generates documentation based on your controller methods.

### 🧪 How to Run
Make sure your MySQL server is running and the database is created. Then configure your application.properties:


properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Run the application:


bash
./gradlew bootRun
