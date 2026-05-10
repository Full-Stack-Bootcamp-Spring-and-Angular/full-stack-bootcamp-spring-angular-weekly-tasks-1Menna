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

## 🔐 Spring Security Mastery Roadmap Tasks

This series of tasks demonstrates a progressive journey through implementing **Spring Security** in Spring MVC, moving from basic authentication to advanced, role-aware dynamic interfaces.



<details>
  <summary><b>Task 1: Fundamental RBAC with Default UI</b> 🌟 <a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/main/Task15_Security_1">[LINK]</a></summary>

  ###  Focus: The Foundation
  The starting point of implementing **Role-Based Access Control (RBAC)**.

  ###  Key Implementations
  - **Core Authentication**: Secured the application using Spring's built-in security filters.
  - **Role Definition**: Established specific access rules for `ADMIN` and `SYSTEM` roles.
  - **Zero-XML Config**: Fully configured using Java annotations.

  ### 📸 Preview
  <img src="https://github.com/user-attachments/assets/43d02eed-e315-411d-a075-3c409c9792a1" width="300" alt="Default Login Page">
</details>

 

<details>
  <summary><b>Task 2: UI Customization & Resource Management</b> 🌟 <a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/Task16_Security_2/Task16_Security_2">[LINK]</a></summary>

  ###  Focus: User Experience (UX)
  Moving beyond defaults to create a branded and user-friendly security flow.

  ###  Enhancements
  - **Custom Login Page**: Replaced the default Spring form with a personalized JSP interface.
  - **Static Assets**: Configured `ResourceHandlers` to serve CSS/Images while maintaining security integrity.
  - **Secure Logout**: Implemented proper session invalidation and logout redirection.

  ### 📸 Preview
  <img src="https://github.com/user-attachments/assets/cd4bee9a-37fa-4ccc-9035-dca1b538d52e" width="300" alt="Custom Login Page">
</details>

 

<details>
  <summary><b>Task 3: Advanced Authorization & Dynamic UI Control</b> 🌟 <a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/main/Task17_Security_3">[LINK]</a></summary>

  ###  Focus: Professional UI Logic
  The most advanced stage where the UI becomes **Role-Aware**, providing a seamless and professional experience.

  ###  Advanced Features
  - **Dynamic Content (Security Taglibs)**: The interface now adapts to the user. Admin-specific buttons or sections are hidden/shown based on the logged-in user's roles.
  - **Principal Awareness**: Real-time display of the current **Username** and **Assigned Roles** directly on the dashboard.
  - **Custom Access Denied Page**: Handled the `403 Forbidden` error by redirecting to a custom-designed page for unauthorized attempts.

  ###  Technical Deep-Dive
  - Used `<security:authorize>` for conditional rendering in JSP.
  - Configured `.exceptionHandling().accessDeniedPage("/access-denied")` in the Security Filter Chain.

  ### 📸 Preview
   **1. Role-Based Content & User Info:**
  <br>
  <img src="https://github.com/user-attachments/assets/8bac0fab-981e-4702-93fe-3a14fc1c63cf" width="500" alt="contentBasedOnRole">
  
  <br>

  **2. Custom Access Denied Page:**
  <br>
  <img src="https://github.com/user-attachments/assets/0d982419-b7e4-4854-b183-fd2817d6faf1" width="400" alt="Custom Access Denied Page">
</details>

<details>
  <summary><b>Task 4: Persistence with JDBC Authentication</b> 🚀 <a href="https://github.com/Full-Stack-Bootcamp-Spring-and-Angular/full-stack-bootcamp-spring-angular-weekly-tasks-1Menna/tree/main/Task18_Security_4">[LINK]</a></summary>

  ### Focus:
  Transitioning from In-Memory storage to a persistent **MySQL Database**.

  ### Key Implementations:
  - **JDBC Authentication**: Integrated Spring Security with MySQL for real-time user verification.
  - **Connection Pooling (c3p0)**: Used `ComboPooledDataSource` for efficient database resource management.
  - **Spring Security 5 Format**: Used the `{id}encodedPassword` (e.g., `{noop}`) for modern password storage.
  - **Properties Configuration**: Externalized credentials in `application.properties`.

  ### Schema Preview
  <img src="https://github.com/user-attachments/assets/bf009343-3198-41ae-bd85-867acb5b9b54" width="500" alt="MySQL DB">
</details>

---

