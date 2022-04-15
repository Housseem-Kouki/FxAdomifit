/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package guiRegime;

import entites.CategorieRegime;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import services.CategorieRegimeService;

/**
 * FXML Controller class
 *
 * @author Kouki
 */
public class CategorieRegimeController implements Initializable {
   
    @FXML
    private TableView<CategorieRegime>tabCategories;
    
    @FXML
    private Pane ContentPaneGestionnaire;
   @FXML
    private AnchorPane root;
    private Parent fxml;
    @FXML
    private TableColumn<CategorieRegime, String> colLibelle;

    @FXML
    private TableColumn<CategorieRegime, String> colDescription;

    @FXML
    private TableColumn<CategorieRegime, String> colStatColor;

    @FXML
    private Button btn_listCategorie;

    @FXML
    private Button btn_mesRegimes;

    @FXML
    private Button btn_Statistique;

    @FXML
    private Button btn_ListSuivi;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("saluttttttttttttttttttttttttttttttttt");
          CategorieRegimeService cs = new CategorieRegimeService();
        List<CategorieRegime> CatList =  cs.getAll();
         System.out.println("ssss"+CatList);
        ObservableList<CategorieRegime> ob = FXCollections.observableArrayList(CatList);
       colLibelle.setCellValueFactory(new PropertyValueFactory<>("libelle"));
       
       colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
       colStatColor.setCellValueFactory(new PropertyValueFactory<>("statcolor"));
       tabCategories.setItems(ob);
    }    
  
         @FXML
    void showListCtegorieRegime(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("CategorieRegime.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(CategorieRegimeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void showListeSuivis(MouseEvent event) {

    }

    @FXML
    void showMesRegimes(MouseEvent event) {
        try {
            fxml = FXMLLoader.load(getClass().getResource("MesRegimes.fxml"));
            root.getChildren().removeAll();
            root.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(CategorieRegimeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void showStatistique(MouseEvent event) {

    }
    
    
    
}
