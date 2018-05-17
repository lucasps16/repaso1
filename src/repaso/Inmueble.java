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
public abstract class Inmueble {
    String barrio;
    private int estrato;
    private int arriendo;
    private double area;

    public Inmueble(String barrio, int estrato, int arriendo, double area) {
        this.barrio = barrio;
        this.estrato = estrato;
        this.arriendo = arriendo;
        this.area = area;
    }

    

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public int getArriendo() {
        return arriendo;
    }

    public void setArriendo(int arriendo) {
        this.arriendo = arriendo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
