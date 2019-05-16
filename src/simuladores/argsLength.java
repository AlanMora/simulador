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
public class argsLength {
    public static final int MIN = 1;
    public static void main(String[] args) {
   //  int x = args.length;
     int x = 2;
     if(checkLimit(x)){
         System.out.println("Java SE");
     }else{
         System.out.println("JAVA EE");
     }   
    }
    public static boolean checkLimit(int x){
        return (x >= MIN )? true : false;
    }
}
