package zadatci;

public class Z01_UnijetiodKorisnika_5_BrojevaIIspisatiNjihovZbroj {
	
	//Treba unijeti od korisnika 5 brojeva i ispisati njihov zbroj
	
	public static void main(String[] args) {
		
		int suma = 0;
		for(int i=0;i<5;i++) {
//			suma+= Pomocno.ucitajCijeliBroj("Unesi " + (i+1) + ". broj", "Nisi dobro unio cijeli broj");
			suma+=Pomocno.ucitajCijeliBroj();
		}
		System.out.println(suma);
	}
}
