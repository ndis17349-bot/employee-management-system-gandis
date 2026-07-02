package repository;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {

    public boolean login(
            String username,
            String password
    ) {

        try {

            Connection conn =
                    DatabaseConnection.getConnection();

            String sql =
                    "SELECT * FROM users WHERE username=? AND password=?";

            PreparedStatement ps =
                    conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs =
                    ps.executeQuery();

            return rs.next();

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );

            return false;
        }

    }

}