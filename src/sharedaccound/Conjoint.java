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
public class Conjoint   {
    private int solde=0;
    synchronized void deposer (int montant){
        solde += montant;
    }
    synchronized void retirer (int montant){
        solde -= montant;
    }

    @Override
    public String toString() {
        return "Conjoint{" + "solde=" + solde + '}';
    }

    
    public void run() {
        int j = 0;
        
    }

    public  int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        solde = solde;
    }
    
    
}
