package zadatci.obrada;

import java.util.ArrayList;
import java.util.List;

import zadatci.Pomocno;
import zadatci.Start;
import zadatci.model.Smjer;

public class Smjerovi {

	private List<Smjer> smjerovi;
	private Start start;

	public Smjerovi(Start start) {
		super();
		this.start = start;
		smjerovi = new ArrayList<>();
	}

	public Smjerovi(Start start, List<Smjer> smjerovi) {
		super();
		this.smjerovi = smjerovi;
		this.start = start;

	}
	public void izbornik() {
		
		System.out.println("");
		System.out.println("Smjer izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih smjerova");
		System.out.println("2. Unos novog smjera");
		System.out.println("3. Promjena postojećeg smjera");
		System.out.println("4. Brisanje smjera");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}
	
	private void odabirIzbornika() {
		switch(Pomocno.unesiBrojRaspona("Odaberi opciju", 1, 5)) {
		case 1:
			pregled();
		}
	}

	private void pregled() {
		System.out.println("Smjerovi u aplikaciji");
		for(Smjer s : smjerovi) {
			System.out.println(s);
		}
		izbornik();
		
	}
	private void unosNovog() {
		smjerovi.add(unesiNoviSmjer());
		izbornik();
	}
	
	private Smjer unesiNoviSmjer() {
		Smjer s = new Smjer();
		s.setSifra(Pomocno.unesiBrojRaspona("Unesi šifru smjera", 1, Integer.MAX_VALUE));
		s.setNaziv(Pomocno.unosTeksta("Unesi naziv smjera"));
		return s;
	}

	public List<Smjer> getSmjerovi() {
		return smjerovi;
	}

	public void setSmjerovi(List<Smjer> smjerovi) {
		this.smjerovi = smjerovi;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

}
