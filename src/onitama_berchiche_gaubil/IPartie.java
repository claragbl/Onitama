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
public interface IPartie {
    
    public void initialiserPartie(String  nom1, String couleur1, String nom2, String couleur2);        
    public boolean choisirCarte(String fichierCarte);
    public boolean choisirPiece(int[] coordonnees);
    public boolean choisirDestination(int[] coordonnees);
    public boolean jouerCoup();
    public String carteFlottante();
    public String[] listeCartes(String nomJoueur);
    public String joueurCourant();
}
