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
    public HashMap<String, Carte> cartes = new HashMap<String, Carte>();
    public int directionAdverse; // 1 lorsque on doit monter pour rejoindre le temple adverse, -1 si on doit descendre
    public int[] templeAdverse;
    
    //création des méthodes:
    
    // @param direction : 1 lorsque on doit monter pour rejoindre le temple adverse, 
    //      -1 si on doit descendre
    public Joueur (String nomJoueur, Carte[] cartesJoueurs,
            int direction){
        nom = nomJoueur; 
        for(Carte carte : cartesJoueurs) {
            cartes.put(carte.fichierImage, carte);
        }
        directionAdverse = direction;
        if (directionAdverse == 1) {
            templeAdverse = new int[] {4, 2};
        } else {
            templeAdverse = new int[] {0, 2};
        }
        
    }
}
