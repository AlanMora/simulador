/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosYEncapsulamientos;


public class Constructor {
    
    public int amount;
    
    public Constructor(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
    public void checkingAmount(int x){
        amount += x;
    }
    public static void main(String[] args) {
        Constructor acct = new Constructor((int)(Math.random()*1000));
      // acct.amount = 0;
       //acct.checkingAmount(-acct.getAmount());
       //acct.checkingAmount(-acct.amount);
       acct.checkingAmount(0);
        System.out.println(acct.getAmount());
       
    }
}
