package zadatci;

public class ZZ02 {

	// Kreirati program koji ispisuje tablicu množenja 15x15

	public static void main(String[] args) {

		for(int i=1;i<=15;i++) {
			for(int j=1;j<=15;j++) {
				System.out.printf("%4d" , i*j);
			}
			System.out.println();
		}
	}
}
