package it.unibs.ing.fp.puntirette;
import it.unibs.fp.mylib.*;

public class PuntiRetteMain {

	public static void main(String[] args) {
		
		//1. STEP
		// Creazione di 2 punti e calcolo della loro distanza
		Punto p1 = inserisciValori("Inserisci le coordinate del punto 1");
		Punto p2 = inserisciValori("inseirsci le coordinate del punto 2");
		
		double distanza = p1.distanza(p2);
		
		System.out.println(String.format("La distanza tra i due punti è = %5f", distanza));
		//con lo string formato posso stampare nella console con una formattazione precisa, e con tot cifre dopo la virgola
		
		//2. STEP
		//trovare l'equazione della retta passante per i due p.ti
		
		boolean puntiUguali = p1.uguali(p2);
		
		if(puntiUguali == true) { //PUNTI UGUALI
			
			System.out.println("I due punti sono uguali! ");
			
		}else{//PUNTI DIVERSI
			
			Retta r = new Retta(p1, p2);
			System.out.println(r.toString());

			Punto p3 = new Punto(1.0, 3.0);
			boolean allineato = r.appartiene(p3);
			
			if(allineato)
				System.out.println(String.format("I punti sono allineati."));
			else
				System.out.println(String.format("I punti non sono allineati."));
		}
		
	}

	public static Punto inserisciValori(String messaggio) {
		
		System.out.println(messaggio);
		double x1, y1;
		x1=InputDati.leggiDouble("Inserisci l'ascisse del punto: ");
		y1=InputDati.leggiDouble("Inserisci l'ordianta del punto: ");
		Punto p1 = new Punto(x1, y1);
		return p1;
		
	}

}
