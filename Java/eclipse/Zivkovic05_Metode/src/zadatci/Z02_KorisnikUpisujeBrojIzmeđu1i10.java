package zadatci;

import javax.swing.JOptionPane;

public class Z02_KorisnikUpisujeBrojIzmeđu1i10 {
	
	// Metoda od korisnika trazi upis broja između 1 i 10 te vraća ispravno unesen broj 

public static int broj() {
		
		int  broj=0;
		while(true) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
			
			if(broj>=1 && broj<=10) {
				return broj;
			}
		
		}
			
		
		
	}
	
	//ispis   System.out.println(Z02_KorisnikUnosiBrojIzmedju_1i10.broj());
	
}
