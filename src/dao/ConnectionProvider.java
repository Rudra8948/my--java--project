package dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author rdxad
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false","root","8948");
        return con;
    }
    catch(Exception e){
       System.out.println(e);
       return null;
       }
    }
    public static void main (String []args){
        Connection con = getCon();
        if(con !=null){
            System.out.println("datbase connection successfull");
        }else{
            System.out.println("Connection failed");
        }
    }
}

