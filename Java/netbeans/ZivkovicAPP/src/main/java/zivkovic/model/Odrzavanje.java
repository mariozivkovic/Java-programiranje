package zivkovic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Odrzavanje extends Entitet {

	private Date datum;
        @ManyToMany
	private List<Zaposlenik> zaposlenici;
        @ManyToMany
	private List<PosaoBusotina>posloviBusotine;
	
	
	public Odrzavanje() {
		super();
		
		zaposlenici = new ArrayList<>();
		posloviBusotine = new ArrayList<>();
	}
	public Odrzavanje(int sifra, Date datum, List<Zaposlenik> zaposlenici,
			List<PosaoBusotina> posloviBusotine) {
		super(sifra);
		this.datum = datum;
		this.zaposlenici = zaposlenici;
		this.posloviBusotine = posloviBusotine;
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
	public List<PosaoBusotina> getPosloviBusotine() {
		return posloviBusotine;
	}
	public void setPosloviBusotine(List<PosaoBusotina> posloviBusotine) {
		this.posloviBusotine = posloviBusotine;
	}
	@Override
	public String toString() {
		
		return datum + " " +  zaposlenici + " " + posloviBusotine;
	}
	
	

}
