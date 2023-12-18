import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import java.awt.SystemColor;
import java.awt.Toolkit;


public class PanelTP2 extends JPanel {
	private String[] fileName;
	private int[][] pos;
	private Boolean imageToDraw;
	private Image[] imageTab;
	
	/**
	 * Create the panel.
	 */
	public PanelTP2() {
		fileName = new String[] {"construct1.gif", "construct2.gif", "construct3.gif"};
		imageTab = new Image[3];
		for (int i = 0; i < fileName.length; i++) {
			Image im = Toolkit.getDefaultToolkit().getImage(fileName[i]);
			imageTab[i] = im;
		}
		
		pos = new int[][] {{200, 200}, {300,200}, {100, 200}};
		imageToDraw = false;
		
		
		setBackground(SystemColor.activeCaption);
		
		JMenuBar menuBar = new JMenuBar();
		add(menuBar);
		
		JMenuItem mntmLancerLeProgramme = new JMenuItem("Lancer le programme");
		mntmLancerLeProgramme.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmLancerLeProgramme);
		
		JMenuItem mnAfficheImage = new JMenuItem("Affiche Image");
		mnAfficheImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imageToDraw = true;
				repaint();
			}
		});
		menuBar.add(mnAfficheImage);
		mnAfficheImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JMenuItem mntmDemarrApp = new JMenuItem("D\u00E9marre app");
		menuBar.add(mntmDemarrApp);
		mntmDemarrApp.setHorizontalAlignment(SwingConstants.CENTER);
		
		JMenuItem mntmFermerApp = new JMenuItem("Fermer app");
		menuBar.add(mntmFermerApp);
		mntmFermerApp.setHorizontalAlignment(SwingConstants.CENTER);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		add(mntmQuitter);
		mntmQuitter.setHorizontalAlignment(SwingConstants.CENTER);
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		if (imageToDraw == true) {
			for (int i = 0; i < imageTab.length; i++) {
				for (int j = 0; j < 1; j++) {
					g.drawImage(imageTab[i], pos[i][j], pos[i][j], this);
				}
			}
		}
	}
	
}
