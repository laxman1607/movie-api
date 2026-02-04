# Movie REST API – Spring Boot

A simple Java Spring Boot backend application that provides RESTful APIs to manage a collection of movies using in-memory storage. This project demonstrates basic REST API design with input validation and layered architecture.

---

## 🔧 Tech Stack

- Java 17  
- Spring Boot 3.x  
- Gradle  
- Spring Web (REST)  
- Jakarta Bean Validation  
- Lombok  

---

## ✨ Features

- Create a new movie using REST API  
- Fetch a movie by its ID  
- Input validation for required fields  
- In-memory data storage using ArrayList  
- Layered architecture (Controller, Service, Model)  

---

## 📌 API Endpoints

### ➤ Add a Movie

**POST** `/movies`

**Request Body (JSON):**

    {
      "title": "Inception",
      "description": "Sci-fi thriller",
      "genre": "Sci-Fi",
      "rating": 8.8
    }

**Response Example:**

    {
      "id": 1,
      "title": "Inception",
      "description": "Sci-fi thriller",
      "genre": "Sci-Fi",
      "rating": 8.8
    }

---

### ➤ Get Movie by ID

**GET** `/movies/{id}`

**Response Example:**

    {
      "id": 1,
      "title": "Inception",
      "description": "Sci-fi thriller",
      "genre": "Sci-Fi",
      "rating": 8.8
    }

---

## ▶️ Run Locally

### Prerequisites

- Java 17 installed  
- Gradle installed (or use Gradle Wrapper)  

### Steps

    ./gradlew bootRun

Server will start at:

    http://localhost:8080

---

## 🗂 Project Structure

    src/main/java/org/example/
    ├── controller/
    │   └── MovieController.java
    ├── service/
    │   └── MovieService.java
    └── model/
        └── Movie.java
    App.java

---

## ⚠️ Notes

- This application uses **in-memory storage**, so all data will be lost when the server restarts.  
- Input validation is implemented using **Jakarta Bean Validation**.  
- This project is intended as a sample backend task / demo API.

---

## 🌐 Live Demo

(Add deployment URL here after hosting on Render)

---

## 👤 Author

**Laxman Yabaji**  
GitHub: https://github.com/laxman1607
