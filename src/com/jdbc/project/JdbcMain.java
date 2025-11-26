package com.jdbc.project;

import java.util.Scanner;

public class JdbcMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== JDBC MENU =====");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Read");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Course: ");
                    String course = sc.nextLine();
                    InsertStudent.insert(id, name, course);
                    break;

                case 2:
                    System.out.print("ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Course: ");
                    String newCourse = sc.nextLine();
                    UpdateStudent.update(uid, newCourse);
                    break;

                case 3:
                    System.out.print("ID to delete: ");
                    int did = sc.nextInt();
                    DeleteStudent.delete(did);
                    break;

                case 4:
                    ReadStudents.read();
                    break;

                case 5:
                    System.out.println("Bye! 👋");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 5);

        sc.close();
    }
}
