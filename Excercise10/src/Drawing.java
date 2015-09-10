import javax.swing.JApplet;

import java.awt.Graphics;
public class Drawing extends JApplet {
	public void paint(Graphics canvas){
		int n1 = 60;
		canvas.drawArc(n1, 0, n1, n1, 180, 180);
		canvas.drawArc(0, n1, n1, n1, 270, 180);
		canvas.drawOval(n1, n1, n1, n1);
		canvas.drawArc(2*n1, n1, n1, n1, 90, 180);
		canvas.drawArc(n1, 2*n1, n1, n1, 0, 180);
		canvas.fillOval(6*n1/5, 6 * n1/5, 3 * n1/5, 3 * n1/5);
	}
}