package zadatci;

import javax.swing.JOptionPane;

public class Z07 {

	// Program unosi 2 broja
	// Ako su oba broja parni
	// ispisuje njihov zbroj
	// inače ispisuje njihovu razliku

	public static void main(String[] args) {

		int pb = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int db = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

	
			if (pb % 2 == 0 && db % 2 == 0) {
				System.out.println(pb + db);
			} else {
				System.out.println(pb - db);

			}

		}

	}



