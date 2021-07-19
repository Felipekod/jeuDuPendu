/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author felipeoliveira
 */
public class EnregistrerPartie {
    
    ArrayList<Partie> listePartie;
    int quantiteParties;
    
    public EnregistrerPartie(String prenom, int score, LocalDateTime quand, int difficulte){
        //On recupere la liste de parties
        ListesReader listes = new ListesReader();
        listePartie = listes.getListePartie();
       //on compte la quantite de parties enregistre
       quantiteParties = listePartie.size();
        
      try {
          //On cree le txt temporaire
            File partieTempTxt = new File("src/ca/com/forca/partieTemp.txt");
            if (partieTempTxt.createNewFile()) {
              System.out.println("File created: " + partieTempTxt.getName());
            } else {
              System.out.println("File already exists.");
            }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      
     try{
         //on cree le FileWriter
        FileWriter myWriter = new FileWriter("src/ca/com/forca/partieTemp.txt");
        
        for(int i = 0; i < quantiteParties; i++){
            //On recupere la ligne pour le txt
            String lignePartie = listePartie.get(i).getPrenom() + " " + listePartie.get(i).getScore() + " " + listePartie.get(i).getQuand() + " " + listePartie.get(i).getDifficulte() ;
            if(i==0)
            {
                //On écrit la première ligne
                myWriter.write(lignePartie);
            }
            else{
                //On écrit le restant des lignes dans une neuve ligne
                 myWriter.write(String.format("%n"));
                 myWriter.write(lignePartie);
                
            }
        }
        
        //On écrit la derniere ligne
                 myWriter.write(String.format("%n"));
                 myWriter.write(prenom + " " + score + " " + quand + " " + difficulte);
       
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
        
        
        //On remplace les fichiers
     }
     catch(Exception ex){
         System.out.println("An error occurred.");
         ex.printStackTrace();
     }
     
     //A la fin on delete le ancien TXT et on change le nom du nouveau
     File partieTxtTemp = new File("src/ca/com/forca/partieTemp.txt");
     File partieTxt = new File("src/ca/com/forca/partie.txt");
     
     partieTxt.delete();
     partieTxtTemp.renameTo(partieTxt);
      
      
      
      
    }
    
}
