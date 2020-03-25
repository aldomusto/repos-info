package it.unibs.ing.fp.tamaBase;

import it.unibs.fp.mylib.*;

public class TamaUtils {
	
	public static final int MINIMO_VALORI = 0;
	public static final int MASSIMO_VALORI = 100;
	
	static TamaBase creaTama() {
		TamaBase tama = new TamaBase();
		
		leggiSoddisfazione(tama);
		leggiSazieta(tama);
		leggiNome(tama);
		
		return tama;
	}

	private static void leggiSazieta(TamaBase tama) {
		int _sazieta = InputDati.leggiIntero(String.format("Inserisci il valore intero di sazieta' iniziale (da %d a %d) : ",MINIMO_VALORI,MASSIMO_VALORI), MINIMO_VALORI, MASSIMO_VALORI);
		tama.sazieta = _sazieta;
	}

	private static void leggiSoddisfazione(TamaBase tama) {
		int _soddisfazione = InputDati.leggiIntero(String.format("Inserisci il valore intero di soddisfazione iniziale (da %d a %d) : ",MINIMO_VALORI,MASSIMO_VALORI), MINIMO_VALORI, MASSIMO_VALORI);
		tama.soddisfazione = _soddisfazione ;
	}

	private static void leggiNome(TamaBase tama) {
		String _nome = InputDati.leggiStringa("Inserisci il nome del tamagotchi : ");
		
		tama.nome = _nome;
		
	}
}
