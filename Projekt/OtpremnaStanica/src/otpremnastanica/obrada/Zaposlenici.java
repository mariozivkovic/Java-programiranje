package otpremnastanica.obrada;

import java.util.ArrayList;
import java.util.List;

import otpremnastanica.Pomocno;
import otpremnastanica.Start;
import otpremnastanica.model.Busotina;
import otpremnastanica.model.Zaposlenik;

public class Zaposlenici {
	
	private List<Zaposlenik> zaposlenici;
	private Start start;
	
	
	public Zaposlenici(Start start) {
		super();
		this.start = start;
		zaposlenici = new ArrayList<>();
	}
	public Zaposlenici(Start start, List<Zaposlenik> zaposlenici) {
		super();
		this.zaposlenici = zaposlenici;
		this.start = start;
	}
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Zaposlenici izbornik");
		System.out.println("Dostupne opcije: ");
		System.out.println("1. Pregled svih zaposlenika");
		System.out.println("2. Unos novog zaposlenika");
		System.out.println("3. Promjena postojećeg zaposlenika");
		System.out.println("4. Brisanje zaposlenika");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}
	private void odabirIzbornika() {
		switch(Pomocno.unesiBrojRaspona("Unesi opciju", 1, 5)) {
		case 1:
			pregled();
		}
		
	}
	private void pregled() {
		System.out.println("Zaposlenici u aplikaciji");
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z);
		}
		izbornik();
	}
	private void unosNovog() {
		zaposlenici.add(unesiNovogZaposlenika());
		izbornik();
	}
	private Zaposlenik unesiNovogZaposlenika() {
		Zaposlenik z = new Zaposlenik();
		z.setSifra(Pomocno.unesiBrojRaspona("Odaberi opciju: ", 1, Integer.MAX_VALUE));
		z.setIme(Pomocno.unosTeksta("Unesi ime zaposlenika"));
		return z;
	}
	public List<Zaposlenik> getZaposlenici() {
		return zaposlenici;
	}
	public void setZaposlenici(List<Zaposlenik> zaposlenici) {
		this.zaposlenici = zaposlenici;
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	
	

}
