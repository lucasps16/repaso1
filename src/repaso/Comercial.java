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
public class Comercial extends Local{
     
    private String descripcion;
    private boolean viaP; 

    public Comercial(String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
    }

    public Comercial(String descripcion, boolean viaP, String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
        this.descripcion = descripcion;
        this.viaP = viaP;
    }

    
}
