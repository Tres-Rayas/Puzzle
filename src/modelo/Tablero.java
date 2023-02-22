package modelo;

public class Tablero {
	private int ancho;
	private int alto;
	private int [][] tablero;
	
	public Tablero(int ancho,int alto) {
		this.ancho=ancho;
		this.alto=alto;
		tablero = new int[ancho][alto];
		
	}
	
}
