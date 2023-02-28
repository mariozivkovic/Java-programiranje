package otpremnastanica.obrada;

import java.util.ArrayList;
import java.util.List;

import otpremnastanica.Pomocno;
import otpremnastanica.Start;
import otpremnastanica.model.Busotina;
import otpremnastanica.model.NaftnoPolje;

public class Busotine {
	
	private List<Busotina> busotine;
	private Start start;
	
	
	
	public Busotine(Start start) {
		super();
		this.start = start;
		busotine = new ArrayList<>();
	}
	public Busotine(Start start, List<Busotina> busotine) {
		super();
		this.busotine = busotine;
		this.start = start;
	}
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Bušotine izbornik");
		System.out.println("Dostupne opcije: ");
		System.out.println("1. Pregled svih bušotina");
		System.out.println("2. Unos nove bušotine");
		System.out.println("3. Promjena postojeće bušotine");
		System.out.println("4. Brisanje bušotine");
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
		System.out.println("Bušotine u aplikaciji");
		for(Busotina b : busotine) {
			System.out.println(b);
		}
		izbornik();
		}
	private void unosNovog(){
		busotine.add(unesiNovuBusotinu());
		izbornik();
	}
	private Busotina unesiNovuBusotinu() {
		Busotina b = new Busotina();
		b.setSifra(Pomocno.unesiBrojRaspona("Unesi šifru bušotine ", 1, Integer.MAX_VALUE));
		b.setNaziv(Pomocno.unosTeksta("Unesi naziv bušotine"));
		return b;
	}
	public List<Busotina> getBusotine() {
		return busotine;
	}
	public void setBusotine(List<Busotina> busotine) {
		this.busotine = busotine;
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	
	
	

}
