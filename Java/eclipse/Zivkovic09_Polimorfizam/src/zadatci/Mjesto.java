package zadatci;

import java.util.Objects;

public class Mjesto {
	
	private int sifra;
	private String naziv;
	
	
	public Mjesto() {
		super();
	}
	public Mjesto(int sifra, String naziv) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	@Override
	public int hashCode() {
		return Objects.hash(naziv, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mjesto other = (Mjesto) obj;
		return Objects.equals(naziv, other.naziv) && sifra == other.sifra;
	}
	
	@Override
	public String toString() {
	
		return naziv;
	}
	
	

}
