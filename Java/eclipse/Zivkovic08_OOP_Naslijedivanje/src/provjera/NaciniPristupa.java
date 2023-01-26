package provjera;

import zadatci.Osoba;
import zadatci.Polaznik;
import zadatci.Predavac;

public class NaciniPristupa {

	public static void main(String[] args) {
		
		Polaznik p = new Polaznik(" Pero", "Perić", "22");
		//p.setIme("Pero");
		System.out.println(p.pozdravi());
		naslijedivanje(p);
		
		Predavac pr = new Predavac();
		pr.setIme("Marija");
		naslijedivanje(pr);
	}
	
	private static void naslijedivanje(Osoba o) {
		System.out.println(o.pozdravi());
		
	}
}
