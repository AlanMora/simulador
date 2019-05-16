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
public class For {
    public static void main(String[] args) {
        int i = 0;
        int j = 7;
        for(i = 0; i < j-1; i+=2){/** En el bucle for primero se le asigana el valor
         * a la primera variable la cual sera con el valor que iniciara, despues
         * la operacion en seguida se ejecuta la accion que esta entre el bloque y por 
         * ultimo se le suma el valor a la variable iterada
         */
            System.out.println(i+ " ");
        }
    }
    
}
