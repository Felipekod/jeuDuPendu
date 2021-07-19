/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.com.forca;

import java.time.LocalDateTime;

/**
 *
 * @author felipeoliveira
 */
public class Partie {
    
    private String prenom;
    private int score;
    private LocalDateTime quand;
    private int difficulte;
    
    /**
     * Getters and setters
     * 
     */
    public void setDifficuklte(int difficulte){
        this.difficulte = difficulte;
    }
    
    public int getDifficulte(){
        return this.difficulte;
    }
    
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
    
    public void setPartie(LocalDateTime quand){
        this.quand = quand;
    }
    
    public LocalDateTime getQuand(){
        return this.quand;
    }
   
}
