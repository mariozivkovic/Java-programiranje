package otpremnastanica.model;

public class NaftnoPolje extends Entitet {

	private String naziv;

	public NaftnoPolje() {
		super();
	}

	public NaftnoPolje(int sifra, String naziv) {
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
