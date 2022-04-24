/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package guiRegime;

import entites.Regime;
import entites.SuiviRegime;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import services.RegimeService;
import services.SuiviRegimeService;

/**
 * FXML Controller class
 *
 * @author Kouki
 */
public class ShowSuiviRegimeController implements Initializable {

    @FXML
    private Label nomNutritionniste;
   
    @FXML
    private Label typeRegime;

    @FXML
    private Label titreSuivi;

    @FXML
    private Label noteSuivi;

    @FXML
    private Text remarqueSuivi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // get suivi user connecté session   
        SuiviRegimeService servSuiv = new SuiviRegimeService();
        RegimeService servReg = new RegimeService();
        //session remplace 2
        SuiviRegime suivi = servSuiv.getSuiviUser(2); 
  
        
        if(suivi.getTitre()==null){
             this.titreSuivi.setText("Titre non encore attribué");
        }else{
             this.titreSuivi.setText(suivi.getTitre());
        }
        
        
         if(suivi.getRemarque()==null){
             this.remarqueSuivi.setText("Votre nutritionniste n'a pas encore servi une remarque");
        }else{
             this.remarqueSuivi.setText(suivi.getRemarque());
        }
         
         
               
        this.noteSuivi.setText(String.valueOf(suivi.getNote()));

        Regime reg = servReg.getRegime(suivi.getRegime_id());
        this.typeRegime.setText(reg.getType());
      
        
    } 
    
     
    
}
