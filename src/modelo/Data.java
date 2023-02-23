package modelo;

import control.MyButton;

public class Data {

	private Board board;
	private boolean end = false;
	private int checker = 0;

	public Data() {
		this.board = new Board(3, 3);
	}

	public boolean makeMovement(Coordinate coordinate) {
		end = checkBoard(board);
		if (!end) {
			Movement movement = new Movement(board);
			board = movement.move(coordinate);
			return true;
		}
		return false;
	}

	public Board getBoard() {
		return board;
	}

	public boolean checkBoard(Board board) {
		for (int i = 0; i < board.getBoard().length; i++) {
			for (int j = 0; j < board.getBoard()[0].length; j++) {
				if (board.getBoard()[i][j] == checker + 1) {
					checker++;
				}
			}
		}
		if (checker == 8) {
			return true;
		}
		return false;
	}

}
