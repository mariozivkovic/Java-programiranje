package zadatci.model;

import java.util.Date;



public class Grupa extends Entitet{

	private String naziv;
	private int maksimalnoPolaznika;
	private Date datumPocetka;
	private Smjer smjer;
	private Predavac predavac;
	
	public Grupa() {
		super();
	}
	
	
	public Grupa(int sifra, String naziv, int maksimalnoPolaznika, Date datumPocetka, Smjer smjer, Predavac predavac) {
		super(sifra);
		this.naziv = naziv;
		this.maksimalnoPolaznika = maksimalnoPolaznika;
		this.datumPocetka = datumPocetka;
		this.smjer = smjer;
		this.predavac = predavac;
	}


	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getMaksimalnoPolaznika() {
		return maksimalnoPolaznika;
	}
	public void setMaksimalnoPolaznika(int maksimalnoPolaznika) {
		this.maksimalnoPolaznika = maksimalnoPolaznika;
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
	
	
}
