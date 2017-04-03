/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author AlumMati
 */
public class Contactos implements Serializable{
    
    private String nombre;
    private String direccion;
    private int telefono;
    private Calendar fnacimiento;
    private String notas;
    
    
    
    public Contactos(){};
    public Contactos(String n, String d, int t, Calendar fn, String not){
        nombre = n;
        direccion = d;
        telefono = t;
        fnacimiento = fn;
        notas = not;
    }

    
    
    
    
    @Override
    public String toString(){
          return ("\n Nombre: " +nombre+
                    "\n Dirección: " +direccion+
                    "\n Teléfono: " +telefono+
                    "\n F. Nacim.: " +fnacimiento+
                    "\n Notas: " +notas);
    }
    
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fnacimiento
     */
    public Calendar getFnacimiento() {
        return fnacimiento;
    }

    /**
     * @param fnacimiento the fnacimiento to set
     */
    public void setFnacimiento(Calendar fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
    
    
    
}
