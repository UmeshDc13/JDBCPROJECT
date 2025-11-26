package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateStudent {

    public static void update(int id, String newCourse) {

        String sql = "UPDATE student SET course = ? WHERE stid = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newCourse);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println("Updated → " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
