package zadatci;

import javax.swing.JOptionPane;

public class TablicaMnozenja {

	public static void main(String[] args) {

		String ime = JOptionPane.showInputDialog("Unesite ime");
		
		for (int a = 0; a < 32; a++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(": : :  TABLICA   MNOŽENJA  : : :");

		for (int a = 0; a < 32; a++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.print("  *" + " |  " + "1  2  3  4  5  6  7  8  9 " );
		
	
		System.out.println();
		for (int a = 0; a < 32; a++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (int b = 1; b < 10; b++) {
			System.out.printf("%3d |", b);
			for (int c = 1; c < 10; c++) {
				System.out.printf("%3d", (b * c));
		}
			System.out.println();
	}
		for (int b = 0; b < 32; b++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%32s\n", ": : : : : : : : : : : by Mario");
		

		for (int b = 0; b < 32; b++) {
			System.out.print("-");
		}
		
		
	}

}

