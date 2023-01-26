package otpremnastanica.model;

public class OdrzavanjePosaoBusotina extends Entitet {

	private Odrzavanje odrzavanje;
	private Posao posao;
	private Busotina busotina;
	private String napomena;
	private double tlakTubinga;
	private double tlakNaftovoda;
	private double tlakCasinga;

	public OdrzavanjePosaoBusotina() {
		super();
	}

	public OdrzavanjePosaoBusotina(int sifra, Odrzavanje odrzavanje, Posao posao, Busotina busotina, String napomena,
			double tlakTubinga, double tlakNaftovoda, double tlakCasinga) {
		super(sifra);
		this.odrzavanje = odrzavanje;
		this.posao = posao;
		this.busotina = busotina;
		this.napomena = napomena;
		this.tlakTubinga = tlakTubinga;
		this.tlakNaftovoda = tlakNaftovoda;
		this.tlakCasinga = tlakCasinga;
	}

	public Odrzavanje getOdrzavanje() {
		return odrzavanje;
	}

	public void setOdrzavanje(Odrzavanje odrzavanje) {
		this.odrzavanje = odrzavanje;
	}

	public Posao getPosao() {
		return posao;
	}

	public void setPosao(Posao posao) {
		this.posao = posao;
	}

	public Busotina getBusotina() {
		return busotina;
	}

	public void setBusotina(Busotina busotina) {
		this.busotina = busotina;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public double getTlakTubinga() {
		return tlakTubinga;
	}

	public void setTlakTubinga(double tlakTubinga) {
		this.tlakTubinga = tlakTubinga;
	}

	public double getTlakNaftovoda() {
		return tlakNaftovoda;
	}

	public void setTlakNaftovoda(double tlakNaftovoda) {
		this.tlakNaftovoda = tlakNaftovoda;
	}

	public double getTlakCasinga() {
		return tlakCasinga;
	}

	public void setTlakCasinga(double tlakCasinga) {
		this.tlakCasinga = tlakCasinga;
	}

}
