/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;

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
       private int maxErreurs = 6;
       private int difficulte;
       
    //Numero de la photo courante
       private int image = 4;
       
    //Contructeur
       public Mecanisme()
       {
       
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
                //Si le char est une variation de 'e'.
//               char e1 = 'é';
//               char e2 = 'è';
//               char e3 = 'ê';
//               char e4 = 'ë';
               if(listeChar[i] == 'é' || listeChar[i] == 'è' || listeChar[i] == 'ê' || listeChar[i] == 'ë'){
                   if(charRecherche == 'e' || charRecherche == 'E'){
                        //On assigne true au index du char trouvé
                        motMystere.setCharTrouve(i);
                       charTrouve = true;
                   }
                }
               //Si le char est une variation de 'a'.
               else if(listeChar[i] == 'á' || listeChar[i] == 'à' || listeChar[i] == 'â' || listeChar[i] == 'ä' || listeChar[i] == 'ã'){
                   if(charRecherche == 'a'){
                        //On assigne true au index du char trouvé
                        motMystere.setCharTrouve(i);
                       charTrouve = true;
                   }
                }
               //Si le char est une variation de 'u'.
               else if(listeChar[i] == 'ú' || listeChar[i] == 'ù' || listeChar[i] == 'ü'){
                   if(charRecherche == 'u'){
                        //On assigne true au index du char trouvé
                        motMystere.setCharTrouve(i);
                       charTrouve = true;
                   }
                }
                //Si le char est une variation de 'c'.
               else if(listeChar[i] == 'ç'){
                   if(charRecherche == 'c'){
                        //On assigne true au index du char trouvé
                        motMystere.setCharTrouve(i);
                       charTrouve = true;
                   }
                }
               //Si le char est une variation de 'i'.
               else if(listeChar[i] == 'í' || listeChar[i] == 'ì' || listeChar[i] == 'î' || listeChar[i] == 'ï'){
                   if(charRecherche == 'i'){
                        //On assigne true au index du char trouvé
                         motMystere.setCharTrouve(i);
                        charTrouve = true;
                   }
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
           if(compteurErreurs == maxErreurs)
           {
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
                   char charToUpper = charMotMystere[i];
                   motCache += charToUpper;
               }
               else{
                   motCache += "*";
               }
           }
           
           return motCache;
           
       }
       
       //On cree le countDown
       
      
       
       
}
