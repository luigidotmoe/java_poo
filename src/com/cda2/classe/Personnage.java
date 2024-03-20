package com.cda2.classe;

public class Personnage {
    //Attributs
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    //Constructeurs
    public Personnage() {
    }

    public Personnage(String nom, int vie, int attaque, int defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    //Getter et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    //Méthodes
    public void attaquer(Personnage cible) {
        int degats = this.attaque - cible.defense;
        if (degats < 0) {
            degats = 0;
        }
        cible.vie -= degats;
    }
}
