package sio.demo;

public class Voiture {
    private int vitesseAct;
    private static int vitesseMax = 120;
    private String nom;
    private String couleur;

    public Voiture(String nom, String couleur) {
        this.vitesseAct = 0;
        this.nom = nom;
        this.couleur = couleur;
    }

    public Voiture(String nom) {
        this.vitesseAct = 0;
        this.nom = nom;
    }

    public int getVitesseAct() {
        return vitesseAct;
    }

    public static int getVitesseMax() {
        return vitesseMax;
    }

    public String getNom() {
        return nom;
    }

    public String getCouleur() {
        return couleur;
    }
}
