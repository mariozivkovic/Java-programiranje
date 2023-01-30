package zadatci.polimorfizam;

public class Start {
	
	private Oblik[] oblici;

	public Start() {
		
		oblici = new Oblik[2];
		oblici[0] = new Krug(10);
		oblici[1] = new Pravokutnik(4,3);
		prikazPolimorfizma();
		
	}
	
	private void prikazPolimorfizma() {
		for(Oblik o : oblici) {
			System.out.println(o.getClass());
			System.out.println(o.povrsina());
		}
		
	}

	public static void main(String[] args) {
		
		new Start();
	}
}
