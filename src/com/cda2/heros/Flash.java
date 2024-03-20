package com.cda2.heros;

public class Flash extends Personnage implements Competence {

    //Constructeur
    public Flash(String nom, int vie, int attaque, int defense) {
        super(nom, vie, attaque, defense);
    }

    //Méthodes
    @Override
    public void attaquer(Object cible) {
        Personnage ciblePersonnage = (Personnage) cible;
        int degats = this.getAttaque() - ciblePersonnage.getDefense();
        if (degats < 0) {
            degats = 0;
        }
        ciblePersonnage.setVie(ciblePersonnage.getVie() - degats);
        System.out.println(this.getNom() + " attaque " + ciblePersonnage.getNom() + " et lui inflige " + degats + " points de dégâts.");
    }
}
