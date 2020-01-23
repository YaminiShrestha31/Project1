package airlineereservationsystem;

import java.sql.*; 

public class Conn{
    Connection c;
    Statement s;
    public Conn(){ 
        try{ 
            Class.forName("com.mysql.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql:///reservation","root","12345");   
            s =c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        } 
    } 
}   