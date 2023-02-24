package modelo;


public class Coordinate {
	private int x, y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setCoordinate(Coordinate destination) {
		this.setX(destination.getX());
		this.setY(destination.getY());
	}
	public static boolean adjacentBox(Coordinate destination, Coordinate origin) {
		int x = destination.getX() - origin.getX(), y = destination.getY() - origin.getY();
		if ((x > -2 && x < 2 && y > -1 && y < 1)||(x > -1 && x < 1 && y > -2 && y < 2))
			return true;
		return false;

	}
	public boolean compareTo(Coordinate otherCord) {
		return this.getX()==otherCord.getX() && this.getY()==otherCord.getY();
	}
}

