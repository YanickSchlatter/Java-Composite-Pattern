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
public class Knecht {
    Mitarbeiter CEO = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(1),Mitarbeiter_Liste.getMitarbeiterFunktion(0)) {};
    
    Mitarbeiter Manager1 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(2),Mitarbeiter_Liste.getMitarbeiterFunktion(2)) {};
    Mitarbeiter Manager2 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(3),Mitarbeiter_Liste.getMitarbeiterFunktion(3)) {};
    Mitarbeiter Manager3 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(4),Mitarbeiter_Liste.getMitarbeiterFunktion(4)) {};
    
     Mitarbeiter Arbeiter1 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(5),Mitarbeiter_Liste.getMitarbeiterFunktion(5)) {};
      Mitarbeiter Arbeiter2 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(6),Mitarbeiter_Liste.getMitarbeiterFunktion(6)) {};
       Mitarbeiter Arbeiter3 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(7),Mitarbeiter_Liste.getMitarbeiterFunktion(7)) {};
        Mitarbeiter Arbeiter4 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(8),Mitarbeiter_Liste.getMitarbeiterFunktion(8)) {};
         Mitarbeiter Arbeiter5 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(9),Mitarbeiter_Liste.getMitarbeiterFunktion(9)) {};
     
      Mitarbeiter Arbeiter6 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(10),Mitarbeiter_Liste.getMitarbeiterFunktion(10)) {};
       Mitarbeiter Arbeiter7 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(11),Mitarbeiter_Liste.getMitarbeiterFunktion(11)) {};
        Mitarbeiter Arbeiter8 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(12),Mitarbeiter_Liste.getMitarbeiterFunktion(12)) {};
         Mitarbeiter Arbeiter9 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(13),Mitarbeiter_Liste.getMitarbeiterFunktion(13)) {};
          Mitarbeiter Arbeiter10 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(14),Mitarbeiter_Liste.getMitarbeiterFunktion(14)) {};
          
       Mitarbeiter Arbeiter11 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(15),Mitarbeiter_Liste.getMitarbeiterFunktion(15)) {};
        Mitarbeiter Arbeiter12 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(16),Mitarbeiter_Liste.getMitarbeiterFunktion(16)) {};
         Mitarbeiter Arbeiter13 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(17),Mitarbeiter_Liste.getMitarbeiterFunktion(17)) {};
          Mitarbeiter Arbeiter14 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(18),Mitarbeiter_Liste.getMitarbeiterFunktion(18)) {};
           Mitarbeiter Arbeiter15 = new Mitarbeiter(Mitarbeiter_Liste.getMitarbeiterName(19),Mitarbeiter_Liste.getMitarbeiterFunktion(19)) {};
           
    
    public void knechte(){
        
//        for(int i =1; i>3;i++){
//            CEO.knechteMitarbeiter(Manager+i);
//        }
            CEO.knechteMitarbeiter(Manager1);
            CEO.knechteMitarbeiter(Manager2);
            CEO.knechteMitarbeiter(Manager3);
            
            Manager1.knechteMitarbeiter(Arbeiter1);
            Manager1.knechteMitarbeiter(Arbeiter2);
            Manager1.knechteMitarbeiter(Arbeiter3);
            Manager1.knechteMitarbeiter(Arbeiter4);
            Manager1.knechteMitarbeiter(Arbeiter5);
            
            Manager2.knechteMitarbeiter(Arbeiter6);
            Manager2.knechteMitarbeiter(Arbeiter7);
            Manager2.knechteMitarbeiter(Arbeiter8);
            Manager2.knechteMitarbeiter(Arbeiter9);
            Manager2.knechteMitarbeiter(Arbeiter10);
            
            Manager3.knechteMitarbeiter(Arbeiter11);
            Manager3.knechteMitarbeiter(Arbeiter12);
            Manager3.knechteMitarbeiter(Arbeiter13);
            Manager3.knechteMitarbeiter(Arbeiter14);
            Manager3.knechteMitarbeiter(Arbeiter15);
    }
    
    public String getKnechteCeo(){
        String Ausgabe = "";
        ArrayList<Mitarbeiter> knecht=CEO.getKnechte();
        for(int i=0;i>knecht.size();i++){
            Ausgabe+=knecht.get(i)+"\n";
        }
        System.out.println(Ausgabe);
        return Ausgabe;
    }
    
    public String getKnechteMa1(){
        String Ausgabe = "";
        ArrayList<Mitarbeiter> knecht=Manager1.getKnechte();
        for(int i=0;i>knecht.size();i++){
            Ausgabe+=knecht.get(i)+"\n";
        }
        return Ausgabe;
    }
    
    public String getKnechteMa2(){
        String Ausgabe = "";
        ArrayList<Mitarbeiter> knecht=Manager2.getKnechte();
        for(int i=0;i>knecht.size();i++){
            Ausgabe+=knecht.get(i)+"\n";
        }
        return Ausgabe;
    }
    
    public String getKnechteMa3(){
        String Ausgabe = "";
        ArrayList<Mitarbeiter> knecht=Manager3.getKnechte();
        for(int i=0;i>knecht.size();i++){
            Ausgabe+=knecht.get(i)+"\n";
        }
        return Ausgabe;
    }
}
