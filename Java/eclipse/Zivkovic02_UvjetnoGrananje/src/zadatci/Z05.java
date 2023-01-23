package zadatci;

import javax.swing.JOptionPane;

public class Z05 {
	
	// Za upisana 3 cijela broja
		// program ispisuje najveći
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 3"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 5"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 7"));
		
		
			if (a > b && a > c) {
				System.out.println(a);
			} else if (b > a && b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		
	}


