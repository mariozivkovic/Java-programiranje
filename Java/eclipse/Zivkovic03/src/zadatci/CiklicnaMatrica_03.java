package zadatci;

import javax.swing.JOptionPane;

public class CiklicanaMatrica_03 {
	
	// Kreirati program koji ispisuje cikličnu matricu od donjeg desnog kuta prema gore
		

	public static void main(String[] args) {
		
		int brojRedova = Integer.parseInt(
				
				JOptionPane.showInputDialog("Unesite broj redova")
				
				);
	
		int brojStupaca = Integer.parseInt(
				
				JOptionPane.showInputDialog("Unesite broj stupaca")
				
				);

		int matrica[][] = new int[brojRedova][brojStupaca];

		int maxRedova = brojRedova - 1;
		int minRedova = 0;
		int maxStupaca = brojStupaca - 1;
		int minStupaca = 0;
		int brojac = 1;

		for (; brojac <= brojRedova * brojStupaca;) {

			for (int j = maxStupaca; j >= minStupaca; j--) {
				matrica[j][maxRedova] = brojac++;
			}
			if (brojac > brojRedova * brojStupaca) {
				break;
			}

			maxRedova--;
			
			for (int j = maxRedova; j >= minRedova; j--) {
				matrica[minStupaca][j] = brojac++;

			}
			if (brojac > brojRedova * brojStupaca) {
				break;

			}

			minStupaca++;

			for (int j = minStupaca; j <= maxStupaca; j++) {
				matrica[j][minRedova] = brojac++;

			}

			if (brojac > brojRedova * brojStupaca) {
				break;
			}

			minRedova++;

			for (int j = minRedova; j <= maxRedova; j++) {
				matrica[maxStupaca][j] = brojac++;

			}
			if (brojac > brojRedova * brojStupaca) {
				break;
			}
			maxStupaca--;
		}

		for (int i = 0; i <brojRedova; i++) {
			for (int j = 0; j < brojStupaca; j++) {
				System.out.printf("%5d", matrica[i][j]);
			}
			System.out.println();
		}
	}
}
