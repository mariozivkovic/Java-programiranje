package zadatci;

import javax.swing.JOptionPane;

public class ZZ03 {

	// Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između
	// njih.

	public static void main(String[] args) {

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		int max = prviBroj > drugiBroj ? prviBroj : drugiBroj;
		int min = prviBroj < drugiBroj ? prviBroj : drugiBroj;

		for (int i = min; i < max; i++) {
			int broj = 0;
			for (int a = 2; a < i; a++) {
				if (i % a == 0) {
					broj++;

				}

			}
			if (broj == 0) {
				System.out.println(i);
			}

		}

	}
}
