package zadatci;

import javax.swing.JOptionPane;

public class Z01 {

	// Korisnik unosi dva cijela broja
	// Program ispisuje
	// zbroj svih parnih brojeva
	// između dva unesena broja

	public static void main(String[] args) {

		int a = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi prvi broj")

		);
		int b = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi drugi broj")

		);

		int min = a < b ? a : b;
		int max = a > b ? a : b;

		int zbroj = 0;
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				zbroj += i;

			}

		}
		System.out.println(zbroj);
	}
}
