package zadatci.obrada;

import java.util.ArrayList;
import java.util.List;

import zadatci.Pomocno;
import zadatci.Start;
import zadatci.model.Polaznik;

public class Polaznici {
	
	private List<Polaznik> polaznici;
	private Start start;
	
	public Polaznici(Start start) {
		super();
		this.start = start;
		polaznici = new ArrayList<>();
	}
	public Polaznici(Start start, List<Polaznik> polaznici) {
		super();
		this.polaznici = polaznici;
		this.start = start;
		}
	
	public void izbornik() {
		System.out.println("");
		System.out.println("Polaznik izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih polaznika");
		System.out.println("2. Unos novog polaznika");
		System.out.println("3. Promjena postojećeg polaznika");
		System.out.println("4. Brisanje polaznika");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();

	}
	private void odabirIzbornika() {
		switch(Pomocno.unesiBrojRaspona("Odaberi opciju: ", 1,5)) {
		case 1:
		//	pregled();
			break;
		case 2:
		//	unosNovog();
			break;
		case 5:
			start.glavniIzbornik();
		}
		
	}
	public List<Polaznik> getPolaznici() {
		return polaznici;
	}
	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	
	
	
	

}
