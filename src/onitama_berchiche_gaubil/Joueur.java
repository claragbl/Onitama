/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package onitama_berchiche_gaubil;

import java.util.HashMap;
/**
 *
 * @author claragaubil
 */
public class Joueur {
    //création des attributs: 
    
    public String nom;
    private String couleur;
    public HashMap<String, Carte> cartes = new HashMap<String, Carte>();
    public int[] templeAdverse;
    
    //création des méthodes:
    
    public Joueur (String nomJoueur, String couleurJoueur, Carte[] cartesJoueurs,
            int[] coordonnesTemple){
        nom = nomJoueur; 
        couleur = couleurJoueur; 
        for(Carte carte : cartesJoueurs) {
            cartes.put(carte.fichierImage, carte);
        }
        templeAdverse = coordonnesTemple;
    }
}
