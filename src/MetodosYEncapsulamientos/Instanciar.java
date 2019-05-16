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
public class Instanciar {
       int  count = 0;
    public  void mensaje(){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
      Instanciar a = new Instanciar();
        a.mensaje();
        a.mensaje();
    }
    
}
