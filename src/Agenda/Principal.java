/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumMati
 */
public class Principal {

    public static void main(String[] argm) {
        new Principal();
    }

    public Principal() {
        menu();
    }

    public void menu() {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        Agenda agen = new Agenda();

        int respuesta;

        try {
            do {
                System.out.println("\n******MENU PRINCIPAL****** \n"
                        + "        " + "1.Añadir a agenda\n"
                        + "        " + "2.Eliminar de agenda\n"
                        + "        " + "3.Busqueda en agenda\n"
                        + "        " + "4.Consulta cumpleaños de hoy\n"
                        + "        " + "0.Salir\n"
                );

                respuesta = Integer.parseInt(tec.readLine());
                
                switch(respuesta){
                    case 1:
                        agen.añadircontacto();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
                
                

            } while (respuesta != 0);

        } catch (IOException ex) {
            System.err.println("error de entrada" + ex.getMessage());
        }
    }

}
