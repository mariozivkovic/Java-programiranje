package zadatci;

import javax.swing.JOptionPane;

public class ZZ05 {
	
	//Kreirati program koji ispisuje cikličnu matricu
	
	public static void main(String[] args) {
		
		int brojRedova = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi broj redova")

		);

		int brojStupaca = Integer.parseInt(

				JOptionPane.showInputDialog("Unesi broj stupaca")

		);

		int matrica[][] = new int[brojRedova][brojStupaca];

		int brojac =1;
		int maxRedova = brojRedova - 1;
		int maxStupaca = brojStupaca - 1;
		int minRedova = 0;
		int minStupaca = 0;

		for (; brojac <= brojRedova * brojStupaca;) {
			for (int i = maxStupaca; i >= minStupaca; i--) {
				if (brojac > brojRedova * brojStupaca) {
					break;
				} else {
					matrica[maxRedova][i] = brojac++;
				}
			}
			maxRedova--;

			for (int i = maxRedova; i >= minRedova; i--) {
				if (brojac > brojRedova * brojStupaca) {
					break;
				} else {
					matrica[i][minStupaca] = brojac++;
				}
			}
			minStupaca++;

			for (int i = minStupaca; i <= maxStupaca; i++) {
				if (brojac > brojRedova * brojStupaca) {
					break;
				} else {
					matrica[minRedova][i] = brojac++;
				}
			}
			minRedova++;

			for (int i = minRedova; i <= maxRedova; i++) {
				if (brojac > brojRedova * brojStupaca) {
					break;
				} else {
					matrica[i][maxStupaca] = brojac++;
				}
			}
			maxStupaca--;
		}
		for (int i = 0; i < brojRedova; i++) {
			for (int j = 0; j < brojStupaca; j++) {
				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();
		}
	}

}
