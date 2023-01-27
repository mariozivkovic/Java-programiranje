package zadatci;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulatorMetoda {

	
	
	public static int[] iteracija(String ime1, String ime2) {
		
		String imenaSpojeno = ime1.toLowerCase() + ime2.toLowerCase();
		int brojac = 0;
		int[] brojeviSlova = new int[imenaSpojeno.length()];
		char[] imenaZajedno = (imenaSpojeno.toCharArray());

		System.out.println(Arrays.toString(imenaZajedno));

		for (int i = 0; i < imenaSpojeno.length(); i++) {
			brojac = 0;
			for (int j = 0; j < imenaSpojeno.length(); j++) {
				if (imenaSpojeno.charAt(i) == imenaSpojeno.charAt(j)) {

					brojac++;
				}
			}
			brojeviSlova[i] = brojac;

		}

		brojeviSlova = broj(brojeviSlova);

		System.out.println(Arrays.toString(brojeviSlova));

		if (ime1.length() >= ime2.length()) {
			int[] niz = new int[ime1.length()];
			for (int i = 0; i < ime1.length(); i++) {
				if (i >= ime2.length()) {
					niz[i] = brojeviSlova[brojeviSlova.length - (i + 1)];
				} else {
					niz[i] = brojeviSlova[i] + brojeviSlova[brojeviSlova.length - (1 + i)];
				}
			}

			return broj(niz);
		} else {
			int[] niz = new int[ime2.length()];
			for (int i = 0; i < ime2.length(); i++) {
				if (i >= ime1.length()) {
					niz[i] = brojeviSlova[brojeviSlova.length - (1 + i)];
				} else {
					niz[i] = brojeviSlova[i] + brojeviSlova[brojeviSlova.length - (1 + i)];
				}
			}
			return broj(niz);
		}

	}

	public static int[] parniNeparniBroj(int[] niz) {

		System.out.println(Arrays.toString(niz));

		if (niz.length <= 2) {
			return niz;
		} else {
			if (niz.length % 2 == 0) {
				int[] drugiNiz = new int[niz.length / 2];
				for (int i = 0; i < drugiNiz.length; i++) {
					drugiNiz[i] = niz[i] + niz[niz.length - (1 + i)];
				}
				drugiNiz = broj(drugiNiz);

				if (drugiNiz.length > 2) {
					return parniNeparniBroj(drugiNiz);
				} else {
					return parniNeparniBroj(drugiNiz);
				}
			} else {
				int[] drugiNiz = new int[(niz.length / 2) + 1];
				for (int i = 0; i < drugiNiz.length; i++) {
					if (i == drugiNiz.length - 1) {
						drugiNiz[i] = 0 + niz[niz.length - (1 + i)];
					} else {
						drugiNiz[i] = niz[i] + niz[niz.length - (1 + i)];
					}
				}

				if (drugiNiz.length > 2) {
					return parniNeparniBroj(broj(drugiNiz));
				} else {
					return parniNeparniBroj(broj(drugiNiz));
				}
			}
		}

	}

	public static int[] broj(int[] niz) {
		int brojac = 0;
		for (int i : niz) {
			if (i >= 10) {
				brojac++;
			}
		}
		int[] drugiNiz = new int[niz.length + brojac];

		for (int i = 0, j = 0; i < niz.length; i++) {
			if (niz[i] < 10) {
				drugiNiz[j++] = niz[i];
			} else {
				drugiNiz[j++] = (niz[i] / 10);
				drugiNiz[j++] = (niz[i] % 10);
			}
		}

		return drugiNiz;

	}
}
	
	
	
	
	
	


	
	
	
    
	
	


