package zadatci;

public class Z03 {
	
	// Za unesena dva cijela broja
		// ispišite rezutat djeljenja
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj 1"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj 2"));
		
		
		float rezultat = (float) a  /b;
		
		
		System.out.println(rezultat);
		
		
	}

}
