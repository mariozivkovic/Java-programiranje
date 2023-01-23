package zadatci;

public class Z04_MetodaPrimaNizCijelihBrojevaVracaZbrojSvihParnihBrojeva {

	// Metoda prima niz cijelih brojeva
	// Metoda vraća
	// zbroj svih parnih brojeva
	// u primljenom nizu

	public static int nizBrojeva(int[] brojevi) {

		int zbroj = 0;
		for (int i : brojevi) {
			if (i % 2 == 0) {

				continue;
			}
			zbroj += i;
		}

		return zbroj;
	}
}
