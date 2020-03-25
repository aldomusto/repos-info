package it.unibs.ing.fp.tamaBase;

public class TamaBase {
	
	public static final int MINIMO_VALORI = 0;
	public static final int MASSIMO_VALORI = 100;
	//public static final int N_TAMAGOTCHI = 1;
	public static final int VAL_FELICITA = 80;
	public static final int VAL_INFELICITA = 30;
	
	public int soddisfazione;
	public int sazieta;
	public String nome;
	
	public String toString() {
		StringBuffer messaggio = new StringBuffer();
		messaggio.append(String.format("Stato attuale :\nNome = %s\nSazieta = %d\nSoddisfazione = %d\n",nome,sazieta,soddisfazione));
		if(verificaFelicita() || verificaInfelicita()){
			messaggio.append("Il tamagotchi e' ");
			messaggio.append(verificaFelicita() ? "felice\n" : "");
			messaggio.append(verificaInfelicita() ? "triste\n" : "");
		}
		
		return messaggio.toString();
		
	}
	
	public void daiCarezza(int quante){
		
		for(int i = 0; i<quante; i++) {
			if(soddisfazione <= MASSIMO_VALORI)
				soddisfazione+=1;
			if(soddisfazione>MASSIMO_VALORI)
				soddisfazione=MASSIMO_VALORI;
			
		}
		sazieta-=5;
		if(sazieta<0)
			sazieta=0;
	}
	public void daiBiscotto(int quante){
		
		for(int i = 0; i<quante; i++) {
			if(sazieta < MASSIMO_VALORI)
				sazieta+=1;
			if(sazieta>MASSIMO_VALORI)
				sazieta=MASSIMO_VALORI;
		}
		
		soddisfazione-=5;
		if(soddisfazione<0)
			soddisfazione=0;
	}

	public boolean verificaFelicita() {
		return (sazieta >= VAL_FELICITA && soddisfazione >= VAL_FELICITA);
	}

	public boolean verificaInfelicita() {
		return (sazieta <= VAL_INFELICITA || soddisfazione <= VAL_INFELICITA);
	}
}
