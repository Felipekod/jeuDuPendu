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
public class Jouer {
    
    private String prenom;
    private int score;
    
    /**
     * Getters and setters
     * 
     */
    public String getPrenom(){
        return this.prenom;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setScore(int score){
        this.score = score;
    }
}
