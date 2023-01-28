package zadatci;

public class Start {
	
	private Mjesto m1;
	private Mjesto m2;
	
	public Start() {
		 m1 = new Mjesto(1,"Osijek");
		 m2 = new Mjesto(1,"Osijek");
		
		nacinRadaEquals();
		nacinRadatoString();
		specificnostStringklase();
	}
	
	private void specificnostStringklase() {
		String s = "Osijek";
		
		System.out.println(s.hashCode());
		s+=" Edunova";
		System.out.println(s.hashCode());
		System.out.println(s);
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("Osijek");
		sb.append(" Edunova");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		
		
	}

	private void nacinRadatoString() {
		System.out.println(m1);
		
	}

	private void nacinRadaEquals() {
	//	Mjesto m1 = new Mjesto(1,"Osijek");
	//	Mjesto m2 = new Mjesto(1,"Osijek");
		System.out.println(m1.equals(m2));
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		
		
	}

	public static void main(String[] args) {
		
		new Start();
	}
	
	

}
