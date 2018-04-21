/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharedaccound;

/**
 *
 * @author macbook
 */
public class ConjointThread implements Runnable{

    private Conjoint c  ;

    public ConjointThread(Conjoint c) {
        this.c = c;
    }
    
    public void run() {
         for (int i = 1;i<=1000;i++){
            c.deposer(1);
       //     Thread.yield();
   
        } 
         c.retirer(10);
    }
    
}
