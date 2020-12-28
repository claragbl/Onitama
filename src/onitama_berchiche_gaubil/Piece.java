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
enum typePiece {
    ROI,
    PION
}

public class Piece {
    public typePiece type;
    private Joueur joueur;
    
    public Piece (typePiece piece, Joueur unJoueur) {
        type = piece; 
        joueur = unJoueur;
    }
    
    public boolean appartientJoueur(Joueur unJoueur) {
        return (unJoueur == joueur);
    }
}
