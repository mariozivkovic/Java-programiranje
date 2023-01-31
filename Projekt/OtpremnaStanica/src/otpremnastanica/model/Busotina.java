package otpremnastanica.model;

import java.util.ArrayList;
import java.util.List;

public class Busotina extends Entitet {
	
	private String naziv;
	private boolean aktivna;
	private List<NaftnoPolje> naftnaPolja;

	public Busotina() {
		super();
		naftnaPolja = new ArrayList<>();
	}
	
	public Busotina(int sifra, String naziv, boolean aktivna, List<NaftnoPolje> naftnaPolja) {
		super(sifra);
		this.naziv = naziv;
		this.aktivna = aktivna;
		this.naftnaPolja = naftnaPolja;
	}



	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public boolean isAktivna() {
		return aktivna;
	}

	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}

	public List<NaftnoPolje> getNaftnaPolja() {
		return naftnaPolja;
	}

	public void setNaftnaPolja(List<NaftnoPolje> naftnaPolja) {
		this.naftnaPolja = naftnaPolja;
	}
	

	
}
