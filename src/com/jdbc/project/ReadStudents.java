package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadStudents {

    public static void read() {

        String sql = "SELECT stid, sname, course FROM student";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("ID | Name | Course");
            System.out.println("-------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("stid") + " | " +
                        rs.getString("sname") + " | " +
                        rs.getString("course")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
