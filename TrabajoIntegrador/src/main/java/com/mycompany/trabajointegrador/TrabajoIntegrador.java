/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajointegrador;

import java.util.Scanner;

/**
 *
 * @author Nicolas_
 */
public class TrabajoIntegrador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Equipo equipo = new Equipo();
        int menu = 0;
        int id_equipo = 0;
        
        System.out.println("Elegir opcion:");
        System.out.println("1 - Informacion de equipo");
        System.out.println("2 - Informacion de la totalidad de equipos");
        System.out.println("3 - Salir");
        menu = sc.nextInt();
        
        
        switch(menu){
            case 1:{
                System.out.println("Elegir codigo de equipo para ver su informacion");
                System.out.println("--------------");
                System.out.println("1-BOCA JUNIORS");
                System.out.println("2-LANUS");
                System.out.println("3-RACING");
                System.out.println("4-RIVER PLATE");
                System.out.println("5-SAN LORENZO");
                System.out.println("--------------");
                id_equipo = sc.nextInt();
                equipo.mostrarEquipo(id_equipo);
                break;
            }
            case 2:{
                equipo.mostrarEquipos();
                break;
            }
            case 3:{
                break;
            }
        }
        
        
        
        
         
        
    }
}
