package zadatci;

public class Predavac extends Osoba {
	
	private String iban;
	
	

	public Predavac() {
		super();
	}

	public Predavac(String ime, String prezime, String iban) {
		super(ime, prezime);
		this.iban = iban;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	

}
