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
    
    private int id, portes, fenetres;
    private double separation;
    private Coin pt1, pt2;
    private String rev1, rev2, rev3;

    public Mur(Coin pt1, Coin pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.separation = 0;
        this.fenetres = 0;
        this.portes = 0;
        this.rev1 = "Peinture";
        this.rev2 = "Peinture";
        this.rev2 = "Peinture";
    }

    public Mur(Coin pt1, Coin pt2, double separation) {
        this.separation = separation;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.rev1 = "Peinture";
        this.rev2 = "Peinture";
        this.rev2 = "Peinture";
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public int getFenetres() {
        return fenetres;
    }

    public void setFenetres(int fenetres) {
        this.fenetres = fenetres;
    }

    public double getSeparation() {
        return separation;
    }

    public void setSeparation(double separation) {
        this.separation = separation;
    }

    public Coin getPt1() {
        return pt1;
    }

    public void setPt1(Coin pt1) {
        this.pt1 = pt1;
    }

    public Coin getPt2() {
        return pt2;
    }

    public void setPt2(Coin pt2) {
        this.pt2 = pt2;
    }

    public String getRev1() {
        return rev1;
    }

    public void setRev1(String rev1) {
        this.rev1 = rev1;
    }

    public String getRev2() {
        return rev2;
    }

    public void setRev2(String rev2) {
        this.rev2 = rev2;
    }

    public String getRev3() {
        return rev3;
    }

    public void setRev3(String rev3) {
        this.rev3 = rev3;
    }
    
}
