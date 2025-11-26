This project is a beginner-friendly Java JDBC console application that performs CRUD operations using MySQL.

It includes:

DB connection handling

Menu-based UI

Separate classes for Insert / Update / Delete / Read

Clean JDBC code

🚀 Features
✔ Insert record
✔ Update record
✔ Delete record
✔ Read entire table
✔ Separate Java files for each operation
✔ MySQL connectivity using JDBC driver
📂 Project Structure
JDBCPROJECT/
 ├── src/
 │    └── com/jdbc/project/
 │         ├── DBConnection.java
 │         ├── InsertStudent.java
 │         ├── UpdateStudent.java
 │         ├── DeleteStudent.java
 │         ├── ReadStudents.java
 │         └── JdbcMain.java     // Menu-driven main program
 ├── lib/
 │    └── mysql-connector-j-8.x.x.jar
 └── README.md

🗄️ Database Setup (MySQL)

Run these SQL commands before running the program:

CREATE DATABASE JDBCPROJECT;

USE JDBCPROJECT;

CREATE TABLE student (
    stid INT PRIMARY KEY,
    sname VARCHAR(50),
    course VARCHAR(50)
);


Update credentials in DBConnection:

private static final String URL = "jdbc:mysql://127.0.0.1:3306/JDBCPROJECT";
private static final String USER = "root";
private static final String PASSWORD = "SQL123";

▶️ How to Run (VS Code)

Install Java Extension Pack

Install MySQL JDBC Driver (place jar inside lib/)

Open project folder → JDBCPROJECT

Open JdbcMain.java

Click Run ▶️

▶️ How to Run (Terminal)
javac -cp "lib/mysql-connector-j-8.x.x.jar;src" src/com/jdbc/project/*.java

java  -cp "lib/mysql-connector-j-8.x.x.jar;src" com.jdbc.project.JdbcMain


(Use : instead of ; on Mac/Linux.)

🖥 Menu Example
===== JDBC MENU =====
1. Insert
2. Update
3. Delete
4. Read
5. Exit
Enter choice:

💡 Future Improvements

Add validation before insert

Add search by ID

Switch to PreparedStatement everywhere

Convert to Maven project

Move to Spring Boot + JPA later

👤 Author

Umesh DC
Java Developer | CSE
GitHub: https://github.com/UmeshDc13
