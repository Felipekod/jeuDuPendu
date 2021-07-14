/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

/**
 *
 * @author felipeoliveira
 */

public class MotMystere {
    
    //Variables de classe
        private String motMystere = "";
        private int longuerMot;
        private char[] charMotMystere;
        private boolean charTrouve[];
        
    //Getters & setters
        public char[] getCharMotMystere(){
            return this.charMotMystere;
        }
        
        public boolean[] getCharTrouve(){
            return this.charTrouve;
        }
        
        public void setCharTrouve(int index){
            this.charTrouve[index] = true;
        }
        
        public String getMotMystere(){
            return this.motMystere;
        }
   
    //Constructeur de la classe
        MotMystere(String mot){
            
    //On atribue les valeurs des variables
            this.motMystere = mot;
            longuerMot = motMystere.length();
            charMotMystere = motMystere.toCharArray();
            boolean charTrouve[] = new boolean[longuerMot];
            
    //On ajoute la valeur false pour chaque char dans la liste charTrouve
            for(int i = 0; i < longuerMot ; i++)
            {
                charTrouve[i] = false;
            }
            this.charTrouve = charTrouve;
            
        }
        
        
    
}
