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
public class Cellule {
    private Piece contenu;
    
    public void supprimerPiece() {
        contenu = null;
    }
    
    public void ajouterPiece(Piece unePiece) {
        contenu = unePiece;
    }
    
    public Piece recupererContenu() {
        return contenu;
    }
}
