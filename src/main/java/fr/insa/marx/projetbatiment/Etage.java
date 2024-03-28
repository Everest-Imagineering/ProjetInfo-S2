/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.marx.projetbatiment;
import java.util.*;
/**
 *
 * @author emarx02
 */
public class Etage {
    private int id;
    private double hauteur;
    private ArrayList<Pièce> pieces;

    public Etage(int id, double hauteur) {
        this.id = id;
        this.hauteur = hauteur;
    }

    public void Ajouter(Piece p) {
        this.pieces.add(p);
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
