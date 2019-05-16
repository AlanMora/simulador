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
public class ConteoString {
    public static void main(String[] args) {
        String cs[] = {"US", "UK"};
        int wc = 0;
        while(wc < cs.length){
            int count = 0;
            do{
                ++count;
            }while(count < cs[wc].length());
            System.out.println(cs[wc]+ ": " + count);
            wc++;
        }
    }
}
