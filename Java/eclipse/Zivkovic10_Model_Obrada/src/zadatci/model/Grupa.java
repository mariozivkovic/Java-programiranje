package zadatci.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grupa extends Entitet{

	private String naziv;
	private Date datumPocetka;
	private Smjer smjer;
	private Predavac predavac;
	private List<Polaznik> polaznici;
	
	
	public Grupa() {
		super();
		polaznici= new ArrayList<>();
	}
	public Grupa(int sifra, String naziv, Date datumPocetka, Smjer smjer, Predavac predavac, List<Polaznik> polaznici) {
		super(sifra);
		this.naziv = naziv;
		this.datumPocetka = datumPocetka;
		this.smjer = smjer;
		this.predavac = predavac;
		this.polaznici = polaznici;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Date getDatumPocetka() {
		return datumPocetka;
	}
	public void setDatumPocetka(Date datumPocetka) {
		this.datumPocetka = datumPocetka;
	}
	public Smjer getSmjer() {
		return smjer;
	}
	public void setSmjer(Smjer smjer) {
		this.smjer = smjer;
	}
	public Predavac getPredavac() {
		return predavac;
	}
	public void setPredavac(Predavac predavac) {
		this.predavac = predavac;
	}
	public List<Polaznik> getPolaznici() {
		return polaznici;
	}
	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	
	
	
	
}
