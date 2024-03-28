/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.marx.projetbatiment;

/**
 *
 * @author emarx02
 */
public class Mur {
    
    private int id, rev1, rev2, rev3, portes, fenetres;
    private double separation;
    private Coin pt1, pt2;

    public Mur(Coin pt1, Coin pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.separation = 0;
        this.fenetres = 0;
        this.portes = 0;
    }

    public Mur(Coin pt1, Coin pt2, double separation) {
        this.separation = separation;
        this.pt1 = pt1;
        this.pt2 = pt2;
    }
    
    public double Longueur(){
        double longueur;
        longueur = Math.sqrt((this.pt1.getX()-this.pt2.getX())*(this.pt1.getX()-this.pt2.getX()) + (this.pt1.getY()-this.pt2.getY())*(this.pt1.getY()-this.pt2.getY()));
    return longueur;
    }
    
    public double Surface(){
        double surface;
        if (this.separation == 0) {
            surface = this.Longueur() * this.pt1.getEtage().getHauteur();
        } else {
            surface = this.Longueur() * this.separation;
        }
    return surface;
    }
    
    public double SurfaceHaut(){
        double surface;
        if (this.separation == 0) {
            surface = 0;
        } else {
        surface = this.Longueur() * (this.pt1.getEtage().getHauteur() - this.separation);
        }
    return surface;
    }
}
