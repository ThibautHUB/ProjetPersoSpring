package com.mycompany.bilbiotheque;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bibliotheque?useSSL=false&useLegacyDatetimeCode=false" +
                            "&serverTimezone=Europe/Paris",
                        "root","root");
            System.out.println("Success");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from client");
            while(rs.next()){
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println(rs.getString("prenom") + " " +
                        rs.getString("nom") + " né(e) le : " + " " +
                        df.format(rs.getDate("dateNaissance")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            try{
                if(conn != null){
                    conn.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
