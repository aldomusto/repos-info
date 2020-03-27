package it.unibs.ing.fp.tamaBase;

import it.unibs.fp.mylib.*;

public class TamaMain {

	public static final int MAX_CAREZZE = 20;
	public static final int MAX_BISCOTTI = 20;

	public static void main(String[] args) {

		System.out.println("Tamagotchi (test v1.0)");

		TamaBase tama1 = TamaUtils.creaTama();

		// System.out.println(tama1.toString());
		if (tama1.contollaParametri())
			compiAzione(azioneScelta());
		
		tama1.salutoFinale();
	}
	
	private static int azioneScelta() {
		
		return InputDati.leggiIntero("Cosa vuoi fare?" + "\n1 per dare una carezza"
					+ "\n2 per dare un biscotto" + "\n0 per uscire: ", 0, 2);
	}
	
	private static void compiAzione(int scelta) {

			switch (scelta) {

			case 1:
				int n_carezze = InputDati.leggiIntero(
						String.format("Quante carezze vuoi dargli (da 1 a %d) = ", MAX_CAREZZE), 1, MAX_CAREZZE);
				tama1.daiCarezza(n_carezze);
				break;

			case 2:
				int n_biscotti = InputDati.leggiIntero(
						String.format(("Quanti biscotti vuoi dargli (da 1 a %d) = "), MAX_BISCOTTI), 1,
						MAX_BISCOTTI);
				tama1.daiBiscotto(n_biscotti);
				break;
			}
			
			System.out.print(tama1.toString());
	
	}

}
