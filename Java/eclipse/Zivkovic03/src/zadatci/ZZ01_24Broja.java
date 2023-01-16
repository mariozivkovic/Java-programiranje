package zadatci;

import javax.swing.JOptionPane;

public class ZZ01 {

	// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj,
	// najmanji i najveći uneseni broj.

	public static void main(String[] args) {

		int niz[] = new int[24];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i + 1) + ". broj"));

		}
		int zbroj = 0;
		for (int i = 1; i < niz.length; i++) {
			zbroj += niz[i];

		}
		System.out.println("Zbroj:  " + zbroj);

		int najveci = niz[0];
		int najmanji = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < najmanji) {
				najmanji = niz[i];

			} else if (niz[i] > najveci) {
				najveci = niz[i];

			}

		}

		System.out.println("Najmanji: " + najmanji);
		System.out.println("Najveci: " + najveci);

	}
}
