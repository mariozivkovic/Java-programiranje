package zadatci;

import javax.swing.JOptionPane;

public class V01 {

	public static void main(String[] args) {
		int i = 0;
		String broj = "";
		while (true) {
			try {
				broj = JOptionPane.showInputDialog("Daj broj");
				i = Integer.parseInt(broj);
				break;
			} catch (Exception e) {
				// if(broj.length()>=9) {
				// JOptionPane.showMessageDialog(null, "Unijeli ste preveliki/premali broj");
				// continue;
			}
			JOptionPane.showMessageDialog(null, "Obavezan unos cijelog broja od" + " 2^31 do 2^31 - 1");
		}
		System.out.println(i);

	}

}
