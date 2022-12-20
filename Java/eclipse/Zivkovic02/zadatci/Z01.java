package zadatci;

import javax.swing.JOptionPane;

public class Z01 {

	// Korisnik unosi cijeli broj
	// Za broj manji od 10
	// ispisuje se Osijek
	// inače se ispisuje Donji Miholjac

	public static void main(String[] args) {

		int i = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi broj")

		);

		if (i<10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}

	}

}