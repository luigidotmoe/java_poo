package com.cda2.classe;

public class Habitation {
    //attributs
    private String nom;
    private double longueur;
    private double largeur;

    private int nbrEtages;

    // constructeurs
    public Habitation() {
    }

    public Habitation(String nom, double longueur, double largeur, int nbrEtages) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
        this.nbrEtages = nbrEtages;
    }

    //getter et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public int getNbrEtages() {
        return nbrEtages;
    }

    public void setNbrEtages(int nbrEtages) {
        this.nbrEtages = nbrEtages;
    }

    //méthode
    public double surface() {
        return this.longueur * this.largeur * this.nbrEtages;
    }
}
