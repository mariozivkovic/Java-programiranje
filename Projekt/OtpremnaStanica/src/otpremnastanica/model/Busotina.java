package otpremnastanica.model;

public class Busotina extends NaftnoPolje {

	private boolean aktivna;
	private NaftnoPolje naftnoPolje;

	public Busotina() {
		super();
	}

	public Busotina(int sifra, String naziv, boolean aktivna, NaftnoPolje naftnoPolje) {
		super(sifra, naziv);
		this.aktivna = aktivna;
		this.naftnoPolje = naftnoPolje;
	}

	public boolean isAktivna() {
		return aktivna;
	}

	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}

	public NaftnoPolje getNaftnoPolje() {
		return naftnoPolje;
	}

	public void setNaftnoPolje(NaftnoPolje naftnoPolje) {
		this.naftnoPolje = naftnoPolje;
	}

}
