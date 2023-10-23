import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JMenuItem;

public class Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel() {
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Aide");
		add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Lancer");
		add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Quitter");
		add(mntmNewMenuItem_1);

	}

	public void paint(Graphics g) {
		super.paint(g);
	}
}
