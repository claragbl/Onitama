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
public class Onitama_berchiche_gaubil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IPartie partie = new Partie();
        
        
        // les lignes suivantes sont pour tester
        // elles doivent être supprimées ou commentées
        // ce scénario de test ne fonctionne que si toutes les cartes sont de dragons
        partie.initialiserPartie("clara", "didier");
        System.out.println("");
        System.out.println("---tour 1---");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes("clara")[0]));
        System.out.println("choisirPiece coordonnées fausses " + partie.choisirPiece(new int[] {1, 0}));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {0, 0}));
        System.out.println("choisirDestination coordonnées fausse " + partie.choisirDestination(new int[] {1, 3}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {1, 2}));
        System.out.println("jouerCoup " + partie.jouerCoup());
        
        System.out.println("");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {4, 2}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {3, 0}));
        System.out.println("jouerCoup " + partie.jouerCoup());
        
        System.out.println("");
        System.out.println("---tour 2---");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {0, 1}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {1, 3}));
        System.out.println("jouerCoup " + partie.jouerCoup());

        System.out.println("");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {3, 0}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {2, 2}));
        System.out.println("jouerCoup " + partie.jouerCoup());
        
        System.out.println("");
        System.out.println("---tour 3---");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {0, 3}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {1, 1}));
        System.out.println("jouerCoup " + partie.jouerCoup());

        System.out.println("");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {2, 2}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {1, 0}));
        System.out.println("jouerCoup " + partie.jouerCoup());
        
        System.out.println("");
        System.out.println("---tour 4---");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {0, 4}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {1, 2}));
        System.out.println("jouerCoup " + partie.jouerCoup());

        System.out.println("");
        System.out.println("joueurCourant " + partie.joueurCourant());
        for (String fichier : partie.listeCartes(partie.joueurCourant())) {
            System.out.println("carte " + partie.joueurCourant() + " " + fichier);
        }
        System.out.println("carte flottante " + partie.carteFlottante());
        System.out.println("choisir carte " + partie.choisirCarte(partie.listeCartes(partie.joueurCourant())[0]));
        System.out.println("choisirPiece coordonnées bonnes " + partie.choisirPiece(new int[] {1, 0}));
        System.out.println("choisirDestination coordonnées bonnes " + partie.choisirDestination(new int[] {0, 2}));
        System.out.println("jouerCoup " + partie.jouerCoup());
    }
}
