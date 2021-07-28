/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author THE_end
 */
public class Koneksi {
    static Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    public static Connection cekKoneksi() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sewa_lapangan", "root", "");
            System.out.println("Koneksi Database berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal" + e);
        }
        return conn;
    }
    //public static void main(String[] args) {
        //cekKoneksi();
    //}
}
