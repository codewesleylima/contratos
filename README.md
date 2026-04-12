<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## CONTRACT MANAGEMENT API PROJECT 📋 📑:

#### Description:
REST API developed for contract management, allowing users to register contracts in the database. This project practices the construction of backend applications using Spring Boot, following a layered architecture pattern.

#### Features:
1. 📝 Register new contracts;

#### Technologies Used:
- ☕ Java 26;
- 🍃 Spring Boot 4.0.5;
- 🐘 Gradle;
- 🗃️ JPA/Hibernate;
- 🐬 MySQL;
- 🔒 Lombok;
- ✔️ Spring Validation;

---

## 🛢️ MySQL Database Configuration

### Prerequisites:
Before starting, you will need to have installed:
- Java 26+
- Gradle
- MySQL 8.0+
- Git

---

### Step 1: Create the Database

Connect to MySQL and create a new database:

```sql
CREATE DATABASE contratos_db;
USE contratos_db;
```

---

### Step 2: Configure Environment Variables

The application uses environment variables for database connection. Set the following variables on your system:

**On Windows (Command Prompt):**
```cmd
setx DB_URL "jdbc:mysql://localhost:3306/contratos_db"
setx DB_USER "root"
setx DB_PASSWORD "your_password"
```

**On Windows (PowerShell):**
```powershell
$env:DB_URL = "jdbc:mysql://localhost:3306/contratos_db"
$env:DB_USER = "root"
$env:DB_PASSWORD = "your_password"
```

**On macOS/Linux:**
```bash
export DB_URL="jdbc:mysql://localhost:3306/contratos_db"
export DB_USER="root"
export DB_PASSWORD="your_password"
```

---

### Step 3: Alternative - Application Properties Configuration

If you prefer to configure directly in the application, you can also set the properties in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/contratos_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.open-in-view=false
```

> **Note:** Automatic table creation is enabled with `ddl-auto=update`. Tables will be created automatically when the application starts.

---

## ▶️ Running the Application

### Clone the Repository:
```bash
git clone https://github.com/codewesleylima/contratos
cd contratos
```

### Build and Run with Gradle:

**On Windows:**
```bash
.\gradlew.bat bootRun
```

**On macOS/Linux:**
```bash
./gradlew bootRun
```

The API will be available at:
```
http://localhost:8080
```

---

## 📡 API Usage Examples

You can test the endpoints using tools like:
- **Postman**
- **Insomnia**
- **cURL** (command line)

---

### Available Endpoints:

#### 1️⃣ Register a New Contract
**POST** `/v1/contratos/cadastrar`

Request body:
```json
{
  "cpf": "12345678900",
  "nomeTitular": "João Silva",
  "valorMensal": 2500.00,
  "ativo": true
}
```

cURL Example:
```bash
curl --request POST \
  --url http://localhost:8080/v1/contratos/cadastrar \
  --header 'Content-Type: application/json' \
  --data '{
  "cpf": "12345678900",
  "nomeTitular": "João Silva",
  "valorMensal": 2500.00,
  "ativo": true
}'
```

Response (201 Created):
```json
{
  "contratoId": 1,
  "cpf": "12345678900",
  "nomeTitular": "João Silva",
  "valorMensal": 2500.00,
  "ativo": true
}
```

---

#### 2️⃣ List All Contracts
**GET** `/v1/contratos/listar-todos`

cURL Example:
```bash
curl --request GET \
  --url http://localhost:8080/v1/contratos/listar-todos \
  --header 'User-Agent: insomnia/10.3.1'
```

Response (200 OK):
```json
[
  {
    "contratoId": 1,
    "cpf": "12345678900",
    "nomeTitular": "João Silva",
    "valorMensal": 2500.00,
    "ativo": true
  },
  {
    "contratoId": 2,
    "cpf": "98765432100",
    "nomeTitular": "Maria Santos",
    "valorMensal": 3200.00,
    "ativo": false
  }
]
```

---

## 📂 Project Structure

The project follows a layered architecture pattern:

```
src/
├── main/
│   ├── java/com/wzzy/contrato/
│   │   ├── ContratoApplication.java          # Main Spring Boot application
│   │   ├── controller/
│   │   │   └── ContratoController.java       # HTTP request handlers
│   │   ├── model/
│   │   │   └── ContratoModel.java            # Entity/Domain model
│   │   ├── repository/
│   │   │   └── ContratoRepository.java       # Data access layer
│   │   └── service/
│   │       ├── ContratoService.java          # Service interface
│   │       └── ContratoServiceImpl.java       # Service implementation
│   └── resources/
│       └── application.properties            # Application configuration
└── test/
    └── java/com/wzzy/contrato/
        └── ContratoApplicationTests.java     # Integration tests
```

### Layer Responsibilities:

- **Controller** → Handles HTTP requests and responses
- **Service** → Business logic and application rules
- **Repository** → Database communication and queries
- **Model** → Entity representation and database mapping

---

## 📚 Learning Objectives

This project was developed with focus on learning and practicing:

- ✅ Building REST APIs with Spring Boot
- ✅ MySQL database integration
- ✅ JPA/Hibernate ORM usage
- ✅ Layered architecture pattern
- ✅ Gradle build automation
- ✅ Spring dependency injection
- ✅ RESTful API design principles

---

## ⚠️ Important Notes

- The MySQL database must be running before starting the application
- Tables are created automatically by Hibernate (`ddl-auto=update`)
- Environment variables must be set before running the application (or configure `application.properties`)
- All fields in the contract registration are required
- CPF must be a valid 11-digit string
- The API runs on port 8080 by default

---

## 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesley-lima-244405251/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQEVAsL2UL6A0w/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1721323972268?e=1746662400&v=beta&t=4_2RDPgz5FqJ2G-yRQk3y0vWMVRpSeAPKMAO7IOFXeE" width="100px;" alt="Foto do Wesley Lima"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>  
