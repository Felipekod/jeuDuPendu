/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

import java.util.ArrayList;

/**
 *
 * @author felipeoliveira
 */
public class Jeux {
    public static void main(String args[]){
        
        JouersListeReader jouerReader = new JouersListeReader();
        ArrayList<String> listeJouer = jouerReader.getListePrenom();
        
        System.out.println(listeJouer.get(0));
        
    }
}
