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
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class AusgabeController implements Initializable {

    @FXML
    private AnchorPane ap_ausgabe;
    @FXML
    private Label lbl_CEO;
    @FXML
    private Label lbl_Manager_1;
    @FXML
    private Label lbl_Manager_2;
    @FXML
    private Label lbl_Manager_3;
    @FXML
    private Label lbl_Sekretär;
    @FXML
    private Line ln_ceo_v;
    @FXML
    private Line ln_ma_1_h;
    @FXML
    private Line ln_ma_1_v;
    @FXML
    private Line ln_ma_2_v;
    @FXML
    private Line ln_ma_3_h;
    @FXML
    private Line ln_ma_3_v;
    @FXML
    private Line ln_sek;
    @FXML
    private Label lb_ma1_1;
    @FXML
    private Label lb_ma1_2;
    @FXML
    private Label lb_ma1_3;
    @FXML
    private Label lb_ma1_4;
    @FXML
    private Label lb_ma1_5;
    @FXML
    private Line ln_ma1_A;
    @FXML
    private Line ln_ma1_A_1;
    @FXML
    private Line ln_ma1_A_2;
    @FXML
    private Line ln_ma1_A_3;
    @FXML
    private Line ln_ma1_A_4;
    @FXML
    private Line ln_ma1_A_5;
    @FXML
    private Label lb_ma2_1;
    @FXML
    private Label lb_ma2_2;
    @FXML
    private Label lb_ma2_3;
    @FXML
    private Label lb_ma2_4;
    @FXML
    private Label lb_ma2_5;
    @FXML
    private Line ln_ma2_A;
    @FXML
    private Line ln_ma2_A_1;
    @FXML
    private Line ln_ma2_A_2;
    @FXML
    private Line ln_ma2_A_3;
    @FXML
    private Line ln_ma2_A_4;
    @FXML
    private Line ln_ma2_A_5;
    @FXML
    private Label lb_ma2_11;
    @FXML
    private Label lb_ma2_21;
    @FXML
    private Label lb_ma2_31;
    @FXML
    private Label lb_ma2_41;
    @FXML
    private Label lb_ma2_51;
    @FXML
    private Line ln_ma2_A1;
    @FXML
    private Line ln_ma2_A_12;
    @FXML
    private Line ln_ma2_A_21;
    @FXML
    private Line ln_ma2_A_31;
    @FXML
    private Line ln_ma2_A_41;
    @FXML
    private Line ln_ma2_A_51;
    @FXML
    private Label lb_pt_1;
    @FXML
    private Label lb_pt_2;
    @FXML
    private Label lb_pt_3;
    @FXML
    private Button btn_Ausgabe;
    @FXML
    private Button btn_back;
    @FXML
    private Button btn_Ausgabe1;
    @FXML
    private Button btn_Ausgabe2;
    @FXML
    private Button btn_Ausgabe3;
    @FXML
    private Button btn_Ausgabe4;

    @FXML
    private void handleButtonAction_switch(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        ap_ausgabe.getChildren().setAll(pane);
        System.out.println("Switched to Home");
    }

    @FXML
    private void handleButtonAction_Ausgabe(ActionEvent event) {
        Mitarbeiter_Liste.getAllMitarbeiterKonsole();

        lbl_CEO.setText(Mitarbeiter_Liste.getMitarbeiterName(0));

        lbl_Sekretär.setText(Mitarbeiter_Liste.getMitarbeiterName(1));

        lbl_Manager_1.setText(Mitarbeiter_Liste.getMitarbeiterName(2));

        lbl_Manager_2.setText(Mitarbeiter_Liste.getMitarbeiterName(3));

        lbl_Manager_3.setText(Mitarbeiter_Liste.getMitarbeiterName(4));

        
        lb_ma1_1.setText(Mitarbeiter_Liste.getMitarbeiterName(5));
        lb_ma1_2.setText(Mitarbeiter_Liste.getMitarbeiterName(6));
        lb_ma1_3.setText(Mitarbeiter_Liste.getMitarbeiterName(7));
        lb_ma1_4.setText(Mitarbeiter_Liste.getMitarbeiterName(8));
        lb_ma1_5.setText(Mitarbeiter_Liste.getMitarbeiterName(9));
        lb_ma2_1.setText(Mitarbeiter_Liste.getMitarbeiterName(10));
        lb_ma2_2.setText(Mitarbeiter_Liste.getMitarbeiterName(11));
        lb_ma2_3.setText(Mitarbeiter_Liste.getMitarbeiterName(12));
        lb_ma2_4.setText(Mitarbeiter_Liste.getMitarbeiterName(13));
        lb_ma2_5.setText(Mitarbeiter_Liste.getMitarbeiterName(14));
        lb_ma2_11.setText(Mitarbeiter_Liste.getMitarbeiterName(15));
        lb_ma2_21.setText(Mitarbeiter_Liste.getMitarbeiterName(16));
        lb_ma2_31.setText(Mitarbeiter_Liste.getMitarbeiterName(17));
        lb_ma2_41.setText(Mitarbeiter_Liste.getMitarbeiterName(18));
        lb_ma2_51.setText(Mitarbeiter_Liste.getMitarbeiterName(19));
        
        lb_pt_1.setText(Mitarbeiter_Liste.getMitarbeiterName(20));
        lb_pt_2.setText(Mitarbeiter_Liste.getMitarbeiterName(21));
        lb_pt_3.setText(Mitarbeiter_Liste.getMitarbeiterName(21));

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleButtonAction_CEO_Knechte(ActionEvent event) {
//        System.out.println(Knecht.getKnechteCeo);
    }

    @FXML
    private void handleButtonAction_M1_Knechte(ActionEvent event) {
    }

    @FXML
    private void handleButtonAction_M2_Knechte(ActionEvent event) {
    }

    @FXML
    private void handleButtonAction_M3_Knechte(ActionEvent event) {
    }

}
