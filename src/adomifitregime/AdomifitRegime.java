/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adomifitregime;

import entites.Calendar;
import entites.CategorieRegime;
import entites.Regime;
import entites.SuiviRegime;
import services.CalendarService;
import services.CategorieRegimeService;
import services.RegimeService;
import services.SuiviRegimeService;
import utils.DataSource;
import java.text.SimpleDateFormat;  
import java.time.LocalDate;
import java.util.Date; 
/**
 *
 * @author Kouki
 */
public class AdomifitRegime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategorieRegimeService serv = new CategorieRegimeService();
         RegimeService servReg = new RegimeService();
         SuiviRegimeService servSuiv = new SuiviRegimeService();
         CalendarService servCalendar = new CalendarService();
        // Categorie regime crud 
        //affichage All
//       CategorieRegimeService serv = new CategorieRegimeService();
//       serv.getAll().forEach(System.out::println);
       
       
       
        // insertion categorie
        //stat color length in db = 7
//        CategorieRegime cr = new CategorieRegime("desktopTest","desktopTest","desktop");
//        serv.addCategorieRegime(cr);
        
        // delete categorie
//        serv.deleteCategorieRegime(76);

        //get one categorie
//        CategorieRegime cr = new CategorieRegime();   
//        cr = serv.getCategorieRegime(9);
//        System.out.println(cr.toString());

        //update Categorie    
//        CategorieRegime cr = new CategorieRegime(16,"salut","up","up");
//        serv.update(cr);
        
       









             //affichage All Regimes
//        RegimeService servReg = new RegimeService();
//       servReg.getAll().forEach(System.out::println);

        // insertion regime
//      Regime r = new Regime("salut desk", "salut desk", "salut desk", "salut desk", 120, 9, 2);
//       servReg.addRegime(r);

        // delete regime
//        servReg.deleteRegime(193);


        //get one regime
//        Regime r = new Regime();   
//        r = servReg.getRegime(25);
//        System.out.println(r.toString());

        //update regime    
//       Regime r = new Regime(194, "updated", "updated", "updated", "updated", 167, 9, 2);
//        servReg.updateRegime(r);
















             //affichage All suivis
 //              servSuiv.getAll().forEach(System.out::println);

         // insertion suivi
//         SuiviRegime sr = new SuiviRegime("new desktop", "new desktop", 16, 24, 1);
//         servSuiv.addSuiviRegime(sr);

                    // delete suivi
              //   servSuiv.deleteSuiviRegime(45);
              
              
                      //get one suivi
//            SuiviRegime sr = new SuiviRegime();
//            sr = servSuiv.getSuiviRegime(46);
//            System.out.println(sr.toString());

        //update suivi
//        SuiviRegime sr = new SuiviRegime(46, "updated", "updated", 2, 24, 1);
//        servSuiv.update(sr);





              
              
             //affichage All calendar
//             servCalendar.getAll().forEach(System.out::println); 

         // insertion calendar LocalDate.parse("2018-05-05")
       //  Calendar c = new Calendar("new",new Date("2018-05-05") , LocalDate.parse("2018-05-05"), "new calendar", true, "new cal", "new cal", "new cal", 19, true);
//         SuiviRegime sr = new SuiviRegime("new desktop", "new desktop", 16, 24, 1);
//         servSuiv.addSuiviRegime(sr);

 
       




             //affichage All calendar
      CalendarService serCal = new CalendarService();
       serCal.getAll().forEach(System.out::println);
       
       
       
       
    }
    
}
