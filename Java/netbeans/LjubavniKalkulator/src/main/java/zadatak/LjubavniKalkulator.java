/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zadatak;

/**
 *
 * @author lovre
 */
public class LjubavniKalkulator {

    public static void main(String[] args) {
       int i = 2022;

		System.out.println(i);

		String ime1 = ("Unesi svoje ime");
		String ime2 = ("Unesi ime simpatije");

		int ljubav = (int) (Math.random() * 100);

		System.out.println(ime1 + " i " + ime2 + " se vole " + ljubav + "%");
                
                new Prozor().setVisible(true);
    }
}
