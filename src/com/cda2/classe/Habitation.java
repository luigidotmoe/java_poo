package com.cda2.classe;

public class Habitation {
    //attributs
    private String nom;
    private double longueur;
    private double largeur;

    // constructeurs
    public Habitation() {
    }

    public Habitation(String nom, double longueur, double largeur) {
        this.nom = nom;
        this.longueur = longueur;
        this.largeur = largeur;
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

    //méthode
    public double surface() {
        return this.longueur * this.largeur;
    }
}
