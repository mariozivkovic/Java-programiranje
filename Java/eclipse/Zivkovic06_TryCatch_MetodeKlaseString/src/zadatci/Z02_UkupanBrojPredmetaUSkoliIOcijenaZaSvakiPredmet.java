package zadatci;

public class Z02_UkupanBrojPredmetaUSkoliIOcijenaZaSvakiPredmet {

	// Program od korisnika trazi ukupan
	// broj predmeta u školi
	// Program unosi ocijene za svaki predmet
	// i ispisuje prosjek ocjena

	public static void main(String[] args) {

		int suma = 0;
		int ukupnoPredmeta = Pomocno.ucitajCijeliPozitivniBroj("Unesite ukupan broj predmeta za koji želite prosjek");

		for (int i = 0; i < ukupnoPredmeta; i++) {
			//suma += Pomocno.ucitajOcijenu("Unesi ocijenu");
			suma+=Pomocno.ucitajCijeliBrojURasponu("Unesite " + (i+1) + " . ocijenu", 1, 5);
		}

		System.out.println(suma / (float) ukupnoPredmeta);

	}

}
