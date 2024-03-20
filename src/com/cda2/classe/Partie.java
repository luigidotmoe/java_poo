package com.cda2.classe;

public class Partie {

    //attributs
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    //constructeur

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    //getter et setters

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    //méthodes

    public String lancerPartie() {
        for (int i = nbrTour; i > 0; i--) {
            this.joueur1.attaquer(this.joueur2);
            if (this.joueur2.getVie() <= 0) {
                return this.joueur1.getNom() + " a gagné la partie";
            }
            this.joueur2.attaquer(this.joueur1);
            if (this.joueur1.getVie() <= 0) {
                return this.joueur2.getNom() + " a gagné la partie";
            }
        }
        return "Egalité";
    }
}
