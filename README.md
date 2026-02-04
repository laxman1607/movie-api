# 🎬 Movie REST API – Spring Boot

A simple Java Spring Boot backend application that provides RESTful APIs to manage a collection of movies using in-memory storage. This project demonstrates basic REST API design with input validation and layered architecture. The API is deployed on Render for live testing.

------------------------------------------------
## 🔧 Tech Stack
------------------------------------------------
- Java 17  
- Spring Boot 3.x  
- Gradle  
- Spring Web (REST)  
- Jakarta Bean Validation  
- Lombok  
- Docker (for deployment)  
- Render (cloud hosting)

------------------------------------------------
## ✨ Features
------------------------------------------------
- Create a new movie using REST API  
- Fetch a movie by its ID  
- Input validation for required fields  
- In-memory data storage using ArrayList  
- Layered architecture (Controller, Service, Model)  
- Deployed live on Render

------------------------------------------------
## 🌐 Live URL
------------------------------------------------
Base URL:  
https://movie-api-n5no.onrender.com

Health Check:  
GET https://movie-api-n5no.onrender.com/

------------------------------------------------
## 📌 API Endpoints
------------------------------------------------

➤ Add a Movie  

Live (Render):  
POST https://movie-api-n5no.onrender.com/movies  

Local:  
POST http://localhost:8080/movies  

Request Body (JSON):
```
{
  "title": "Inception",
  "description": "Sci-fi thriller",
  "genre": "Sci-Fi",
  "rating": 8.8
}
```

Response Example:
```
{
  "id": 1,
  "title": "Inception",
  "description": "Sci-fi thriller",
  "genre": "Sci-Fi",
  "rating": 8.8
}
```

🧪 How to Test the API (Postman / curl)

▶️ Using Postman

1.Open Postman

2.Select method: POST

3.Enter URL:

https://movie-api-n5no.onrender.com/movies

4.Add JSON in Body

5.Go to Body → raw → JSON

6.Paste:
```

{
  "title": "Interstellar",
  "description": "Space exploration movie",
  "genre": "Sci-Fi",
  "rating": 9.0
}
```


7.Click Send

------------------------------------------------

➤ Get Movie by ID  

Live (Render):  
GET https://movie-api-n5no.onrender.com/movies/{id}  

Local:  
GET http://localhost:8080/movies/{id}

Response Example:
```
{
  "id": 1,
  "title": "Inception",
  "description": "Sci-fi thriller",
  "genre": "Sci-Fi",
  "rating": 8.8
}
```

------------------------------------------------
## ▶️ Run Locally
------------------------------------------------

Prerequisites:
- Java 17 installed  
- Gradle installed (or use Gradle Wrapper)

Steps:
./gradlew bootRun

Server will start at:
http://localhost:8080

------------------------------------------------
## 🗂 Project Structure
------------------------------------------------


```
app/src/main/java/org/example/
├── controller/
│   ├── HomeController.java
│   └── MovieController.java
├── service/
│   └── MovieService.java
├── model/
│   └── Movie.java
└── App.java

```


------------------------------------------------
## ⚠️ Notes
------------------------------------------------
- This application uses in-memory storage, so all data will be lost when the server restarts.  
- Free Render instance may spin down when inactive (first request can take ~30–50 seconds).  
- This project is intended as a demo/sample backend API.

------------------------------------------------
## 👤 Author
------------------------------------------------
Laxman Yabaji  
GitHub: https://github.com/laxman1607
