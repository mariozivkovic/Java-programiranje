package zadatci;

import javax.swing.JOptionPane;

public class Z02 {

	// Korisnik unosi cijeli broj
		// Program ispisuje da li je 
		// paran ili nije
	public static void main(String[] args) {
		
		int i = Integer.parseInt(
				
				JOptionPane.showInputDialog("Unesi broj")
				
				);
		
		
		if (i%2==0) {
			System.out.println("Paran");
		} else {
			System.out.println("Neparan");
		}
	}
}
