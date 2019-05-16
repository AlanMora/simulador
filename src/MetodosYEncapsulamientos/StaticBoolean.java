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
public class StaticBoolean {
    static boolean isAvaliable = false;
    
    public static boolean doStuff(){
        return  !isAvaliable;
    }
    public static void main(String[] args) {
        StaticBoolean boleano =  new StaticBoolean();
        System.out.println(isAvaliable);
        isAvaliable = boleano.doStuff();
        System.out.println(isAvaliable);
    }
    
}
