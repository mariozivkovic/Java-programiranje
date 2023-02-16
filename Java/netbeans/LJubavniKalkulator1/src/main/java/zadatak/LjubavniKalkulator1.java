/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zadatak;

/**
 *
 * @author lovre
 */
public class LjubavniKalkulator1 {

    public static void main(String[] args) {
       
             new Prozor().setVisible(true);

	}

	
	public static int[] prviKorak(String ime1, String ime2) {
		int brojac;
		String zbrojImena = ime1 + ime2;
		char slovaUPolju[] = (zbrojImena.toUpperCase().toCharArray());
		int poljeBrojeva[] = new int[zbrojImena.length()];

		for (int i = 0; i < (zbrojImena.length()); i++) {
			brojac = 0;
			for (int j = 0; j < (zbrojImena.length()); j++) {
				if (slovaUPolju[i] == slovaUPolju[j]) {
					brojac++;
				}
			}
			poljeBrojeva[i] = brojac;
		}
		int veci = 0, manji = 0;
		if (ime1.length() > ime2.length()) {
			veci = ime1.length();
			manji = ime2.length();
		} else {
			manji = ime1.length();
			veci = ime2.length();
		}

		int meduPolje[] = new int[veci];
		if (veci > manji) {
			for (int i = 0; i < manji; i++) {
				meduPolje[i] = poljeBrojeva[i] + poljeBrojeva[poljeBrojeva.length - i - 1];
			}
			for (int i = 0; i < (veci - manji); i++) {
				meduPolje[manji + i] = poljeBrojeva[manji + i];
			}
		} else {
			for (int i = 0; i < manji; i++) {
				meduPolje[i] = poljeBrojeva[i] + poljeBrojeva[poljeBrojeva.length - i - 1];
			}
			for (int i = 0; i < (veci - manji); i++) {
				meduPolje[manji + i] = poljeBrojeva[manji + i];
			}
		}

		return viseZnamenkasti(meduPolje);
	}

	public static int[] kalkulator(int meduPolje[]) {
		if (meduPolje.length <= 2) {
			return meduPolje;
		} else {
			if (meduPolje.length % 2 == 0) {
				int postupak[] = new int[(meduPolje.length / 2)];
				for (int i = 0; i < postupak.length; i++) {
					postupak[i] = meduPolje[i] + meduPolje[(meduPolje.length - 1 - i)];
				}
				if (postupak.length > 2) {
					return kalkulator(viseZnamenkasti(postupak));
				} else {
					return kalkulator(viseZnamenkasti(postupak));
				}
			} else {
				int postupak[] = new int[(meduPolje.length / 2) + 1];
				for (int i = 0; i < postupak.length; i++) {
					postupak[i] = meduPolje[i] + meduPolje[meduPolje.length - i - 1];
					postupak[postupak.length - 1] = meduPolje[meduPolje.length / 2];

				}
				if (postupak.length > 2) {
					return kalkulator(viseZnamenkasti(postupak));
				} else
					return kalkulator(viseZnamenkasti(postupak));
			}

		}
	}

	public static int[] viseZnamenkasti(int[] polje) {
		int brojac = 0;
		for (int i : polje) {
			if (i >= 10) {
				brojac++;
			}
		}
		int[] polje1 = new int[polje.length + brojac];
		int index = 0;
		for (int i = 0; i < polje.length; i++) {

			if (polje[i] < 10) {
				polje1[index++] = polje[i];
			} else {
				polje1[index++] = (polje[i] / 10);
				polje1[index++] = (polje[i] % 10);

			}
		}

		return polje1;
	}
        
     public static String ispisLjubavi(String ime1 , String ime2){
         String broj="";
        for(int i: kalkulator(prviKorak(ime1, ime2))){
           broj+=i;
     }
         return broj;
     }
    }

