/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

/**
 *
 * @author Lalo_
 */
public class TestExceptionThrowsable {
      public static void main(String[] args){
        
          hacerCosas();          
    }
    static void hacerCosas()  {
        hacerMascosas();
    }
    static void hacerMascosas() {
        int x = 5/0;
        
    }
}
