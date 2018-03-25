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
public class Manager_EingabeController implements Initializable {

    @FXML
    private AnchorPane ap_CEO;
    @FXML
    private Label lbl_Titel1;
    @FXML
    private TextField Tf_Name1;
    @FXML
    private Button btn_einlesen1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction_Einlesen(ActionEvent event) throws IOException {
        Counter.Mcounter +=1;
        if(Tf_Name1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Name nicht vorhanden.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Name des Mitarbeiters nicht vorhanden.\n");
        }else{
        System.out.println("Manager wird erstellt\n");
        
        Mitarbeiter_Liste.addMitarbeiter(Tf_Name1.getText(), "Manager 0"+Counter.Mcounter);
        
        //todo
        System.out.println("Manager wurde erstellt\n");
        
//        FXMLDocumentController.enableButton();
            System.out.println(Counter.Mcounter);
        
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        ap_CEO.getChildren().setAll(pane);
        System.out.println("Switched to Home\n");
        
        
        }
    }
    
}
