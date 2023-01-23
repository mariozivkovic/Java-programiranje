package zadatci;

import java.util.Date;

public class Racun_Kupac_Start {

	public static void main(String[] args) {
		
		Racun[] racuni = new Racun[3];
		racuni[0] = dodajRacun(new Date(), 250.00f, dodajKupca("Pero Peric", "Ulica V. Nazora 5"));
		racuni[1] = dodajRacun(new Date(), 500.00f, dodajKupca("Mato Matić", "Ulica A. Šenoe 2"));
		racuni[2] = dodajRacun(new Date(), 123.45f, dodajKupca("Stipo Stipić", "Ulica D. Tadijanovića 23"));
		
		for(Racun r : racuni) {
			System.out.println(r.getKupac().getNaziv() + " " +  r.getIznos());
			
		}

	}
	
	// Metode

	private static Kupac dodajKupca(String naziv, String adresa) {
		Kupac k = new Kupac();
		k.setNaziv(naziv);
		k.setAdresa(adresa);
		return k;
	}

	private static Racun dodajRacun(Date datum, float iznos, Kupac kupac) {
		Racun r = new Racun();
		r.setDatum(datum);
		r.setIznos(iznos);
		r.setKupac(kupac);
		return r;
	}

}
