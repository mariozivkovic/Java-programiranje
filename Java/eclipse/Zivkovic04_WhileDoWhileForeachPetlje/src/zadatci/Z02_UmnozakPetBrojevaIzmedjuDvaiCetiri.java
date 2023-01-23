package zadatci;

import javax.swing.JOptionPane;

public class Z02_UmnozakPetBrojevaIzmedjuDvaiCetiri {

	// Korisnik unosi 5 brojeva
		// između 2 i 4
		// Program ispisuje njihov umnožak
	
	public static void main(String[] args) {
		
		long umnozak = 1;
		int broj,brojac=0;
		
		while(brojac<5) {
			broj= Integer.parseInt(JOptionPane.showInputDialog("Unesi 5 brojeva između 2 i 4"));
			
			if(broj>=2 && broj<=4) {
				umnozak*=broj;
				brojac++;
			}
			
		}
		System.out.println(umnozak);
	}
}
