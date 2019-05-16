/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosYEncapsulamientos;

/**
 *
 * @author Lalo_
 */
public class Area {
    private double length; //
    private double height;
    private double area;
    
    public void setLength(double length){
        this.length = length;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setArea(){
        this.area = length * height;
    }
    
}
