/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipeoliveira
 */
public class JouersListeReader {
    
    //On cree une liste pour les prenom
    private ArrayList<String> listePrenom = new ArrayList<String>();
    
    //on cree une liste pour les scores
    private ArrayList<Integer> listeScrore = new ArrayList<Integer>();
    
    
    public ArrayList<String> getListePrenom(){
        return this.listePrenom;
    }
    
    public JouersListeReader(){
        
        
    //On effecture la lecture du fichier jouers.txt
    try{
        File fichierJouer = new File("src/ca/com/forca/jouers.txt");
        Scanner scanJouers = new Scanner(fichierJouer);
        
        //On ajoute les prenom dans la liste de prenom
        while(scanJouers.hasNextLine()){
            String data = scanJouers.nextLine();
            listePrenom.add(data);
        }
        
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
        
    }
    
    
}
