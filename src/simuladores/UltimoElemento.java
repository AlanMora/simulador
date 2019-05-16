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
public class UltimoElemento {
    public static void main(String[] args) {
        int [] stack = {10,20,30};
        int size = 3;
        int idx = 0;
   
        do{
            idx++;
        }while(idx < size-1);
        System.out.println("hola");
        System.out.println(stack[idx]);
    }
}
