package zadatci;

import java.util.Scanner;

public class Pomocno {

	public static Scanner ulaz;

	public static int unesiBrojRaspona(String poruka, int min, int max) {

		int i;
		while (true) {
			try {
				System.out.println(poruka);
				i = Integer.parseInt(ulaz.nextLine());
				if (i < min || i > max) {
					System.out.println("Broj mora biti između " + min + " i " + max);
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Niste unijeli broj" );

			}
		}
	}
	
	public static String unosTeksta(String poruka) {
		String s;
		while(true) {
			System.out.println(poruka);
			s=ulaz.nextLine();
			if(s.trim().isEmpty()) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}
	}
}
