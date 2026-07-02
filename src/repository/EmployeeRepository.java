package repository;

import database.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeRepository {

    public void save(
            String name
    ) {

        try {

            Connection conn =
                    DatabaseConnection
                            .getConnection();

            String sql =
                    "INSERT INTO employees(name) VALUES(?)";

            PreparedStatement ps =
                    conn.prepareStatement(
                            sql
                    );

            ps.setString(
                    1,
                    name
            );

            ps.executeUpdate();

        } catch (
                Exception e
        ) {

            e.printStackTrace();

        }

    }

}