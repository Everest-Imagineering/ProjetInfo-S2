/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.marx.projetbatiment;
import java.util.ArrayList ;



public class Pièce {
    private ArrayList<Coin> coins ;

    public Pièce() {
        this.coins = new ArrayList() ;
    }

   

    
    
    
    
    public void addCoin(Coin a) {
    this.coins.add(a) ;
    }
    public double Surface() {
        double surface = 0 ;
        int i ;
        
        for (i=0 ; i<coins.size()-1 ; i++) {            
        surface = surface + (this.coins.get(i).getX()* this.coins.get(i+1).getY() - this.coins.get(i+1).getX()* this.coins.get(i).getY());    
        }
        surface = surface + (this.coins.get(coins.size()-1).getX()* this.coins.get(0).getY() - this.coins.get(0).getX()* this.coins.get(coins.size()-1).getY());
        
    surface = surface/2 ;
    return surface;
    } 

    @Override
    public String toString() {
        return "Pi\u00e8ce{" + "coins=" + coins + '}';
    }
        
}


