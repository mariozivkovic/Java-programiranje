package zadatci;

import javax.swing.JOptionPane;

public class EURkonvertor {
	
	public static void main(String[] args) {
		
		String vrsta = JOptionPane.showInputDialog("1.EUR->KN, 2.KN->EUR");
		
		double tecaj = 7.5345;
		
		double iznos = Double.parseDouble(JOptionPane.showInputDialog("Iznos u" + vrsta=="1" ? "EUR" : "KN"));
		System.out.println(iznos * tecaj + "KN");
		
		if(vrsta=="1") {
			System.out.println(iznos * tecaj + " KN");
		}else {
			System.out.println(iznos / tecaj + " EUR");
		}
	
	}

}
