package zadatci;

//Kreirati klasu Racunalo, definirati minimalno 5
//svojstava razlicitih tipova podataka

public class Racunalo {

	private String naziv;
	private boolean Os;
	private float cijena;
	private double dijagonala;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public boolean isOs() {
		return Os;
	}

	public void setOs(boolean os) {
		Os = os;
	}

	public float getCijena() {
		return cijena;
	}

	public void setCijena(float cijena) {
		this.cijena = cijena;
	}

	public double getDijagonala() {
		return dijagonala;
	}

	public void setDijagonala(double dijagonala) {
		this.dijagonala = dijagonala;
	}

	public int getMemorija() {
		return memorija;
	}

	public void setMemorija(int memorija) {
		this.memorija = memorija;
	}

	private int memorija;

}
