/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladores;

/**
 *
 * @author Lalo_
 */
public class Ternario {
    public static void main(String[] args) {
        double valor = 0;
        int qty = Integer.parseInt(args[0]);
        valor = (qty >= 90)?0.5:(qty>80)?0.2:0;
    }
    
}
