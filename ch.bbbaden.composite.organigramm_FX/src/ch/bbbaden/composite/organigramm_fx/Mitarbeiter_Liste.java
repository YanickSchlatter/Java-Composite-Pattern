/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.composite.organigramm_fx;

import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author Admin
 */
public abstract class Mitarbeiter_Liste {

    static ArrayList<String> mitarbeiterName = new ArrayList<String>();
    static ArrayList<String> mitarbeiterFunktion = new ArrayList<String>();
//    private String[] liste;

    public static void test() {
        mitarbeiterName.add("Hans Test");
        mitarbeiterFunktion.add("CEO");
        for (int i = 0; i < mitarbeiterName.size(); i++) {
            System.out.println(mitarbeiterName.get(i) + " ");
            System.out.print(mitarbeiterFunktion.get(i));
        }
    }

    public static void addMitarbeiter(String name, String funktion) {
        mitarbeiterName.add(name);
        mitarbeiterFunktion.add(funktion);
        for (int i = 0; i < mitarbeiterName.size(); i++) {
            System.out.print(mitarbeiterName.get(i) + " ");
            System.out.println(mitarbeiterFunktion.get(i) + "\n");
        }
        System.out.println("Mitarbeiter erstellt\n");
    }

    public static String getMitarbeiter(int index) {

        String Ausgabe = mitarbeiterName.get(index) + " " + mitarbeiterFunktion.get(index);
        return Ausgabe;
    }

    public static String getMitarbeiterName(int index) {
        String Ausgabe = mitarbeiterName.get(index);
        return Ausgabe;
    }

    public static String getMitarbeiterFunktion(int index) {
        String Ausgabe = mitarbeiterFunktion.get(index);
        return Ausgabe;
    }

    public static ArrayList<String> getMitarbeiterNamen() {
        return mitarbeiterName;
    }

    public ArrayList<String> getMitarbeiterFunktion() {
        return mitarbeiterFunktion;
    }

    public void getAllMitarbeiter() {
        for (int i = 0; i < mitarbeiterName.size(); i++) {
            mitarbeiterName.get(i);
            mitarbeiterFunktion.get(i);
        }
    }
    
    public static ArrayList<String> getAllMitarbeiterAL(){
        
        ArrayList<String> mitarbeiter= new ArrayList<>();
        for (int i = 0; i < mitarbeiterName.size(); i++) {
            mitarbeiter.add(mitarbeiterName.get(i) + " " + mitarbeiterFunktion.get(i));
        }
        
        return mitarbeiter;
    }
    
    public static void getAllMitarbeiterKonsole(){
        for (int i = 0; i < mitarbeiterName.size(); i++) {
            System.out.print(mitarbeiterName.indexOf(mitarbeiterName.get(i))+" ");
            System.out.print(mitarbeiterName.get(i) + " ");
            System.out.println(mitarbeiterFunktion.get(i) + "\n");
        }
    }
}
