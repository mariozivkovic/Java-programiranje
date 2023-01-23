package zadatci;

public class Z01_ZbrojPrvihStoBrojeva {
	
	// while petljom ispisati 
		// zbroj prvih 100 brojeva
	
	public static void main(String[] args) {
		
		int broj =0;
		int zbroj=0;
		while(broj<=100) {
			zbroj+=broj;
			broj++;
		}
		System.out.println(zbroj);
	}

}
