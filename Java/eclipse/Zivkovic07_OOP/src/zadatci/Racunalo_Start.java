package zadatci;

public class Racunalo_Start {

	// U Start klasi napraviti dvije instance klase Racunalo

	public static void main(String[] args) {

		Racunalo[] racunala = new Racunalo[2];
		racunala[0] = kreirajRacunalo("Lenovo", false, 3500.50f, 15.5, 8);
		racunala[1] = kreirajRacunalo("HP", true, 5000.00f, 17.0, 16);

		for (Racunalo r : racunala) {

			System.out.println(r.getNaziv());
		}

	}
	// Metoda

	private static Racunalo kreirajRacunalo(String naziv, boolean Os, float cijena, double dijagonala, int memorija) {
		Racunalo r = new Racunalo();
		r.setNaziv(naziv);
		r.setOs(Os);
		r.setCijena(cijena);
		r.setDijagonala(dijagonala);
		r.setMemorija(memorija);

		return r;
	}

}
