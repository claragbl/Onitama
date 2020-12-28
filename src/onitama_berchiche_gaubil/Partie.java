/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama_berchiche_gaubil;

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;

/**
 *
 * @author claragaubil
 */
public class Partie implements IPartie {
    
    //création des attributs:
    
    private Carte[] tasDeCartes;
    //key = index, Hasmap: pour avoir l'indexe qu'on veut, value: type d'objet
    //sur lequel pointe l'index (key). 
    //On prend les noms de joueurs en entrée des methode, pour avoir accès aux 
    //objets de types joueur. 
    private HashMap<String, Joueur> joueurs = new HashMap<String, Joueur>();
    private Carte carteFlottante;
    private Joueur joueurCourant;
    private Cellule[][] grille = new Cellule[5][5];
    private Carte carteChoisie;
    private int[] coordoneesDepart;
    private int[] coordoneesArrivee;
    
    
    
    //méthodes: 
    
    
    public void initialiserPartie(String  nom1, String couleur1, String nom2, String couleur2){
        //création des cartes
        //-------------------
        Carte carte1 = new Carte("Dragon", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageDragon");
        Carte carte2 = new Carte("Mante", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageMante");
        Carte carte3 = new Carte("Cheval", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageCheval");
        Carte carte4 = new Carte("Sanglier", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}}  , "fichierImageSanglier");
        Carte carte5 = new Carte("Grenouille", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}}  , "fichierImageGrenouille");
        Carte carte6 = new Carte("Singe", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageSinge");
        Carte carte7 = new Carte("Crabe", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageCrabe");
        Carte carte8 = new Carte("Oie", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageOie");
        Carte carte9 = new Carte("Tigre", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageTigre");
        Carte carte10 = new Carte("Coq", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageCoq");
        Carte carte11 = new Carte("Grue", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageGrue");
        Carte carte12 = new Carte("Anguille", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageAnguille");
        Carte carte13 = new Carte("Cobra", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageCobra");
        Carte carte14 = new Carte("Boeuf", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageBoeuf");
        Carte carte15 = new Carte("Lapin", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageLapin");
        Carte carte16 = new Carte("Elephant", new int[] {2, 2}, 
                new int[][] {{3, 0},{1, 1}, {1, 3}, {3, 4}} , "fichierImageElephant");
        
        tasDeCartes = new Carte[] {carte1, carte2, carte3, carte4, carte5, 
            carte6, carte7, carte8, carte9, carte10, carte11, carte12, carte13, 
            carte14, carte15, carte16};
        
        //distribution des cartes
        //------------------------
        Random tirage = new Random();
        int[] tabTirage = tirage.ints(0, 15).distinct().limit(5).toArray();
        //tirage.ints(0, 15) génère un flux de nombre 
        //.distinct()
        
        Carte[] cartesJoueur1 = new Carte[2];
        cartesJoueur1[0] = tasDeCartes[tabTirage[0]];
        cartesJoueur1[1] = tasDeCartes[tabTirage[1]];
        
        Joueur joueur1 = new Joueur(nom1, couleur1, cartesJoueur1, new int[] {4, 2}); //joueur 1 en bas
        
        Carte[] cartesJoueur2 = new Carte[2];
        cartesJoueur2[0] = tasDeCartes[tabTirage[2]];
        cartesJoueur2[1] = tasDeCartes[tabTirage[3]];
        
        Joueur joueur2 = new Joueur(nom2, couleur2, cartesJoueur2, new int[] {0, 2});
        
        joueurs.put(nom1, joueur1);
        joueurs.put(nom2, joueur2);
        
        carteFlottante = tasDeCartes[tabTirage[4]];
        
        joueurCourant = joueur1;
        
        //disposer les pions sur la grille:
        //---------------------------------
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grille[i][j] = new Cellule();
            }
        }
        grille[0][0].ajouterPiece(new Piece(typePiece.PION, joueur1));
        grille[0][1].ajouterPiece(new Piece(typePiece.PION, joueur1));
        grille[0][2].ajouterPiece(new Piece(typePiece.ROI, joueur1));
        grille[0][3].ajouterPiece(new Piece(typePiece.PION, joueur1));
        grille[0][4].ajouterPiece(new Piece(typePiece.PION, joueur1));
        
        grille[4][0].ajouterPiece(new Piece(typePiece.PION, joueur2));
        grille[4][1].ajouterPiece(new Piece(typePiece.PION, joueur2));
        grille[4][2].ajouterPiece(new Piece(typePiece.ROI, joueur2));
        grille[4][3].ajouterPiece(new Piece(typePiece.PION, joueur2));
        grille[4][4].ajouterPiece(new Piece(typePiece.PION, joueur2));
        
        
    }    
    public boolean choisirCarte(String fichierImage){
        Carte carte = joueurCourant.cartes.get(fichierImage);
        if (carte == null) {
            return false;
        } else {
            carteChoisie = carte;
            return true;
        }
        
    }
    public boolean choisirPiece(int[] coordonnees){
        Piece piece = grille[coordonnees[0]][coordonnees[1]].recupererContenu();
        if (piece != null) {
            if (piece.appartientJoueur(joueurCourant)) {
                coordoneesDepart = coordonnees;
                return true;
            } else {
            return false;
            }
        } else {
            return false;
        }
        
    }
    public boolean choisirDestination(int[] coordonnees){
        int[][] destinationsPossibles = new int[carteChoisie.positionArrivee.length][];
        for(int i = 0; i < carteChoisie.positionArrivee.length; i++) {
            destinationsPossibles[i] = new int[] 
            {(carteChoisie.positionArrivee[i][0] - carteChoisie.positionDepart[0] + coordoneesDepart[0]), 
                (carteChoisie.positionArrivee[i][1] - carteChoisie.positionDepart[1] + coordoneesDepart[1])};
        }
        for (int[] xy : destinationsPossibles) {
            if (xy[0] == coordonnees[0]) {
                if (xy[1] == coordonnees[1]) {
                    coordoneesArrivee = coordonnees;
                    return true;
                } 
            }
        }
        return false;
    }
    
    public boolean jouerCoup(){
        boolean gagne = false;
        if ((coordoneesArrivee[0] == joueurCourant.templeAdverse[0]) && 
                (coordoneesArrivee[1] == joueurCourant.templeAdverse[1])) {
            gagne = true;
        }
        
        Cellule celluleDestination = grille[coordoneesArrivee[0]][coordoneesArrivee[1]];
        Cellule celluleDepart = grille[coordoneesDepart[0]][coordoneesDepart[1]];
        
        if (celluleDestination.recupererContenu() != null) {
            if (celluleDestination.recupererContenu().type == typePiece.ROI) {
                gagne = true;
            }
        }
        
        celluleDestination.ajouterPiece(celluleDepart.recupererContenu());
        celluleDepart.supprimerPiece();
        
        joueurCourant.cartes.put(carteFlottante.fichierImage, carteFlottante);
        joueurCourant.cartes.remove(carteChoisie.fichierImage);
        carteFlottante = carteChoisie;
        
        for(Joueur joueur : joueurs.values()) {
            if (joueur != joueurCourant) {
                joueurCourant = joueur;
                break;
            }
        }
        
        carteChoisie = null;
        coordoneesDepart = null;
        coordoneesArrivee = null;
        
        return gagne;
    }
    
    //retourne le nom du fichier image de la carte flottante
    public String carteFlottante(){
        return carteFlottante.fichierImage;
    }
    
    //retourne la liste des noms de fichier des cartes d'un joueur
    public String[] listeCartes(String nomJoueur){
        Joueur joueurTrouve = joueurs.get(nomJoueur); //recuperer la value en fonction de la key: HashMap<key, value>
        if (joueurTrouve == null) {
            return new String [] {""}; 
        } else {
            String[] tabFichier = joueurTrouve.cartes.keySet().toArray(new String[0]); //toArray() renvoie un tableau de type Object
            return tabFichier;
        }
    }
    
    //retourne le nom du joueur courant
    public String joueurCourant(){
        return (joueurCourant.nom);
    }
    
    
 
}
