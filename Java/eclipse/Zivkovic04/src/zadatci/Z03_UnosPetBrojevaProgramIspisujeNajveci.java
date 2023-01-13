package zadatci;

import javax.swing.JOptionPane;

public class Z03_UnosPetBrojevaProgramIspisujeNajveci {
	
	// Korisnik unosi 5 brojeva
		// program ispisuje najveći
	
	public static void main(String[] args) {
		
		int brojac = 0, broj,najveci= Integer.MIN_VALUE;
		
		while(brojac<5) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi pet brojeva"));
			
			if(broj>najveci) {
				najveci=broj;
			}
			brojac++;
		}
		System.out.println(najveci);
	}

}
