/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

/**
 * La classe represent le mecanisme du jeu
 * 
 * @author felipeoliveira
 * @version 1.0
 */
public class Mecanisme {
    //On declare les variables
       private int compteurErreurs = 0;
       private boolean victoire = false;
       private boolean defaite = false;
       
       
    //Variables de niveau de difficulté
       private int maxErreursFacile = 6;
       private int maxErreursMedium = 5;
       private int maxErreursDifficile = 4;
       
       private int difficulte;
       
    //Numero de la photo courante
       private int image;
       
    //Contructeur
       public Mecanisme(int difficulte)
       {
           this.difficulte = difficulte;
           
           if(difficulte == 1)
               this.image = 4;
           else if(difficulte == 2)
               this.image = 5;
           else
               this.image = 6;
       }
       
       //Getters $ setters
       
       public int getNumeroImage(){
           return this.image;
       }
       
       
    /**
     * Methodes du jeu
     */
      
       public boolean rechercherCharMotMystere(MotMystere motMystere, char charRecherche){
           //OPn recupere la longuer du motMystere
           int longuer = motMystere.getMotMystere().length();
           //On recupere la liste de char du motMystere
           char[] listeChar = motMystere.getCharMotMystere();
           //variable de controle
           boolean charTrouve = false;
           
           //On recherche le char dans charMotMystere
           for(int i = 0; i < longuer; i++)
           {
               if(listeChar[i] == charRecherche)
               {
                   //On assigne true au index du char trouvé
                   motMystere.setCharTrouve(i);
                   
                   charTrouve = true;
               }
           }
           
           //On ajoute 1 au numero de l'image et 1 au compteur if le char n'a pas été trouvé
           if(!charTrouve)
           {
               image++;
               compteurErreurs++;
           }
               
           
           return charTrouve;
       }
    
       
       public boolean verifierDefaite(){
           //si Difficulte FACILE
           if(difficulte == 1 && compteurErreurs == maxErreursFacile)
           {
               return true;
           }
           //Si difficulte MEDIUM
           else if(difficulte == 2 && compteurErreurs == maxErreursMedium){
               return true;
            }
           //si difficulte DIFFICILE
           else if(difficulte == 3 && compteurErreurs == maxErreursDifficile){
               return true;
           }
           else{
              return false;
           }
                   
       }
       
       public boolean verifierVictoire(MotMystere motMystere){
           
           boolean victoire = false;
           int longuerMot = motMystere.getMotMystere().length();
           int compteurCharTrouve = 0;
           
           for(int i = 0; i < longuerMot ; i++ ){
               
               if(motMystere.getCharTrouve()[i])
                   compteurCharTrouve++;
           }
           
           if(compteurCharTrouve == longuerMot)
           {
               victoire = true;
           }
           
           return victoire;
       }
       
       public String ecrireLabelMotMystere(MotMystere motMystere){
           //On verifie la longuer du motMystere
           int longuerMot = motMystere.getMotMystere().length();
           //On cree un string pour afficher à l'ecran
           String motCache = "";
           //On recupere la liste de charTrouve
           boolean[] charTrouve = motMystere.getCharTrouve();
           //On recupere la liste de char du motMystere
           char[] charMotMystere = motMystere.getCharMotMystere();
           
           for(int i = 0; i < longuerMot; i++){
               
               //Si le char a été deja trouvé
               if(charTrouve[i]){
                   motCache += charMotMystere[i];
               }
               else{
                   motCache += "_";
               }
           }
           
           return motCache;
           
       }
       
       
       
       
}
