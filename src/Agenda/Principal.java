/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.*;

/**
 *
 * @author AlumMati
 */
public class Principal {

    Agenda agen = new Agenda();
    
    public static void main(String[] argm) throws IOException, ClassNotFoundException {
        new Principal();
    }

    public Principal() throws IOException, ClassNotFoundException {
        
        agen.leerfichero();
        menu();
    }

    public void menu() throws ClassNotFoundException {

        //Contactos contacto1 = new Contactos("Juan", "Avenida las cruves", 123456789, "20/05/1900", "persona numero uno");
        //Contactos contacto2 = new Contactos("Luis", "Avenida las cruves", 123456789, "20/05/1900", "persona numero dos");
        //Contactos contacto3 = new Contactos("Andres", "Avenida las cruves", 123456789, "20/05/1900", "persona numero tres");
        //Contactos contacto4 = new Contactos("Luis", "Avenida las cruves", 123456789, "20/05/1900", "persona numero cuatro");
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        

        //agen.aContactos.add(contacto1);
        //agen.aContactos.add(contacto2);
        //agen.aContactos.add(contacto3);
        //agen.aContactos.add(contacto4);
        int respuesta;

        try {
            do {
                System.out.println("\n******MENU PRINCIPAL****** \n"
                        + "        " + "1.Añadir a agenda\n"
                        + "        " + "2.Eliminar de agenda\n"
                        + "        " + "3.Busqueda en agenda\n"
                        + "        " + "4.Consulta cumpleaños de hoy\n"
                        + "        " + "5.Mostrar agenda\n"
                        + "        " + "6.Guardar\n"
                        + "        " + "0.Salir\n"
                );

                respuesta = Integer.parseInt(tec.readLine());

                switch (respuesta) {
                    case 1:
                        agen.añadircontacto();
                        break;
                    case 2:
                        agen.eliminarcontacto();
                        break;
                    case 3:
                        agen.busqueda();
                        break;
                    case 4:
                        break;
                    case 5:
                        agen.mostraragenda();
                        break;
                    case 6:
                        agen.guardarfichero();
                        break;                  
                }

            } while (respuesta != 0);

        } catch (IOException ex) {
            System.err.println("error de entrada" + ex.getMessage());
        }
    }

    

}
