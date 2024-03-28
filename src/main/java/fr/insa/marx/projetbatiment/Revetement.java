/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.marx.projetbatiment;
import java.io.* ; 


/**
 *
 * @author emarx02
 */
public class Revetement {
    private boolean pourPlafond, pourSol, pourMur;
    private int idRev;
    private double prixUnitaire;
    private String nom;
        
    public {
	try {
            // Création d'un fileReader pour lire le fichier
            FileReader fileReader = new FileReader("/path/to/the/file");
            
            // Création d'un bufferedReader qui utilise le fileReader
            BufferedReader reader = new BufferedReader(fileReader);
			
            // une fonction à essayer pouvant générer une erreur
            String line = reader.readLine();
            int separateurs[] = new int[5];
            
            while (line != null) {
                // affichage de la ligne
                System.out.println(line);
                
                for (int i=0; i<line.length(); i++) {
                    if (line.copyValueOf(i).equals(";") == 1) {
                    
                    }
                }
                // lecture de la prochaine ligne
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean isPourPlafond() {
        return pourPlafond;
    }

    public void setPourPlafond(boolean pourPlafond) {
        this.pourPlafond = pourPlafond;
    }

    public boolean isPourSol() {
        return pourSol;
    }

    public void setPourSol(boolean pourSol) {
        this.pourSol = pourSol;
    }

    public boolean isPourMur() {
        return pourMur;
    }

    public void setPourMur(boolean pourMur) {
        this.pourMur = pourMur;
    }

    public int getIdRev() {
        return idRev;
    }

    public void setIdRev(int idRev) {
        this.idRev = idRev;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
