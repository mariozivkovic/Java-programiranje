package otpremnastanica.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Odrzavanje extends Entitet {

	private Date datum;
	private List<Zaposlenik> zaposlenici;
	
	
	public Odrzavanje() {
		super();
		zaposlenici = new ArrayList<>();
	}
	public Odrzavanje(int sifra, Date datum, List<Zaposlenik> zaposlenici) {
		super(sifra);
		this.datum = datum;
		this.zaposlenici = zaposlenici;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public List<Zaposlenik> getZaposlenici() {
		return zaposlenici;
	}
	public void setZaposlenici(List<Zaposlenik> zaposlenici) {
		this.zaposlenici = zaposlenici;
	}


}
