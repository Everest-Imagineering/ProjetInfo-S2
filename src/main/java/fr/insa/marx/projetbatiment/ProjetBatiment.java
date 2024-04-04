/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.marx.projetbatiment;

/**
 *
 * @author emarx02
 */
public class ProjetBatiment {

    public static void main(String[] args) {
        
        Pièce salon = new Pièce(null) ;
        Etage rdc = new Etage(1,2);
        Coin c1 = new Coin (1,1,1,rdc);
        Coin c2 = new Coin (2,3,3,rdc);
        Coin c3 = new Coin (3,5,3,rdc);
        Coin c4 = new Coin (4,5,2,rdc);
        Coin c5 = new Coin (1,6,3,rdc);
        Coin c6 = new Coin (2,7,3,rdc);
        Coin c7 = new Coin (3,7,5,rdc);
        Coin c8 = new Coin (4,5,5,rdc);
        Coin c9 = new Coin (4,1,3,rdc);
        
        salon.addCoin(c1);
        salon.addCoin(c2);
        salon.addCoin(c3);
        salon.addCoin(c4);
        salon.addCoin(c5);
        salon.addCoin(c6);
        salon.addCoin(c7);
        salon.addCoin(c8);
        salon.addCoin(c9);
        
        System.out.println(salon.surface());
        //System.out.println(salon.toString());
        
       

    }
}
