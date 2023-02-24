package modelo;

public class Movement {

	private Board board;
	private Data data;
	private Coordinate lastCoord;
	private int oldValue;
	private int aidValue;

	public Movement(Board board) {
		this.lastCoord = null;
		this.oldValue=0;
		this.aidValue=0;
	}

	public Board move(Coordinate coord) {

		if (getLastcoord() == null) {
			oldValue = selectPiece(coord);
			setLastcoord(coord);
			return this.board;
		} else if (getLastcoord() != null && checkFreePos(coord)
				&& Coordinate.adjacentBox(coord, getLastcoord())) {
			replacePiece(this.lastCoord, coord);
			return this.board;
		}

		return this.board;

	}

	private int selectPiece(Coordinate coord) {
		return data.getBoard().getValue(coord);
	}

	private void placePiece(Coordinate coord, int value) {
		data.getBoard().setValue(coord, value);
	}

	private void replacePiece(Coordinate oldCoord, Coordinate newCoord) {

		aidValue = selectPiece(newCoord);
		placePiece(newCoord, oldValue);
		placePiece(oldCoord, aidValue);
		aidValue = selectPiece(oldCoord);
		setLastcoord(newCoord);
	}

	public boolean checkFreePos(Coordinate cords) {
		return data.getBoard().freePos(cords);
	}
	public Coordinate getLastcoord() {
		return lastCoord;
	}
	public void setLastcoord(Coordinate lastcoord) {
		this.lastCoord = lastcoord;
	}
}
