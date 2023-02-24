package control;

import javax.swing.JButton;

import modelo.Coordinate;

public class MyButton extends JButton {
	private Coordinate coordinate;
	private static int value = 0;

	public MyButton(int posY, int posX) {
		super(Integer.toString(value));
		value++;
		this.coordinate = new Coordinate(posX, posY);
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	

}
