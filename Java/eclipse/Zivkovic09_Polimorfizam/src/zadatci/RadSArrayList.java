package zadatci;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RadSArrayList {

	public RadSArrayList() {
		ArrayList lista= new ArrayList<>();
		
		lista.add("Osijek");
		lista.add(new Mjesto());
		
		ArrayList<String> ls = new ArrayList<>();
		ls.add("Edunova");
		//ls.add(new Mjesto());
		
		List<Mjesto> lm = new ArrayList<>();
		lm.add(new Mjesto());
		
		lm = new Vector<>();
		lm.add(new Mjesto());
		
		
	}
	
	public static void main(String[] args) {
		
		new RadSArrayList();
	}
}
