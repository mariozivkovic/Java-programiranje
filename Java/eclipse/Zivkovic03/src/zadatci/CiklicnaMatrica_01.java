package zadatci;

import javax.swing.JOptionPane;

public class CiklicnaMatrica_01 {

	// Kreirati program koji ispisuje cikličnu matricu od gornjeg lijevog kuta pa
	// nadalje

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

			for (int j = minStupaca; j <= maxStupaca; j++) {
				matrica[minRedova][j] = brojac++;
			}

			if (brojac > brojRedova * brojStupaca) {
				break;
			}

			minRedova++;

			for (int j = minRedova; j <= maxRedova; j++) {
				matrica[j][maxStupaca] = brojac++;

			}
			if (brojac > brojRedova * brojStupaca) {
				break;

			}

			maxStupaca--;

			for (int j = maxStupaca; j >= minStupaca; j--) {
				matrica[maxRedova][j] = brojac++;

			}

			if (brojac > brojRedova * brojStupaca) {
				break;
			}

			maxRedova--;

			for (int j = maxRedova; j >= minRedova; j--) {
				matrica[j][minStupaca] = brojac++;

			}
			if (brojac > brojRedova * brojStupaca) {
				break;
			}
			minStupaca++;
		}

		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojStupaca; j++) {
				System.out.printf("%5d", matrica[i][j]);
			}
			System.out.println();
		}

	}

}
