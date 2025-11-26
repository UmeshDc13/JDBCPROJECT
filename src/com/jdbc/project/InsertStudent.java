package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStudent {

    public static void insert(int id, String name, String course) {

        String sql = "INSERT INTO student (stid, sname, course) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);

            int rows = ps.executeUpdate();
            System.out.println("Inserted → " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
