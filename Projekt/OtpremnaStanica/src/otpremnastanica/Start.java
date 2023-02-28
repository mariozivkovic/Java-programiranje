package otpremnastanica;

import java.util.Scanner;

import otpremnastanica.obrada.Busotine;
import otpremnastanica.obrada.NaftnaPolja;
import otpremnastanica.obrada.Zaposlenici;

public class Start {
	
	private NaftnaPolja naftnaPolja;
	private Busotine busotine;
	private Zaposlenici zaposlenici;
	
	public Start() {
		
		Pomocno.ulaz = new Scanner(System.in);
		naftnaPolja = new NaftnaPolja(this);
		busotine = new Busotine(this);
		zaposlenici = new Zaposlenici(this);
		pozdravnaPoruka();
		glavniIzbornik();
		
		
	}
	
	public void glavniIzbornik() {
		System.out.println("");
		System.out.println("GLAVNI IZBORNIK");
		System.out.println("Dostupne opcije: ");
		System.out.println("1. Naftna polja");
		System.out.println("2. Bušotine");
		System.out.println("3. Zaposlenici");
		System.out.println("4. Poslovi");
		System.out.println("5. Održavanja");
		System.out.println("6. Održavanja, Poslovi, Bušotine");
		System.out.println("7. Izlaz iz programa");
		odabirGlavnogIzbornika();
		
	}

	private void odabirGlavnogIzbornika() {
		switch(Pomocno.unesiBrojRaspona("Odabrana opcija ", 1, 7)) {
		case 1:
			naftnaPolja.izbornik();
			break;
		case 2:
			busotine.izbornik();
			break;
		case 3:
			zaposlenici.izbornik();
			break;
			
		case 7:
			System.out.println("Doviđenja");
			
		}
		
	}

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u aplikaciju Otpremna stanica");
		
		
	}

	public static void main(String[] args) {
		
		new Start();
	}

}
