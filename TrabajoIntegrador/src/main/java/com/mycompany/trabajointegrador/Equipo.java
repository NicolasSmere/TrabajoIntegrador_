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

public class Equipo {
    
    private int idEquipo;
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;
    
    public void mostrarEquipo(int idEquipo){
        
        try (Connection con = Conexion.conectar();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM equipo WHERE idEquipo = " + idEquipo)) {
        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("idEquipo"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Cantidad titulares: " + rs.getInt("titulares"));
            System.out.println("Cantidad suplentes: " + rs.getInt("suplentes"));
            System.out.println("Director técnico: " + rs.getString("directorTecnico"));
            System.out.println("Puntos: " + rs.getInt("puntos"));
            System.out.println("Partidos jugados: " + rs.getInt("partidosJugados"));
            System.out.println("****");
        }
        else{
            System.out.println("No existe equipo para el ID seleccionado");
        }
    } catch (Exception e) {
        System.out.println(e);
    } 
    }
    
    public void mostrarEquipos(){
                
        try (Connection con = Conexion.conectar();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM equipo")) {
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("idEquipo"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Cantidad titulares: " + rs.getInt("titulares"));
            System.out.println("Cantidad suplentes: " + rs.getInt("suplentes"));
            System.out.println("Director técnico: " + rs.getString("directorTecnico"));
            System.out.println("Puntos: " + rs.getInt("puntos"));
            System.out.println("Partidos jugados: " + rs.getInt("partidosJugados"));
            System.out.println("****");
        }
    } catch (Exception e) {
        System.out.println(e);
    }     
    }
}
