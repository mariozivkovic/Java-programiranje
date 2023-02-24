package zivkovic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Busotina extends Entitet {
	
	private String naziv;
	private boolean aktivna;
        @ManyToMany
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
	@Override
	public String toString() {
	
		return naziv;
	}
	

	
}
