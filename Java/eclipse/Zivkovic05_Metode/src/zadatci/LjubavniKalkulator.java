package zadatci;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {
	public static void main(String[] args) {
	
		String ime1=JOptionPane.showInputDialog("Unesi svoje ime");
		String ime2=JOptionPane.showInputDialog("Unesi ime svoje simpatije");
		
		String postotak = "";
		
		for ( int i:  LjubavniKalkulatorMetoda.parniNeparniBroj(LjubavniKalkulatorMetoda.iteracija(ime1, ime2))) {
			postotak+= i;
		}

		System.out.println("Konačan rezultat je: " + postotak + "%" + " ljubavi");
		
		

	}
}
		


	
