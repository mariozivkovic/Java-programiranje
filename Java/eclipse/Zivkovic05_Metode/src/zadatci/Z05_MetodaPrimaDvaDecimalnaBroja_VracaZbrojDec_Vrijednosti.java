package zadatci;

public class Z05_MetodaPrimaDvaDecimalnaBroja_VracaZbrojDec_Vrijednosti {
				
	// Metoda prima dva decimalna broja
	// metoda vraća zbroj samo 
	// decimalnih vrijednosti
	
	

	public static double decimalni(double broj1, double broj2){
		
		return (int)((broj1 - (int) broj1 + broj2 - (int) broj2) * 100) / 100.0;
}

	
	// ispis System.out.println( Z05_MetodaPrimaDvaDecimalnaBroja_VracaZbrojDec_Vrijednosti.decimalni(0, 0));
}