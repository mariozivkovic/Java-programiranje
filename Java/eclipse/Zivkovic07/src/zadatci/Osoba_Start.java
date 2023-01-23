package zadatci;

public class Osoba_Start {

	public static void main(String[] args) {
		
		Osoba osoba = new Osoba();
		osoba.setIme(Pomocno.obavezanUnosStringa("Unesi ime"));
		osoba.setPrezime("Perić");
		osoba.setGodine(24);
		
		System.out.println(osoba.getPrezime());
		
		Osoba[] osobe = new Osoba[5];
		osobe[0]=osoba;
		
		osoba = new Osoba();
		osoba.setIme("Marina");
		osobe[1]=osoba;
		osobe[2]= kreirajOsobu("Ana", "Gal", 19);
		osobe[3]= kreirajOsobu("Tin", "Ked", 19);
		osobe[4]= kreirajOsobu("Lu", "Ked", 19);
		
		for(Osoba o : osobe) {
			System.out.println(o.getIme());
		}
		
	}
	private static Osoba kreirajOsobu(String ime, String prezime, int godine) {
		Osoba osoba = new Osoba();
		osoba.setIme(ime);
		osoba.setPrezime(prezime);
		osoba.setGodine(godine);
		
		return osoba;
	}
}
