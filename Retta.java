package it.unibs.ing.fp.puntirette;

public class Retta {
	
	//y = Ax + B
	private double coeffAngolare; // A
	private double offset; // B
	
	private boolean verticale;
	
	public Retta(Punto p1, Punto p2) {
		
		//la retta è verticale?
		verticale = p1.getX() == p2.getX();
		
		if(verticale) {
			offset = p1.getX();
		}else {
			coeffAngolare = (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
			offset = p2.getY() - coeffAngolare * p2.getX();
		}
	}
	
	public String toString() {
		StringBuffer eq = new StringBuffer();//creo una stringa vuota
		eq.append("L'equazione e': ");//aggiunge la stringa
		
		if (verticale) {//se la retta � verticale scrivi la retta nella forma x=B
			eq.append(String.format("x = %.1f",offset));
		
		}else {		//se non � verticale allora si � nel caso generale
					//y=Ax+B // caso generale
				if(coeffAngolare == 0) {// se A==0 // y=B
				eq.append(String.format("y = %.1f",offset));
				
			} else {
				//se B==0 -> y=Ax
				if (offset == 0) {
					eq.append(String.format("y = %.1f*x", coeffAngolare));
				} else {
					String segno = (offset >0 ? "+" : "-");
					eq.append(String.format("y = %.1f*x %s %.1f", coeffAngolare,segno,Math.abs(offset)));
				}
			}
		}
		
		return eq.toString();
	}

	//METODO per vedere se il punto appartiene o meno ala retta
		
	public boolean appartiene(Punto p) {
		if(verticale)//se la retta � verticale controlla se la x del punto � uguale all'offset
			return p.getX() == offset;//ritorna il risultato booleano
		else//se la retta non � verticale controlla se soddisfa l'equazione y=Ax+B
			return p.getY() == (coeffAngolare * p.getX() + offset);//ritorna il risultato
	}
}
