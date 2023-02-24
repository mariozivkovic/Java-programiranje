package zivkovic.model;

import jakarta.persistence.Entity;

@Entity
public class Posao extends Entitet {

	private String naziv;

	public Posao() {
		super();
	}

	public Posao(int sifra, String naziv) {
		super(sifra);
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	@Override
	public String toString() {
	
		return naziv;
	}

}
