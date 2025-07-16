
# Drone Communication System (Spring Boot)

A backend system to register drones and log their messages. This project is built using Java Spring Boot and PostgreSQL.

## 🚀 Features

- Register new drones with unique identifiers
- Retrieve message logs per drone
- RESTful API using Spring Boot
- Database persistence with Spring Data JPA
- Cloud-ready (Docker/Heroku compatible)

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (or MySQL)
- Maven

## 📁 Project Structure

```
src/main/java/com/victor/drone/
├── controller/         # API endpoints (DroneController.java)
├── model/              # Entities (Drone.java, Message.java)
├── repository/         # Data access interfaces
├── service/            # Business logic (DroneService.java)
└── config/             # (For future JWT/Auth setup)

src/main/resources/
├── application.yml     # DB and server config
```

## 🧪 API Endpoints

| Method | Endpoint               | Description              |
|--------|------------------------|--------------------------|
| POST   | /api/drones            | Register a new drone     |
| GET    | /api/drones/{id}/messages | Get messages for a drone |

## 📄 Sample Payloads

### POST /api/drones
```json
{
  "identifier": "DRN-001",
  "status": "ACTIVE",
  "location": "Lagos"
}
```

## ⚙️ Setup Instructions

1. Clone the repository:
```bash
git clone https://github.com/handy-vic/drone-communication-system.git
cd drone-communication-system
```

2. Configure PostgreSQL credentials in `src/main/resources/application.yml`.

3. Run the application:
```bash
./mvnw spring-boot:run
```

4. Test API with Postman or browser at `http://localhost:8080/api/drones`

## 🐘 Database Configuration (PostgreSQL)

Create a database named `drones` and update your `application.yml`:
```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/drones
    username: youruser
    password: yourpass
```

## 📦 Future Improvements

- JWT-based authentication
- Drone-to-server messaging via MQTT
- WebSocket live status updates
- Admin dashboard (React frontend)

## 👨‍💻 Author

Victor Ulonnam — [LinkedIn](https://linkedin.com/in/therealvictor)  
Open to tech internships & Java development roles with relocation support.

---

© 2025 Drone Communication System — MIT License
