/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import carnet.*;
import entree.Entree;
import entree.Presentation;
import entree.Sens;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author leon
 */
public class TestLecture {
    
    public static void main(String[] args) throws IOException{
        
        Carnet carnet=new Carnet();
        ArrayList<Entree> entree= new ArrayList<>();
        carnet.lectureFichier("fichier.txt"); //Li le fichier et instancie les Personnes et Société
        System.out.println("\n");
        
        entree = carnet.recherche("Dumbledore");
        for(int i=0;i<entree.size();i++)
            System.out.println(entree.get(i).toString(Presentation.ABREGE, Sens.NOM_PRENOMS));
        
        //carnet.afficher(Ordre.DECROISSANT, Presentation.ABREGE, Sens.NOM_PRENOMS);
        
        

        
    }   
    
}
