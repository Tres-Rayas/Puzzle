package modelo;

public class Board {
	private int ancho;
	private int alto;
	private int [][] board;
	
	public Board(int ancho,int alto) {
		this.ancho=ancho;
		this.alto=alto;
		board = new int[ancho][alto];
		
	}

	public boolean freePos(Coordinate coord) {
		return getValue(coord) == 0;
	}
	
	public int getValue(Coordinate coord) {
		return board[coord.getX()][coord.getY()];
	}
	public void setValue(Coordinate coord, int i) {
		board[coord.getX()][coord.getY()]=i;
	}

	public int[][] getBoard() {
		return board;
	}
}
