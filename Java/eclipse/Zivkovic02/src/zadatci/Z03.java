package zadatci;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10
		// inače ispisuje Edunova
	
	public static void main(String[] args) {
		
		int pb = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi prvi broj")

		);
		
		int db = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi drugi broj")

		);
		
		int rz = pb + db;

		if (rz<10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Edunova");
		
		
	}

}
}
