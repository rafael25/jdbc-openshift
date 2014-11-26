/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Conexxion {
    public static Connection conexxion() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.7.73.2:3306/prueba";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, "adminrhZH5AX", "t5VWhNdKZlMb");
        return con;
    }
}
