package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {

    public static void delete(int id) {

        String sql = "DELETE FROM student WHERE stid = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println("Deleted → " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
