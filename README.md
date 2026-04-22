## Spring & Java Backend: Hands-on Tasks & Projects

This repository is a comprehensive collection of weekly tasks and projects focused on mastering the **Java Spring Ecosystem**. It tracks my progress through foundational and advanced concepts—from Core IoC/DI to building secure, production-ready RESTful APIs.

---

## 🗺️ Learning Roadmap & Skills
* **Core Concepts**: Inversion of Control (IoC), Dependency Injection (DI), and Bean Lifecycle.
* **Web Development**: Spring MVC, Request Mapping, and Form Validation with JSR-303.
* **Data Persistence**: JDBC, Hibernate ORM (Mapping & HQL), and Spring Data JPA.
* **Build Tools**: Maven dependency management and project lifecycle.
* **API Design**: Developing RESTful Web Services with Spring Boot.
* **Security**: Authentication & Role-Based Authorization (RBAC) using Spring Security.

---
## Featured Projects:

<details>
   <summary><b>🚀 <a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/main/Project1">Project1: Product Management System (Maven + SpringMVC + Hibernate)</a></b></summary>

   ### 📝 Project Overview
   A comprehensive CRUD application developed to manage product inventories. This project demonstrates the seamless integration of **Spring MVC** for request handling and **Hibernate ORM** for database persistence, all managed via **Maven**.

   ### 🛠 Key Features
   - **Full CRUD Functionality**: Create, Read, Update, and Delete products.
   - **Advanced Form Handling**: Uses `@Valid` for server-side validation and `@InitBinder` for custom date formatting.
   - **Entity Mapping**: Implements a **One-to-One** relationship between `Product` and `Product_Details`.
   - **Transaction Management**: Ensures data consistency using `@Transactional`.

   ### 🏗 Architecture & Design
   The project follows a strict **Layered Architecture**:
   1. **Controller**: Manages web requests and navigation.
   2. **Service Layer**: Contains business logic and transactional boundaries.
   3. **DAO (Data Access Object)**: Handles Hibernate sessions and HQL queries.
   4. **Model**: Database entities mapped with Hibernate annotations.

   ### 💻 Tech Stack
   - **Backend**: Spring MVC, Hibernate, Java.
   - **Frontend**: JSP, JSTL, Bootstrap.
   - **Build Tool**: Maven.
   - **Database**: MySQL.

  ### 📸 Project Screenshots
  *Here is a look at the application in action:*
  
  #### 1. Home Page (Product Listing)
  <img src="https://github.com/user-attachments/assets/471dc5e1-1dfe-46c4-989b-997b729d1e0e" width="700" alt="Home Page">
  
  #### 2. Add Product Form
  <img src="https://github.com/user-attachments/assets/1090c406-f449-41d7-8d2b-90f7a9a2ac86" width="500" alt="Product Form">

  #### 3. Update Product Form
  <img src="https://github.com/user-attachments/assets/b0ca5061-d5a6-494c-844e-9073b161239f" width="500" alt="Details Page">
  
  #### 4. Product Details View
  <img src="https://github.com/user-attachments/assets/c41fa2af-2c42-4767-81ad-9f7e488f7209" width="500" alt="Details Page">
</details>

 <details>
   <summary><b>🚀 <a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/project2/Project2">Project2: Product REST API (SpringBoot + Data JPA)</a></b></summary>

   ### 📝 Project Overview
   A modern **RESTful Web Service** built with **Spring Boot** to manage product data. Unlike traditional MVC, this project serves as a backend API that communicates via **JSON**, making it compatible with frontend frameworks like Angular or React.

   ### 🛠 Technical Highlights
   - **Spring Boot**: Leveraging auto-configuration for faster development.
   - **Spring Data JPA**: Utilizes the Repository pattern for abstracting database operations (zero boilerplate SQL/HQL).
   - **REST Controller**: Implements standard HTTP methods (GET, POST, PUT, DELETE).
   - **Postman Integration**: Tested all endpoints to ensure correct JSON request/response handling.

   ### 📑 API Endpoints
   | Action | Method | Endpoint | Description |
   | :--- | :--- | :--- | :--- |
   | **Create** | `POST` | `/product` | Adds a new product (Expects JSON body). |
   | **Read** | `GET` | `/product/{id}` | Fetches a single product by its Path Variable. |
   | **Update** | `PUT` | `/product/{id}` | Updates existing product details. |
   | **Delete** | `DELETE` | `/product?id=x` | Removes a product via Request Parameter. |
   | **List All** | `GET` | `/products` | Returns a full JSON list of available products. |
 
   ### 💻 Tech Stack
   - **Framework**: Spring Boot.
   - **Persistence**: Spring Data JPA.
   - **Database**: MySQL.
   - **Data Format**: JSON (via Jackson).

</details>

---

## Security Tasks

<details>
   <summary><b>🔐 Task1: Security - Role based Access with <code>Default</code> Login Page</b> 🌟<a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/main/Task15_Security_1">[LINK]</a></summary>

   ### 📝 Description
   A Spring MVC application demonstrating **Role-Based Access Control (RBAC)** using Spring Security and Java annotations.

   ### 🔑 Access Rules
   - **Admin Page**: Restricted to `ADMIN` role.
   - **System Page**: Restricted to `SYSTEM` role.
   - **Login**: Secured via Spring Security **Default Login Page**.

   ### 💻 Tech Stack
   - Spring MVC & Spring Security.
   - JSP Views.
   - Java-based Configuration (Zero XML).

   ### 📸 default Login Page Screenshot
   <img src="https://github.com/user-attachments/assets/43d02eed-e315-411d-a075-3c409c9792a1" width="300" alt="login Page">

</details>

<details>
   <summary><b>🔐 Task2: Security - Role based Access with <code>CUSTOM</code> Login Page</b>🌟<a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/Task16_Security_2/Task16_Security_2">[LINK]</a> </summary>

   ### 📝 Description
   An enhanced Spring MVC Security application featuring a personalized user interface and static resource management.

   ### 🌟 New Features
   - **Custom Login**: Replaced the default form with a **Custom JSP Login Page** for better UX.
   - **Static Resources**: Enabled `ResourceHandlers` to serve CSS, images, and JS files.
   - **Logout Functionality**: Implemented a secure logout process with session invalidation.

   ### 🔑 Access Rules
   - **Admin/System Pages**: Restricted by specific roles (`ADMIN`/`SYSTEM`).
   - **Permit All**: Access allowed for custom login and static resources (`/resources/**`).

   ### 💻 Tech Stack
   - Spring MVC & Spring Security.
   - Java Configuration (Zero XML).
   - JSP & Static Resources (CSS/Images).

   ### 📸 Custom Login Page Screenshot
   <img src="https://github.com/user-attachments/assets/cd4bee9a-37fa-4ccc-9035-dca1b538d52e" width="300" alt="login Page">
   
</details>

