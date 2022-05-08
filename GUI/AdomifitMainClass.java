/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author myria
 */
public class AdomifitMainClass extends Application {
    private double x , y ; 
    
    @Override
    public void start(Stage stage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("FrontEvenementC.fxml"));
            // Parent parent = FXMLLoader.load(getClass().getResource("CategorieEvenement.fxml"));
            Scene scene = new Scene(parent);
            scene.setFill(Color.TRANSPARENT);
            stage.setScene(scene);
            stage.initStyle(  StageStyle.TRANSPARENT);
            stage.show();
//                    stage.setTitle("Adomifit");
//        stage.setScene(new Scene(root));
//       
//        stage.show();
        } catch (IOException ex) {
            Logger.getLogger(AdomifitMainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
