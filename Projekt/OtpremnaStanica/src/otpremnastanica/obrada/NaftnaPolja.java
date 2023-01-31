package otpremnastanica.obrada;

import java.util.ArrayList;
import java.util.List;

import otpremnastanica.Pomocno;
import otpremnastanica.Start;
import otpremnastanica.model.NaftnoPolje;

public class NaftnaPolja {
	
	private List<NaftnoPolje> naftnaPolja;
	private Start start;
	
	
	public NaftnaPolja(Start start) {
		super();
		this.start = start;
		naftnaPolja = new ArrayList<>();
	}
	public NaftnaPolja(Start start, List<NaftnoPolje> naftnaPolja) {
		super();
		this.naftnaPolja = naftnaPolja;
		this.start = start;
	}
	public void izbornik() {
		System.out.println("");
		System.out.println("Naftna polja izbornik");
		System.out.println("Dostupne opcije: ");
		System.out.println("1. Pregled svih naftnih polja");
		System.out.println("2. Unos novog naftnog polja");
		System.out.println("3. Promjena postojećeg naftnog polja");
		System.out.println("4. Brisanje naftnog polja");
		System.out.println("5. Povratak na glavni izbornik");
		odabirIzbornika();
	}
	private void odabirIzbornika() {
		switch(Pomocno.unesiBrojRaspona("Odaberi opciju: ", 1, 5)) {
		case 1:
			pregled();
		}
		
	}
	private void pregled() {
		System.out.println("Naftna polja u aplikaciji");
		for(NaftnoPolje nf : naftnaPolja) {
			System.out.println(nf);
		}
		izbornik();
		
	}
	
	private void unosNovog(){
		naftnaPolja.add(unesiNovoNaftnoPolje());
		izbornik();
	}
	
	private NaftnoPolje unesiNovoNaftnoPolje() {
		NaftnoPolje nf = new NaftnoPolje();
		nf.setSifra(Pomocno.unesiBrojRaspona("Unesi sifru naftnog polja", 1, Integer.MAX_VALUE));
		nf.setNaziv(Pomocno.unosTeksta("Unesi naziv naftnog polja"));
		return nf;
	}
		
	public List<NaftnoPolje> getNaftnaPolja() {
		return naftnaPolja;
	}
	
	
	public void setNaftnaPolja(List<NaftnoPolje> naftnaPolja) {
		this.naftnaPolja = naftnaPolja;
	}
	public Start getStart() {
		return start;
	}
	public void setStart(Start start) {
		this.start = start;
	}
	
	
	
	

}
