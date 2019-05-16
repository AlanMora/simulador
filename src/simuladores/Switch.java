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
public class Switch {

    public static void main(String... args) {
     //  char x = 1;
        // short x = 1;
        //byte x = 1;
        // long x = 1;
        // double x = 1; 
        //  float x = 1;
        /**
         * String x = 1; Este es error, ya que el String almacena una cadena y
         * en este caso esta almacenando un numero.
         */
        //Integer x = new Integer("1");
        Short x = new Short ("1");
        switch (x) {
            /**
             * Los datos aceptados por switch son los de tipo enteros de 32 bits
             * hacia abajo en este caso char, byte, int, short y eneste caso
             * acepta short byte, en el cual tambien se incluyen los tipos envolventes.
             */
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }

}
