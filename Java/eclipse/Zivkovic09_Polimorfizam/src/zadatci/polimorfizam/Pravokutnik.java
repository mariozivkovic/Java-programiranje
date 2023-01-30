package zadatci.polimorfizam;

public class Pravokutnik extends Oblik {

		private int duzina;
		private int sirina;
	

	public Pravokutnik() {
			super();
		}




	public Pravokutnik(int duzina, int sirina) {
			super();
			this.duzina = duzina;
			this.sirina = sirina;
		}




	public int getDuzina() {
			return duzina;
		}




		public void setDuzina(int duzina) {
			this.duzina = duzina;
		}




		public int getSirina() {
			return sirina;
		}




		public void setSirina(int sirina) {
			this.sirina = sirina;
		}




	@Override
	public double povrsina() {
		
		return duzina*sirina;
	}
	
	

}
