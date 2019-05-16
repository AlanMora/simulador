/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosYEncapsulamientos;

import sun.util.calendar.CalendarUtils;

/**
 *
 * @author Lalo_
 */
public class AgregarValor {
    public  int amount;
    
    public AgregarValor(){
        amount = 100;
            System.out.println(amount);   
    }
    
    
    
    public static void main(String[] args) {
        AgregarValor agregar = new AgregarValor();
        agregar.amount = 100;
        System.out.println(agregar.amount);
    }
}
   