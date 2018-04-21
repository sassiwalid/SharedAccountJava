/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharedaccound;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class SharedAccoundTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conjoint C=new Conjoint();
        System.out.println(C.toString());
        Thread c1 = new Thread(new ConjointThread(C));
        Thread c2 = new Thread(new ConjointThread(C));
        c1.start();
        c2.start();
        try {
            c1.join();
            c2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SharedAccoundTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(C.toString());
        
    }
    
}
