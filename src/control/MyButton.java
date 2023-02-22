package control;

import javax.swing.JButton;
public class MyButton extends JButton {
	private int posX;
	private int posY;
	private static int valor=1;
	public MyButton(int posY,int posX) {
		super(Integer.toString(valor));
		valor++;
		this.posX=posX;
		this.posY=posY;
	}

}
