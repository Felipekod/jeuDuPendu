/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipeoliveira
 */
public class ListesReader {
    
    //On cree une liste pour les mots possibles
    private ArrayList<String> listeMots = new ArrayList<String>();
    
    //On cree une liste pour les parties
    private ArrayList<Partie> listePartie = new ArrayList<Partie>();
    
    //Getter
    
    public ArrayList<Partie> getListePartie(){
        return this.listePartie;
    }
    
     public ArrayList<String> getListeMots(){
        return this.listeMots;
    }
    
    public ListesReader(){
        
        
    //On effecture la lecture du fichier jouers.txt
    try{
        File fichier = new File("src/ca/com/forca/partie.txt");
        Scanner scanJoueurs = new Scanner(fichier);
        
        //On ajoute les prenom, scores et la date dans la liste de partie
        while(scanJoueurs.hasNextLine()){
            //on lit la ligne
            String data = scanJoueurs.nextLine();
            
            //On separe la string et effectue les convertions
            String[] parts = data.split(" ");
           
            String prenom = parts[0];
            int score = Integer.parseInt(parts[1]);
            LocalDateTime quand = LocalDateTime.parse(parts[2]);
            int difficulte = Integer.parseInt(parts[3]);
            
            //On cree une partie
            Partie partie = new Partie();
            partie.setDifficuklte(difficulte);
            partie.setPartie(quand);
            partie.setScore(score);
            partie.setPrenom(prenom);
            
            listePartie.add(partie);
            
        }
        
        //On cree le reader pour la liste de mots possibles
        fichier = new File("src/ca/com/forca/mots.txt");
        Scanner scanMots = new Scanner(fichier);
        
        while(scanMots.hasNextLine()){
            //on lit la ligne
            String data = scanMots.nextLine();
            listeMots.add(data);
        }

        
        
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
        
    }
    
    
}
