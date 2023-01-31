package zadatci.model;

import java.math.BigDecimal;

public class Smjer extends Entitet{
	
	private String naziv;
	private BigDecimal cijena;
	private BigDecimal upisnina;
	private boolean certificiran;
		
	public Smjer() {
		super();
	}
	
	
	public Smjer(int sifra, String naziv, BigDecimal cijena, BigDecimal upisnina, boolean certificiran) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.upisnina = upisnina;
		this.certificiran = certificiran;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public BigDecimal getCijena() {
		return cijena;
	}


	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}


	public BigDecimal getUpisnina() {
		return upisnina;
	}


	public void setUpisnina(BigDecimal upisnina) {
		this.upisnina = upisnina;
	}


	public boolean isCertificiran() {
		return certificiran;
	}


	public void setCertificiran(boolean certificiran) {
		this.certificiran = certificiran;
	}


	@Override
	public String toString() {
		
		return naziv;
	

	}
}
