/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegrador;
import java.sql. *;



/**
 *
 * @author Nicolas_
 */
public class Conexion {
    
    public static Connection conectar(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/equipos","root","Nicolas1_");         
            
        }catch (Exception e){
            System.out.println(e);
        }
        return con;  
    }
  
}
