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
public class Edificio extends Inmueble{
    private String infoProp;

    public String getInfoProp() {
        return infoProp;
    }

    public void setInfoProp(String infoProp) {
        this.infoProp = infoProp;
    }
    public Edificio(String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
    }

    public Edificio(String infoProp, String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
        this.infoProp = infoProp;
    }
    
}
