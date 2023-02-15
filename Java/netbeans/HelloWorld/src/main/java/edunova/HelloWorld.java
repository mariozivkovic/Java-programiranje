/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import java.awt.Color;

/**
 *
 * @author lovre
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Osoba osoba = new Osoba();
        osoba.setIme("Pero");
        osoba.setPrezime("Perić");
        
        System.out.println(osoba.getIme());
        
        new Prozor().setVisible(true);
        
    }
}
