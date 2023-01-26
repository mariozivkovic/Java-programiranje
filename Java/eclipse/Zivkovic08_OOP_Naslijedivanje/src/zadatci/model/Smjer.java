package zadatci.model;

public class Smjer extends Entitet {

	private String naziv;
	private float cijena;
	private float upisnina;
	private boolean certificiran;
		
	public Smjer() {
		super();
	}
	public Smjer(int sifra, String naziv, float cijena, float upisnina, boolean certificiran) {
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
	public float getCijena() {
		return cijena;
	}
	public void setCijena(float cijena) {
		this.cijena = cijena;
	}
	public float getUpisnina() {
		return upisnina;
	}
	public void setUpisnina(float upisnina) {
		this.upisnina = upisnina;
	}
	public boolean isCertificiran() {
		return certificiran;
	}
	public void setCertificiran(boolean certificiran) {
		this.certificiran = certificiran;
	}
	
	
	
}
