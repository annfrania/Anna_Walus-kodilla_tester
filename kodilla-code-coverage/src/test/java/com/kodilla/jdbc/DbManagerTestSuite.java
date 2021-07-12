package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
//Given
//When
        DbManager dbManager = DbManager.getInstance();
//Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS2(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS2(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS2(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS2(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS2(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS2";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        int expected = count + 5;
        Assert.assertEquals(expected,counter);
    }
    @Test
    public void selectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*)\n" +
                "FROM USERS2 U\n" +
                "JOIN POSTS2 P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >=2\n" +
                "ORDER BY U.LASTNAME, U.FIRSTNAME";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count2 = 0;
        while (rs.next()) {
            count2 = rs.getInt("COUNT(*)");
        }
        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*)\n" +
                "FROM USERS2 U\n" +
                "JOIN POSTS2 P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >=2\n" +
                "ORDER BY U.LASTNAME, U.FIRSTNAME";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(count2,counter);
    }

}