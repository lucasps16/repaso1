/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author luckm
 */
public class Persona {
    private String nombre;
    private int DNI;
    private int edad;
    private String genero;

    public Persona(String nombre, int DNI, int edad, String genero) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    private void Alquilar(){
        
    }
    
    private void eliminarRegistro(){
        setEdad(0);
        setNombre(null);
    }
    
    private void Registro(){
        
        
    }
}
