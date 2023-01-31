package zadatci.model;

public abstract class Entitet {
	
	private int sifra;
	
	public Entitet() {
		super();
	}

	public Entitet(int sifra) {
		super();
		this.sifra = sifra;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	
	

}
