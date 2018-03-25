/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.composite.organigramm_fx;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public abstract class Mitarbeiter {
    private final String name;
    private final String funktion;
    private final ArrayList<Mitarbeiter> knechte;

    public Mitarbeiter(String name, String funktion) {
        this.name = name;
        this.funktion = funktion;
        this.knechte = new ArrayList<Mitarbeiter>();
    }
    
    public String getFunktion(){
        return funktion;
    }
    public String getName(){
        return name;
    }
    public void knechteMitarbeiter(Mitarbeiter knecht){
        knechte.add(knecht);
    }
    
    
    public ArrayList<Mitarbeiter> getKnechte(){
        return knechte;
    }
}
