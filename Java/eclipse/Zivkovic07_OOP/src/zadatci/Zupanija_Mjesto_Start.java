package zadatci;

public class Zupanija_Mjesto_Start {
	
	public static void main(String[] args) {
		
		Mjesto mjesto = new Mjesto();
		Zupanija zupanija = new Zupanija();
		zupanija.setNaziv("OBŽ");
		mjesto.setZupanija(zupanija);
		
		System.out.println(mjesto.getZupanija().getNaziv());
	}

}
