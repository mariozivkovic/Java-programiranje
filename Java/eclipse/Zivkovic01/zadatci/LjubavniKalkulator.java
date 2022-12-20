package zadatci;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {

	public static void main(String[] args) {

		int i = 2022;

		System.out.println(i);

		String ime1 = JOptionPane.showInputDialog("Unesi svoje ime");
		String ime2 = JOptionPane.showInputDialog("Unesi ime simpatije");

		int ljubav = (int) (Math.random() * 100);

		System.out.println(ime1 + " i " + ime2 + " se vole " + ljubav + "%");
	}

}
