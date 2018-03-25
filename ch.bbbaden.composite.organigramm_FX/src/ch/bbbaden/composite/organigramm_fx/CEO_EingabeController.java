/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.composite.organigramm_fx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class CEO_EingabeController implements Initializable {

    @FXML
    private Label lbl_Titel1;
    @FXML
    private TextField Tf_Name1;
    @FXML
    private Button btn_einlesen1;
    @FXML
    private AnchorPane ap_CEO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void handleButtonAction_Einlesen(ActionEvent event) throws IOException {
        
        if(Tf_Name1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Name nicht vorhanden.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Name des Mitarbeiters nicht vorhanden.\n");
        }else{
        System.out.println("CEO wird erstellt\n");
        
        Mitarbeiter CEO = new Mitarbeiter(Tf_Name1.getText(),"CEO"){};
        
        
        Mitarbeiter_Liste.addMitarbeiter(Tf_Name1.getText(),"CEO");
        
        System.out.println("CEO wurde erstellt\n");
        
//        FXMLDocumentController.enableButton();
        
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        ap_CEO.getChildren().setAll(pane);
        System.out.println("Switched to Home\n");
        
        
        }
    
    }
    
}
