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
    public int[] positionDepart;
    public int[][] positionArrivee;
    public String fichierImage;
    
    public Carte (String leNom, int[] laPositionDepart, int[][] laPositionArrivee, String leFichierImage) {
        nom = leNom;
        positionDepart = laPositionDepart;
        positionArrivee = laPositionArrivee;
        fichierImage = leFichierImage; 
    }
}
