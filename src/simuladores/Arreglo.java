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
public class Arreglo {

    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] = new int[]{1, 3};
        for (int[] a : arr) {
            /**
             * es este foreach da un recorrido a los valores de la matriz y las
             * guarda en un arreglo llamado a.
             */
            for (int i : a) {
                /**
                 * En este foreach da un recorrido por todos los valores
                 * almacenados en el arreglo de a qeu se creo arriba
                 */
                System.out.println(i + " ");
                /**
                 * por ultiimo impre todo los valores ya que primero le dio un
                 * recorrido y los almaceno en un arreglo y despues le dio otro
                 * recorrido a todo ese arreglo y lo imprimio en la variable i
                 */
            }
            System.out.println();
        }
    }
}
