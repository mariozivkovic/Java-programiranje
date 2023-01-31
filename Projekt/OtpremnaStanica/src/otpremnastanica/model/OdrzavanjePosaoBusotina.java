package otpremnastanica.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdrzavanjePosaoBusotina extends Entitet {

	private List<Odrzavanje> odrzavanja;;
	private List<Posao> poslovi;
	private List<Busotina> busotine;
	private String napomena;
	private BigDecimal tlakTubinga;
	private BigDecimal tlakNaftovoda;
	private BigDecimal tlakCasinga;

	public OdrzavanjePosaoBusotina() {
		super();
		odrzavanja = new ArrayList<>();
		poslovi = new ArrayList<>();
		busotine = new ArrayList<>();
	}
	
	

	public OdrzavanjePosaoBusotina(int sifra, List<Odrzavanje> odrzavanja, List<Posao> poslovi, List<Busotina> busotine,
			String napomena, BigDecimal tlakTubinga, BigDecimal tlakNaftovoda, BigDecimal tlakCasinga) {
		super(sifra);
		this.odrzavanja = odrzavanja;
		this.poslovi = poslovi;
		this.busotine = busotine;
		this.napomena = napomena;
		this.tlakTubinga = tlakTubinga;
		this.tlakNaftovoda = tlakNaftovoda;
		this.tlakCasinga = tlakCasinga;
	}



	public List<Odrzavanje> getOdrzavanja() {
		return odrzavanja;
	}

	public void setOdrzavanja(List<Odrzavanje> odrzavanja) {
		this.odrzavanja = odrzavanja;
	}

	public List<Posao> getPoslovi() {
		return poslovi;
	}

	public void setPoslovi(List<Posao> poslovi) {
		this.poslovi = poslovi;
	}

	public List<Busotina> getBusotine() {
		return busotine;
	}

	public void setBusotine(List<Busotina> busotine) {
		this.busotine = busotine;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public BigDecimal getTlakTubinga() {
		return tlakTubinga;
	}

	public void setTlakTubinga(BigDecimal tlakTubinga) {
		this.tlakTubinga = tlakTubinga;
	}

	public BigDecimal getTlakNaftovoda() {
		return tlakNaftovoda;
	}

	public void setTlakNaftovoda(BigDecimal tlakNaftovoda) {
		this.tlakNaftovoda = tlakNaftovoda;
	}

	public BigDecimal getTlakCasinga() {
		return tlakCasinga;
	}

	public void setTlakCasinga(BigDecimal tlakCasinga) {
		this.tlakCasinga = tlakCasinga;
	}
	
	

	
	



}
