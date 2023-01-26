package otpremnastanica.model;

import java.util.Date;

public class Odrzavanje extends Entitet {

	private Date datum;
	private Zaposlenik zaposlenik;

	public Odrzavanje() {
		super();
	}

	public Odrzavanje(int sifra, Date datum, Zaposlenik zaposlenik) {
		super(sifra);
		this.datum = datum;
		this.zaposlenik = zaposlenik;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Zaposlenik getZaposlenik() {
		return zaposlenik;
	}

	public void setZaposlenik(Zaposlenik zaposlenik) {
		this.zaposlenik = zaposlenik;
	}

}
