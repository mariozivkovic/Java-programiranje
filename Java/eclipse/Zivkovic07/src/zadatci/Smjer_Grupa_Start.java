package zadatci;

import java.util.Date;

public class Smjer_Grupa_Start {

	public static void main(String[] args) {

		Grupa jp27 = kreirajGrupu(1, "JP27", 20, new Date(),
				kreirajSmjer(1, "Java Programiranje", 5555.55f, 500.00f, true));
		Grupa pp26 = kreirajGrupu(1, "PP26", 20, new Date(),
				kreirajSmjer(1, "PHP Programiranje", 1555.55f, 500.00f, false));

		System.out.println(jp27.getNaziv());
		System.out.println(pp26.getSmjer().getNaziv());
		System.out.println(jp27.getSmjer().getCijena() + pp26.getSmjer().getCijena());

	}

	private static Grupa kreirajGrupu(int sifra, String naziv, int maksimalnoPolaznika, Date datumPocetka,
			Smjer smjer) {
		Grupa g = new Grupa();
		g.setSifra(sifra);
		g.setNaziv(naziv);
		g.setMaksimalnoPolaznika(maksimalnoPolaznika);
		g.setDatumPocetka(datumPocetka);
		g.setSmjer(smjer);

		return g;
	}

	private static Smjer kreirajSmjer(int sifra, String naziv, float cijena, float upisnina, boolean certificiran) {
		Smjer r = new Smjer();
		r.setSifra(sifra);
		r.setNaziv(naziv);
		r.setCijena(cijena);
		r.setUpisnina(upisnina);
		r.setCertificiran(certificiran);

		return r;
	}
}
