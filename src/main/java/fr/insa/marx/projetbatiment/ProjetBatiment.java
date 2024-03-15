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
        
        Coin c1 = new Coin(1,0,1);
        Coin c2 = new Coin(2,1,0);
        Mur m1 = new Mur(c1,c2);
        System.out.println(m1.Longueur());
        
        //Coin Coins[] = new Coin[4];
        //for (int i =0; i<4; i++){
        //    Coins[i].setId(i);
        
        //}

    }
}
