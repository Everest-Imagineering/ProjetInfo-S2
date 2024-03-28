/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.marx.projetbatiment;

/**
 *
 * @author emarx02
 */
public class Etage {
    private int id;
    private double hauteur;

    public Etage(int id, double hauteur) {
        this.id = id;
        this.hauteur = hauteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Etage{" + "id=" + id + ", hauteur=" + hauteur + '}';
    }
    
    
}
