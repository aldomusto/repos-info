package it.unibs.ing.fp.puntirette;

public class Punto {
	
	//2 attributi double che rappresentano coord x e xoord y
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x; //la variabile che ha this davanti è quella inetrna della classe
		this.y = y;
	}
	
	public double getX() { //struttura getter o setter prestabilito
		return x;
	}

	public double getY() {
		return y;
	}
	/*
	public void setX(double x) { creare in automatico! con
		this.x = x;              tasto destro
	}							 Source
								 Generate Setters and Getters
	public void setY(double y) { Selezioni ciò che ti interessa
		this.y = y;
	}
    */

	public double distanza(Punto p2) {
		//Espressione per il calcolo della distanza
		return Math.sqrt(Math.pow(x - p2.x , 2) + Math.pow(y - p2.y , 2));
		
	}

	public boolean uguali(Punto p2) {
		//se la distanza è uguale a 0, i due punti sono uguali
		return distanza(p2) == 0;
	}
	
	
	
    
	
}
