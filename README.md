# 🚀 JDBCPROJECT – Java JDBC CRUD Application

A simple **Java + JDBC console application** to perform CRUD operations on a `student` table stored in MySQL.  
This project is designed for learning **JDBC, MySQL, PreparedStatement, and modular Java programming**.

---

## ⭐ Features

- Insert new student  
- Update student information  
- Delete student by ID  
- View all students  
- Menu-driven console UI  
- Clean separation: Insert, Update, Delete, Read, DBConnection

---

## 🛠️ Tech Stack

| Component | Technology |
|----------|------------|
| Language | Java (JDK 17+) |
| Database | MySQL |
| Connector | MySQL Connector/J |
| IDE | VS Code / Eclipse |
| Type | Console Application |

---

## 📁 Project Structure

JDBCPROJECT/
├── src/
│ └── com/jdbc/project/
│ ├── DBConnection.java
│ ├── InsertStudent.java
│ ├── UpdateStudent.java
│ ├── DeleteStudent.java
│ ├── ReadStudents.java
│ └── JdbcMain.java
├── lib/
│ └── mysql-connector-j-8.x.x.jar
└── README.md

yaml
Copy code

---

## 🗄️ MySQL Database Setup

Run these commands:

```sql
CREATE DATABASE JDBCPROJECT;

USE JDBCPROJECT;

CREATE TABLE student (
    stid INT PRIMARY KEY,
    sname VARCHAR(50),
    course VARCHAR(50)
);
Update your DB credentials inside DBConnection.java:

java
Copy code
private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBCPROJECT";
private static final String USER = "root";
private static final String PASSWORD = "SQL123";
▶️ How to Run (VS Code)
Install Java Extension Pack

Place mysql-connector-j JAR inside lib/

Add JAR to “Referenced Libraries”

Open JdbcMain.java

Click Run ▶️

▶️ How to Run (Terminal)
bash
Copy code
javac -cp "lib/mysql-connector-j-8.x.x.jar;src" src/com/jdbc/project/*.java

java  -cp "lib/mysql-connector-j-8.x.x.jar;src" com.jdbc.project.JdbcMain
📌 Menu Example
mathematica
Copy code
===== JDBC MENU =====
1. Insert
2. Update
3. Delete
4. Read
5. Exit
Enter choice:
📊 ER Diagram
diff
Copy code
+-------------+
|   student   |
+-------------+
| stid (PK)   |
| sname       |
| course      |
+-------------+
🔁 Flowchart
pgsql
Copy code
   +--------+
   | Start  |
   +---+----+
       |
       v
+---------------+
| Show Menu     |
+-------+-------+
        |
+-------+----------------------------+
|   Insert / Update / Delete / Read |
+-----------------------------------+
        |
        v
     Back to Menu
🔮 Future Enhancements
Search student by ID

Validate inputs

Add more fields (email, marks, phone)

Convert to Maven project

Upgrade to GUI (JavaFX)

Move to Spring Boot

👤 Author
Umesh DC
Java Developer | CSE
🔗 GitHub: https://github.com/UmeshDc13
