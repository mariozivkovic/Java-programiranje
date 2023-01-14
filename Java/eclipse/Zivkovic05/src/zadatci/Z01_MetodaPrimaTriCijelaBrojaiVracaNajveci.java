package zadatci;

public class Z01_MetodaPrimaTriCijelaBrojaiVracaNajveci {
	
	// Napišite metodu koja prima tri cijela broja i vraća najveći
	
	public static int najveci(int a, int b, int c) {
		
		if(a<b && a<c) {
			return a;
		}
		if(b>a && b>c) {
			return b;
		}
		
		return c;
	}
	
	
	// ispis System.out.println(Z01_MetodaPrimaTriCijelaBrojaiVracaNajveci.najveci(0, 0, 0));
	
	
		
		

}
		

	
	


