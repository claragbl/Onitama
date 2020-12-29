/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama_berchiche_gaubil;

/**
 *
 * @author claragaubil
 */
public class Carte {
    
    private String nom;
    public int[][] vecteursDeplacements;
    public String fichierImage;
    
    public Carte (String leNom, int[][] vecteurs, String leFichierImage) {
        nom = leNom;
        vecteursDeplacements = vecteurs;
        fichierImage = leFichierImage; 
    }
}
