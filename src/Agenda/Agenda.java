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
public class Agenda {

    Contactos aContactos[] = new Contactos[10];
    BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    

    public void añadircontacto() {
        try {
            String n;
            String d;
            int t;
            String f;
            String nt;
            System.out.println("Introduce nombre");
            n = tec.readLine();
            System.out.println("Introduce dirección");
            d = tec.readLine();
            System.out.println("Introduce teléfono");
            t = Integer.parseInt(tec.readLine());
            System.out.println("Introduce Fecha nacimiento");
            f = tec.readLine();
            System.out.println("Introduce notas");
            nt = tec.readLine();

            Contactos contacto = new Contactos(n, d, t, f, nt);

            int i;

            for (i = 0; i < aContactos.length && aContactos[i] != null; i++) {
            }

            if (i < aContactos.length - 1) {
                aContactos[i] = contacto;
            } else {
                System.out.println("La agenda está llena");
            }

        } catch (IOException ex) {
            System.err.println("error de entrada" + ex.getMessage());
        }
    }

    ;
    public void eliminarcontacto() {
        
        try{
        String nombre;
        System.out.println("Introduce nombre del contacto a eliminar");
        nombre = tec.readLine();
        
        for()
        
        }catch (IOException ex) {
            System.err.println("error de entrada" + ex.getMessage());
        }

    }

    ;
    public void busqueda(String nombre) {
    }

    ;
    public void consulta() {
    }
;

}
