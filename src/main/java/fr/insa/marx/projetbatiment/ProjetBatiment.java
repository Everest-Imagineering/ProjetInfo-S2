/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.marx.projetbatiment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


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
        
        //ArrayList<Revetement> Revetements = new ArrayList<>();
        //Revetements.add(LectureRevetements(Revetements, Revetements.size()));
        
        //system.out.println(Revetements.get(1).getNom());
        
    }
    
    public Revetement LectureRevetements(ArrayList<Revetement> Revetements, int indice) {
	try {
            // Création d'un fileReader pour lire le fichier
            FileReader fileReader = new FileReader("revetements.txt");
            
            // Création d'un bufferedReader qui utilise le fileReader
            BufferedReader reader = new BufferedReader(fileReader);
			
            // une fonction à essayer pouvant générer une erreur
            String line = reader.readLine();
            
            int separateurs[] = new int[5];
            int compt = 0;
            int tempId = 0;
            double tempPrix = 0;
            boolean tempPourSol, tempPourMur,tempPourPlafond;
            String tempNom;
            char tempChar[] = new char[20];
            int faireUnNouveau = 0;
                        
            while (line != null) {
                // affichage de la ligne
                System.out.println(line);
                
                for (int i=0; i<line.length(); i++) {
                    if (";".equals(line.charAt(i))) { //on crée un tabeau avec les emplacements des ";"
                        separateurs[compt]=i;
                        compt++;
                    }
                }
                line.getChars(separateurs[0], separateurs[1], tempChar, 0);
                tempNom = Arrays.toString(tempChar);
                tempPourMur = ("1".equals(line.charAt(separateurs[1]+1)));
                tempPourSol = ("1".equals(line.charAt(separateurs[2]+1)));
                tempPourPlafond = ("1".equals(line.charAt(separateurs[3]+1)));
                
                for (int i=0; i<line.length(); i++){
                    if (!(";".equals(line.charAt(i)))) {
                        if (i < separateurs[0]) {
                            tempId += line.charAt(i) * Math.pow(10, separateurs[0]-i);
                        }
                        if (i > separateurs[4]) {
                            tempPrix +=line.charAt(i) * Math.pow(10, separateurs[4]-(i+2));
                        }
                    }
                }
                for (int i =0; i<indice; i++){
                    if (!(Revetements.get(i).getIdRev()==tempId)) {
                        faireUnNouveau = 1;
                    } else {
                        faireUnNouveau = 0;
                    }
                }
                if (faireUnNouveau ==1) {
                    return new Revetement(tempId, tempNom, tempPourPlafond, tempPourSol, tempPourMur, tempPrix);
                }
                // lecture de la prochaine ligne
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
