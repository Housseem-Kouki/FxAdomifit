/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adomifitregime;


import entites.Billet;
import entites.CategorieEvenement;
import entites.Evenement;
import utils.DataSource;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;
import java.util.Date; 
import services.BilletService;
import services.CategorieEvenementService;
import services.EvenementService;
/**
 *
 * @author Kouki
 */
public class AdomifitRegime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategorieEvenementService serv = new CategorieEvenementService();
         EvenementService servReg = new EvenementService();
         
       
        // Categorie evenement crud 
        //affichage All
   //CategorieEvenementService serv = new CategorieEvenementService();
      //serv.getAll().forEach(System.out::println);
       
       
       
        // insertion categorie
        //stat color length in db = 7
       //CategorieEvenement cr = new CategorieEvenement("Test123","Test123","test123");
     //serv.addCategorieEvenement(cr);
        
        // delete categorie
        //serv.deleteCategorieEvenement(52);

        //get one categorie
       ///CategorieEvenement cr = new CategorieEvenement();   
        //cr = serv.getCategorieEvenement(44);
        //System.out.println(cr.toString());

        //update Categorie    
        //CategorieEvenement cre = new CategorieEvenement(54,"myriam","myriam","up");
        //serv.update(cre);
        //System.out.println(cre.toString());
       







//Evenement Crud

             //affichage All Evenements
           EvenementService servEv= new EvenementService();
      servEv.getAll().forEach(System.out::println);

        // insertion Evenement
     //Evenement r = new Evenement(" desk", " desk", " desk", 120, 9, 58);
    // servEv.addEvenement(r);

        // delete evenement
        //servEv.deleteEvenement(57);


        //get one evenement
        //Evenement re = new Evenement();   
        //re = servEv.getEvenement(51);
        //System.out.println(re.toString());

        //update evenement   
       //Evenement rev = new Evenement(51, "updated", "updated", "updated", 167, 9, 53);
      //servEv.updateEvenement(rev);



      
      //Billet Crud

             //affichage All Evenements
             BilletService servbil= new BilletService();
       servbil.getAll().forEach(System.out::println);

        // insertion Billet
     //Billet b = new Billet(52, " desk", 120,58);
       //servbil.addBillet(b);

        // delete evenement
        //servbil.deleteBillet(9);


        //get one evenement
        //Evenement re = new Evenement();   
        //re = servEv.getEvenement(51);
        //System.out.println(re.toString());

        //update evenement   
       //Evenement rev = new Evenement(51, "updated", "updated", "updated", 167, 9, 53);
      //servEv.updateEvenement(rev);













             
        
    }
    
}
