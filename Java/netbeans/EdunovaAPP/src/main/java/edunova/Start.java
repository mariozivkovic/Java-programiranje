/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import edunova.util.PocetniInsert;




public class Start {

   
    public static void main(String[] args) {
        ObradaSmjer os = new ObradaSmjer();
        Smjer smjer = new Smjer();
        smjer.setNaziv("Prvi preko kontolera");
        os.setEntitet(smjer);
        try {
            os.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        
        for(Smjer s : os.read()){
            System.out.println(s.getNaziv());
        }
    }
}
