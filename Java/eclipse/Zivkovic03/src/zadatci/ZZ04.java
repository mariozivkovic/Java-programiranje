package zadatci;

import javax.swing.JOptionPane;

public class ZZ04 {
	// Keirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj

	public static void main(String[] args) {

		int matrica1[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrica1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi brojeve u matricu 1"));
				System.out.print(matrica1[i][j] + "    ");

			}

		}
		
		System.out.println();
		

		int matrica2[][] = new int[4][4];
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrica2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi brojeve u matricu 2 "));
				System.out.print(matrica2[i][j] + "    ");
			}

		}

		System.out.println();
		
		
		int rezultat[][] = new int[4][4];
		
		

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				rezultat[i][j] = matrica1[i][j] + matrica2[i][j];
				System.out.print(rezultat[i][j] + "   ");
			}
		}
		
	
			
		
		
		


			}
			
		
	
}

