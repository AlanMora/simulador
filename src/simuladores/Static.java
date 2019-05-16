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
public class Static {

    int i = 0;// normal
    static int count = 0;//Quiere decir que solo puede iniciar de 0 en un bloque static

    public void chanceCount() {
        while (i < 5) {
            /**
             * Aqui el bucle while empieza a hacer su funcion hasta llegar a 5
             * pero al momento de checar2 inicia vuelve a empezar el bucle la
             * variable i que esta iterando y aumentado empieza de cero por ser
             * una variable public ya que por no ser static se crea una
             * instancia. y la vaariable count es unica para todas las
             * instancias por tener el static.
             */
            ++i;
            count++;
        }
    }

    public static void main(String[] args) {
        Static checar = new Static();
        Static checar2 = new Static();
        checar.chanceCount();//Aqui le dan un vuelta a todo 
        checar2.chanceCount();//Aqui le da otra vuelta pero el count queda igual 
        //por ser estatica ya que no crea instancias y es unica
        System.out.println(checar.count + ":" + checar2.count);
    }
}
