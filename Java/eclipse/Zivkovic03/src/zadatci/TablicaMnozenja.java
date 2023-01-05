package zadatci;

import javax.swing.JOptionPane;

public class TablicaMnozenja {

	public static void main(String[] args) {

		String ime = JOptionPane.showInputDialog("Unesite ime");
		
		for (int a = 0; a < 31; a++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println(": : :  TABLICA  MNOŽENJA  : : :");

		for (int a = 0; a < 31; a++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.print("*" + " |  " + "1  2  3  4  5  6  7  8  9 " );
		
	
		System.out.println();
		for (int a = 0; a < 31; a++) {
			System.out.print("-");
		}
		System.out.println();
		

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j < 10)) {
					if (j == 1) {
						System.out.print( i + " |  " + i * j + "  ");
					} else {
						System.out.print(i * j + "  ");
					}
				} else if ((i * j < 100)) {
					System.out.print(i * j + " ");
				} else if ((i * j < 10) && (i * j < 100)) {
					System.out.print(i * j + "");
				} else {
					System.out.print(i * j + " ");
				}
			}
			if (i == 9) {
				System.out.println();
				for (int k = 0; k < 31; k++) {
					System.out.print("-");
				}
				System.out.println();
				System.out.println(": : : : : : : : : : : by  " +  ime);
				for (int k = 0; k < 31; k++) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}

