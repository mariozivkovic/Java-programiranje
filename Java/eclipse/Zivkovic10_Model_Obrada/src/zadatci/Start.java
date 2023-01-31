package zadatci;

import java.util.Scanner;

import zadatci.obrada.Polaznici;
import zadatci.obrada.Smjerovi;

public class Start {
	
	private Smjerovi smjerovi;
	private Polaznici polaznici;

	public Start() {
		
		Pomocno.ulaz = new Scanner(System.in);
		smjerovi = new Smjerovi(this);
		polaznici = new Polaznici(this);
		pozdravnaPoruka();
		glavniIzbornik();
		
	}
	
	public void glavniIzbornik() {
		System.out.println("");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("Dostupne opcije");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavači");
		System.out.println("5. Izlaz iz programa");
		odabirGlavnogIzbornika();
		
	}

	private void odabirGlavnogIzbornika() {
		switch(Pomocno.unesiBrojRaspona("Odabrana opcija: ",1,5)) {
		case 1:
			smjerovi.izbornik();
			break;
		case 3:
			polaznici.izbornik();
			break;
		case 5:
			System.out.println("Doviđenja!");
		}
		
	}

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u Edunova terminal aplikaciju");
		
	}

	public static void main(String[] args) {
		
		new Start();
	}
}
