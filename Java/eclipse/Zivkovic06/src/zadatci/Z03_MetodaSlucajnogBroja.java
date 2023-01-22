package zadatci;

public class Z03_MetodaSlucajnogBroja {

	//Program unosi imena dvije osobe i 
	// metodom slucajnog broja ispisuje koliko se vole od 10 do 90
	
	public static void main(String[] args) {
		
		String ime1 = Pomocno.obavezanUnosStringa("Unesi svoje ime");
		String ime2 = Pomocno.obavezanUnosStringa("Unesi ime simpatije");
		
		int slucajniBroj=Pomocno.slucajniBrojURasponu(10, 90);
		
		System.out.println(ime1 + " i " + ime2 + " se vole " + slucajniBroj + "%");
	}
	
}
