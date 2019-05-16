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
public class Inicializar {
    int x,y;
    public Inicializar(int x, int y){
        initialize(x,y);
    }

    public void initialize(int x, int y) {
       this.x = x *x;
       this.y = y * y;
    }
    public static void main(String[] args) {
        int x = 3, y = 5;
        Inicializar ini = new Inicializar(x, y);
        System.out.println(x + " " + y);
        System.out.println(ini.x);
    }
    
}
