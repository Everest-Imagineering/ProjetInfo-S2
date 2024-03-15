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
        Etage e1 = new Etage(0,2.5);
        Coin c1 = new Coin(1,0,1,e1);
        Coin c2 = new Coin(2,1,0,e1);
        Mur m1 = new Mur(c1,c2);
        System.out.println(m1.Surface());
        

    }
}
