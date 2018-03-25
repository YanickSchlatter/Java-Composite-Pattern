/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.composite.organigramm_fx;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Label lbl_Titel;
    @FXML
    private AnchorPane ap_home;
    @FXML
    private Button btn_nMe;
    @FXML
    private Button btn_Ausgabe;

    @FXML
    private Button btn_CEO;
    @FXML
    private Button btn_Sekretär;
    @FXML
    private Button btn_Manager;
    @FXML
    private Button btn_Arbeiter;
    @FXML
    private Button btn_Putza;
    @FXML
    private AnchorPane an_CEO;
    @FXML
    private Button btn_test;
    @FXML
    private ListView<String> lv_Mitarbeiter;
    
    private ArrayList<String>maN= Mitarbeiter_Liste.getAllMitarbeiterAL();
    @FXML
    private Button btn_Arbeiter2;
    @FXML
    private Button btn_Arbeiter3;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<String> maNoL = FXCollections.observableArrayList(maN);
        
        lv_Mitarbeiter.setItems(maNoL);
        
        if (Counter.firsttime == 0) {
            btn_Sekretär.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(true);
            
        }
        if (Counter.firsttime == 1) {
            btn_CEO.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(true);
        }
        if (Counter.Scounter == 1) {
            btn_Sekretär.setDisable(true);
            btn_CEO.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(true);
            btn_Manager.setDisable(false);
        }
        if(Counter.Mcounter==3){
            btn_CEO.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(false);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(true);
        }
        
         if(Counter.Acounter==5){
            btn_CEO.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(false);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(true);
        }
         if(Counter.A2counter==5){
            btn_CEO.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(false);
            btn_Putza.setDisable(true);
        }
         if(Counter.A3counter==5){
            btn_CEO.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(false);
            
        }
         if(Counter.Pcounter==3){
            btn_CEO.setDisable(true);
            btn_Manager.setDisable(true);
            btn_Arbeiter.setDisable(true);
            btn_Arbeiter2.setDisable(true);
            btn_Arbeiter3.setDisable(true);
            btn_Putza.setDisable(true);
        }

    }

    @FXML
    private void handleButtonAction_switch(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Ausgabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Ausgabe");
    }

    @FXML
    private void handleButtonAction_CEO(ActionEvent event) throws IOException {
        Counter.firsttime = 1;
        AnchorPane pane = FXMLLoader.load(getClass().getResource("CEO_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to CEO\n");
    }

    @FXML
    private void handleButtonAction_Sekretär(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Sekretaer_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Sekretär\n");
    }

    @FXML
    private void handleButtonAction_Manager(ActionEvent event) throws IOException {
        Counter.firsttime = 1;
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Manager_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Manager\n");
    }

    @FXML
    private void handleButtonAction_Arbeiter(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Arbeiter_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Manager\n");
    }
    
    @FXML
    private void handleButtonAction_Arbeiter_2(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Arbeiter_2_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Manager\n");
    }

    @FXML
    private void handleButtonAction_Arbeiter_3(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Arbeiter_3_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Manager\n");
    }

    @FXML
    private void handleButtonAction_Putza(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("PutzA_Eingabe.fxml"));
        ap_home.getChildren().setAll(pane);
        System.out.println("Switched to Manager\n");
    }

    @FXML
    private void handleButtonAction_test(ActionEvent event) {
        btn_Sekretär.setDisable(false);
        btn_Manager.setDisable(false);
        btn_Arbeiter.setDisable(false);
        btn_Arbeiter2.setDisable(false);
        btn_Arbeiter3.setDisable(false);
        btn_Putza.setDisable(false);
        btn_CEO.setDisable(false);
        Mitarbeiter_Liste.getAllMitarbeiterKonsole();
        
    }

    public void enableButton() {

        btn_Sekretär.setDisable(false);
        btn_Manager.setDisable(false);
    }
}
