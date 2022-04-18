/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package guiRegime;

import entites.CategorieRegime;
import entites.Regime;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.imageio.ImageIO;
import services.CategorieRegimeService;
import services.RegimeService;

/**
 * FXML Controller class
 *
 * @author Kouki
 */
public class FormRegimeController implements Initializable {
      ImageView imgView = new ImageView();
    private int regimeId;
    private boolean update;
    private FileChooser fileChooser;
    Image imgs;
     BufferedImage bf;
      ImageView imgv;
    @FXML
    private TextField typeTF;
    @FXML
    private TextArea descriptionTF;
    @FXML
    private TextField dificulteTF;
    @FXML
    private TextField imageTF;
    @FXML
    private ComboBox<CategorieRegime> CombolistCategorie;
    @FXML
    private Button btn_ajout;
    @FXML
    private TextField prixTF;
    @FXML
    private Label titreForm;
    @FXML
    private Button btn_cancel;
    @FXML
    private Button btnUpload;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CategorieRegimeService cs = new CategorieRegimeService();
         List<CategorieRegime> listcat = cs.getAll()   ;
          
        ObservableList<CategorieRegime> List = FXCollections.observableArrayList(listcat);
            CombolistCategorie.setItems(List);
        
          fileChooser= new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("GIF", "*.gif"),
                new FileChooser.ExtensionFilter("BMP", "*.bmp"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
    }    

    @FXML
    private void save(MouseEvent event) {
         if(typeTF.getText().equals("") || descriptionTF.getText().equals("") || dificulteTF.getText().equals("")
                 ||imageTF.getText().equals("")|| prixTF.getText().equals("") ||CombolistCategorie.getValue() == null ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Verifier tout les champs ! ");
            alert.showAndWait();
            return;
        }
          int p = 0;
        try {
             p = Integer.parseInt(prixTF.getText());
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception");
             Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("le prix est un nombre ! ");
            alert.showAndWait();
            return;
       
        }
        //ajout
        if (update == false) {
         // session id user connecté  2
         Regime r = new Regime(typeTF.getText(), descriptionTF.getText(), dificulteTF.getText(), imageTF.getText(), p,CombolistCategorie.getValue().getId(), 2);
        RegimeService rs = new RegimeService();
        rs.addRegime(r);
         
        
        }
    //update
        else{
          
            Regime r = new Regime(regimeId,typeTF.getText(), descriptionTF.getText(), dificulteTF.getText(), imageTF.getText(), p,CombolistCategorie.getValue().getId(), 2);
             RegimeService regserv = new RegimeService();
             regserv.updateRegime(r);
        
        }
        
        
        //redirect and refresh
        
          Stage stage = (Stage) typeTF.getScene().getWindow();
    // do what you have to do
    FXMLLoader loader = new FXMLLoader ();
                             loader.setLocation(getClass().getResource("MesRegimes.fxml"));
                             try {
                                loader.load();
                            } catch (IOException ex) {
                                Logger.getLogger(CategorieRegimeController.class.getName()).log(Level.SEVERE, null, ex);
                            }
        MesRegimesController controller = loader.getController();
        controller.displayTabRegime();
                          
                             Parent parent = loader.getRoot();
                            Stage staged = new Stage();
                            staged.setScene(new Scene(parent));
                            staged.initStyle(StageStyle.UTILITY);
                            staged.show(); 
    stage.close();
        
    }

    void setTextField(int id, String type, String description, String dificulte, CategorieRegime categorie, String image, float prix) {
        this.titreForm.setText("Modifier Régime");
        this.regimeId = id;
       this.typeTF.setText(type);
       this.descriptionTF.setText(description);
       this.dificulteTF.setText(dificulte);
       this.imageTF.setText(image);
       this.prixTF.setText(String.valueOf(prix));
       this.CombolistCategorie.setValue(categorie);
    }

    void setUpdate(boolean b) {
         this.update = b;
    }

    @FXML
    private void closeDialog(MouseEvent event) {
         Stage stage = (Stage) btn_cancel.getScene().getWindow();
    // do what you have to do
    stage.close();
    }

    @FXML
    private void uploadImage(MouseEvent event) {
        
        File file= fileChooser.showOpenDialog(null);
        try {
            String url=file.toURI().toURL().toString();
             System.out.println("file : "+url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(FormRegimeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         
       
    }
    
}
