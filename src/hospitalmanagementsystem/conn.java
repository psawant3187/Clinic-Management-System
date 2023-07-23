/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import java.sql.*;
/**
 *
 * @author Pranit Sawant
 */
public class conn {
    Connection c;
    Statement s;
    conn(){
        String url="jdbc:mysql://localhost:3306/hms";
        String username="root";
        String password="pranit@69";
        try {
        c = DriverManager.getConnection(url, username, password);
        s = c.createStatement();

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new conn();
    }
}
