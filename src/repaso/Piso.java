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
public class Piso extends Inmueble {
    
    private int numOficinas;
    private double areaP;
    


    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public double getAreaP() {
        return areaP;
    }

    public void setAreaP(double areaP) {
        this.areaP = areaP;
    }

    public Piso(String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
    }

    public Piso(int numOficinas, double areaP, String barrio, int estrato, int arriendo, double area) {
        super(barrio, estrato, arriendo, area);
        this.numOficinas = numOficinas;
        this.areaP = areaP;
    }
    
    public void darInfo(){
        System.out.println("Oficinas: " + numOficinas);
        System.out.println("Area del piso: " + areaP);
        System.out.println("Barrio:" + getBarrio());
        System.out.println("Costo arriendi:" + getArriendo());
    }
  
    
   
}
