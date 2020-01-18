package com.company;

import java.sql.*;

public class DB { private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "55555555k";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }

    public boolean PrintNews(News news){
        String SQL = "insert into news (headline,text_news, time_publication) values (?,?,?)";
        try (Connection conn = connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    News n = new News();
                    n.setHeadLine(rs.getString("headline"));
                    n.setText(rs.getString("text"));
                    n.setTimePublication(rs.getString("time_publication"));


                }
                return n;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return Boolean.parseBoolean(null);
    }

    public News getNews(String text) {
        String SQL = "select * from users_1 where login = ? and is_active = 'ACTiVE'";
        try (Connection conn = DB.connect();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1,text);
            try(ResultSet rs = statement.executeQuery()){
                if(rs.next()) {
                    News n = new News();
                    n.setText(rs.getInt("text"));
                    return n;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

