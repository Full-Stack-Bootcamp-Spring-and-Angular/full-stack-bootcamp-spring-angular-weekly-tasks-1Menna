## Spring & Java Backend: Hands-on Labs & Tasks

This repository is a comprehensive collection of weekly tasks and labs focused on mastering the **Java Spring Ecosystem**. It tracks my progress from foundational concepts to building secure, production-ready RESTful APIs.

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

