import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class opencvPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image img;
	private int posx, posy;

	/**
	 * Create the panel.
	 */
	public opencvPanel() {
		posx = 0;
		posy = 0;
		img = null;
	}

	public void paintComponent ( Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, posx, posy, this);
	}
	
	public void Repeindre (Image im, int x, int y) {
		img = im;
		posx = x;
		posy = y;
		repaint();
	}
	
}
