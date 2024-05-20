<a name="readme-top"></a>

<!-- PROJECT SHIELDS -->

[![Java][Java]][Java-url]
[![Spring-boot][Spring-boot]][Spring-boot-url]
[![Postgresql][Postgresql]][Postgresql-url]


<h3 align="center">Task Management API</h3>

  <p align="center">
    A simple web API for a task management service
    <br />
  </p>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#testing-endpoints">Testing Endpoints</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

A simple task management api to register, authenticate users as well as create, read and update tasks.

This API provide endpoints for:
* User registration
* User authentication
* Task Management CRUD

All API input/output data are in JSON format

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

The project is developed using the following technologies.

* [![Java][Java]][Java-url]
* [![Spring-boot][Spring-boot]][Spring-boot-url]
* [![Postgresql][Postgresql]][Postgresql-url]

[//]: # (* [![Postman][Postman]][Postman-url])


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
* Java Development Kit (JDK): Ensure JDK 17 or later is installed.
* Maven: Ensure Maven is installed for dependency management.
* IDE: Use an Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.
* Database: Ensure a PostgreSQL database is installed and running.
* Maven


### Installation

To run project locally:

1. Clone the repo
   ```sh
   git clone https://github.com/dapperGeek/task-manager.git
   cd task-manager
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Project Structure
```sh
task-manager/
        ├── src/
        │   ├── main/
        │   │   ├── java/
        │   │   │   └── com/geek0/taskmanager/
        │   │   │       ├── config/
        │   │   │       │   ├── SecurityConfig.java
        │   │   │       │   └── JwtAuthenticationFilter.java
        │   │   │       │   └── SwaggerConfig.java
        │   │   │       ├── controller/
        │   │   │       │   └── AuthController.java
        │   │   │       ├── model/
        │   │   │       │   └── User.java
        │   │   │       │   └── Task.java
        │   │   │       ├── repository/
        │   │   │       │   └── UserRepository.java
        │   │   │       │   └── TaskRepository.java
        │   │   │       ├── service/
        │   │   │       │   └── UserService.java
        │   │   │       │   └── TaskService.java
        │   │   │       └── util/
        │   │   │           └── JwtUtil.java
        │   │   ├── resources/
        │   │   │   ├── application.properties
        │   │   │   └── schema.sql
        │   └── test/
        │       └── java/
        │           └── com/geek0/crudapi/
        └── pom.xml
```

2. Configure Database
```sh
psql -U [postgres user]
CREATE DATABASE task-manager;
GRANT ALL PRIVILEGES ON DATABASE crud_api_db TO [crud_user];
\c task-manager;
```

3. Configure Application Properties
   Update src/main/resources/application.properties:
```shell
spring.datasource.url=jdbc:postgresql://localhost:5432/task-manager
spring.datasource.username=user
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
jwt.secret=mySecretKey
jwt.expiration=86400000

```

4. Run the Application

Use Maven to build and run the application:
```shell
mvn clean install
mvn spring-boot:run

```

### Project Components
1. Security Configuration (SecurityConfig.java)
    Configures Spring Security, JWT, CORS, and session management.
2. JWT Authentication Filter (JwtAuthenticationFilter.java) Intercepts requests to authenticate JWT tokens.
3. User Service (UserService.java)  Provides user-related operations such as registration and lookup.
4. Task Service (UserService.java) Provides CRUD implementations for the tasks manager.
5. User Repository (UserRepository.java). Manages data persistence for user entities.
6. Task Repository (TaskRepository.java). Manages data persistence for task entities
7. Auth Controller (AuthController.java). Handles user registration and login endpoints.
8. Task Controller (TaskController.java)
9. JWT Utility (JwtUtil.java). Manages JWT token creation, validation, and extraction.

### Testing Endpoints:
Endpoints documentation and testing is implemented via swagger-ui. Once app is launched, swagger is available at
localhost:8080/swagger-ui/index.html

The tasks CRUD urls are protected and can only be accessed when authenticated.

1. User registration
   ```shell
      url: loacalhost:8080/auth/register
   {
    "username": "string",
    "password": "stringst",
    "email": "string"
    }
    ```
2. User authentication: Registered user details can be used to authenticate the login url. Once authenticated, the returned token can be used to authenticate on the swagger ui to access the task crud endpoints.
   ```shell
      url: loacalhost:8080/auth/login
   {
    "username": "string",
    "password": "stringst"
    }
    ```
3. 

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/uthman-a-bakar/
[product-screenshot]: images/screenshot.png


[Spring-boot]:https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot
[Spring-boot-url]: https://spring.io/projects/spring-boot
[Java]:https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white
[Java-url]: https://java.com
[Postgresql]:https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[Postgresql-url]: https://postgresql.org
[Docker]:https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white
[Docker-url]: https://docker.com
[Postman]:https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white
[Postman-url]: https://postman.com