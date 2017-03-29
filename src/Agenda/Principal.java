/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumMati
 */
public class Principal {

    public static void main(String[] argm) throws IOException {
        new Principal();
    }

    public Principal() throws IOException {
        controlArchivo();
        menu();
    }

    public void menu() {

       // Contactos contacto1 = new Contactos("Juan", "Avenida las cruves", 123456789, "20/05/1900", "persona numero uno");
       //Contactos contacto2 = new Contactos("Luis", "Avenida las cruves", 123456789, "20/05/1900", "persona numero dos");
       // Contactos contacto3 = new Contactos("Andres", "Avenida las cruves", 123456789, "20/05/1900", "persona numero tres");
       // Contactos contacto4 = new Contactos("Luis", "Avenida las cruves", 123456789, "20/05/1900", "persona numero cuatro");

        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        Agenda agen = new Agenda();

       // agen.aContactos.add(contacto1);
       // agen.aContactos.add(contacto2);
       // agen.aContactos.add(contacto3);
       // agen.aContactos.add(contacto4);

        int respuesta;

        try {
            do {
                System.out.println("\n******MENU PRINCIPAL****** \n"
                        + "        " + "1.Añadir a agenda\n"
                        + "        " + "2.Eliminar de agenda\n"
                        + "        " + "3.Busqueda en agenda\n"
                        + "        " + "4.Consulta cumpleaños de hoy\n"
                        + "        " + "5.Mostrar agenda\n"
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
                }

            } while (respuesta != 0);

        } catch (IOException ex) {
            System.err.println("error de entrada" + ex.getMessage());
        }
    }

    public void controlArchivo() throws IOException {
        Agenda agen = new Agenda();
        File f = new File("contactos.txt");

        if (f.exists()) {
            FileReader fr = new FileReader("contactos.txt");
            BufferedReader br = new BufferedReader(fr);

            String texto = "";
            int posi;
            int posiant;
            int cont=0;

            texto = br.readLine();

            while (texto != null) {
                Contactos contactomuestra = new Contactos();

                posi = texto.indexOf(",");
                contactomuestra.setNombre(texto.substring(0, posi));
                posiant = posi + 1;

                posi = texto.indexOf(",", posiant);
                contactomuestra.setDireccion(texto.substring(posiant, posi));
                posiant = posi + 1;

                posi = texto.indexOf(",", posiant);
                contactomuestra.setTelefono(Integer.parseInt(texto.substring(posiant, posi)));
                posiant = posi + 1;

                posi = texto.indexOf(",", posiant);
                contactomuestra.setFnacimiento(texto.substring(posiant, posi));
                posiant = posi + 1;

                posi = texto.indexOf(",", posiant);
                contactomuestra.setNotas(texto.substring(posiant, posi));
                posiant = posi + 1;
                
                
                agen.añadir(contactomuestra);

                texto = br.readLine();
            }

            fr.close();

        } else {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
        }

    }

}
