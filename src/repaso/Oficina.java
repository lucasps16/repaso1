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
public class Oficina extends Local {
    private boolean tipo;

    public Oficina(boolean tipo, String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
        this.tipo = tipo;
    }
    public Oficina(String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
    }
    public void registrarOficina(){
        
    }
}
