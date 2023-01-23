package zadatci;

public class Z02 {

	// Program ispisuje brojeve od 100 do 1
		// u istom redu odvojeno zarezom
	
	public static void main(String[] args) {
		
		for(int i =100;i>0;i--) {
		
		System.out.print(i==1 ? i : (i + ","));
		
		}
		
	}
}
