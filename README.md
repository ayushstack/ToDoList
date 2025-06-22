
# AJList - Task Management App 📝

AJList is a simple and clean web-based task management (To-Do) application built using **Spring Boot**, **JDBC**, **MySQL**, and **Thymeleaf**. It allows users to add, mark as complete, and delete tasks in a clean Bootstrap-styled interface.

---

## 🚀 Features

- Add new tasks
- Mark tasks as completed
- Delete tasks
- Simple and responsive UI with Bootstrap
- JDBC-based backend with MySQL integration

---

## 🏗️ Technologies Used

- Java 17
- Spring Boot 3.2.5
- Spring JDBC
- Thymeleaf
- MySQL
- Bootstrap 5
- Maven

---

## 📂 Project Structure

```
AJList/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── todolistappjdbc/
│       │       ├── controller/
│       │       │   └── TaskController.java
│       │       ├── dao/
│       │       │   └── TaskDao.java
│       │       ├── model/
│       │       │   └── Task.java
│       │       ├── service/
│       │       │   └── TaskService.java
│       │       └── AjlistApplication.java
│       │
│       ├── resources/
│       │   ├── static/
│       │   │   ├── css/bootstrap.min.css
│       │   │   └── js/bootstrap.bundle.min.js
│       │   ├── templates/
│       │   │   └── tasks.html
│       │   ├── application.properties
│       │   └── applicationContext.xml
│
├── pom.xml
└── README.md
```

---

## 🛠️ Setup Instructions

1. Make sure Java 17+ and Maven are installed on your system.
2. Create a MySQL database named `ajlist_db`.
3. Open `application.properties` and configure your DB:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ajlist_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.cache=false
```

4. Create the tasks table in MySQL:

```sql
CREATE TABLE tasks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    completed BOOLEAN DEFAULT FALSE
);
```

5. Build and run the project:

```bash
mvn clean install
mvn spring-boot:run
```

6. Visit: [http://localhost:8080/tasks](http://localhost:8080/tasks)

---

## 🌐 Best Viewed On

This application is optimized for:

- ✅ Desktop Chrome, Firefox, Edge
- ✅ Mobile View (Responsive via Bootstrap)

---


## 🌐 Connect with Me
Developed by **Ayush Jain** 

- 💼 [LinkedIn](https://www.linkedin.com/in/ayushstack)
- 📸 [Instagram](https://www.instagram.com/ayushstack)
- 🧑‍💻 [GitHub](https://github.com/ayushstack)

Made with ❤️ by **Ayush Jain**
--- 

