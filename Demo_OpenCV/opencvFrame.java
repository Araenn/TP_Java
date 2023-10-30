import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class opencvFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private opencvPanel contentPane;
	private Mat img;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args ) {
		EventQueue.invokeLater (new Runnable () {
			public void run () {
				try {
					System.loadLibrary ( Core.NATIVE_LIBRARY_NAME );
					// chargement de la librairie native
					opencvFrame frame = new opencvFrame();
					frame.setVisible ( true );
				}
				catch(Exception e) {e.printStackTrace();}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public opencvFrame() {
		super(" Traitement d’images ",null );
		setDefaultCloseOperation( JFrame . EXIT_ON_CLOSE );
		setBounds(100 , 100 , 450 , 300);
		contentPane = new opencvPanel();
		img = new Mat();
		img = Imgcodecs.imread ("C:/Users/leaye/git/TP_Java/Demo_OpenCV/lotus.jpg", Imgcodecs.IMREAD_COLOR );
		
		this.setSize(img.cols(), img.rows());
		// fenêtre retaillée à la taille de l’image chargée
		contentPane . setBorder (new EmptyBorder (5, 5, 5, 5));
		// Conversion de matrice vers image
		Image tmpImg = toBufferedImage (img);
		// Appel de la méthode Repeindre qui forcera la panneau graphique à se tracer
		contentPane . Repeindre (tmpImg ,0 ,0);
		setContentPane ( contentPane );
	}
	
	public Image toBufferedImage (Mat m) {
		int type = BufferedImage.TYPE_BYTE_GRAY ; // si niveau de gris
		if ( m. channels () > 1 ) { 
			type = BufferedImage.TYPE_3BYTE_BGR ; // si image couleur }
		}
		int bufferSize = m.channels()*m. cols()*m.rows();
		byte[] b = new byte [ bufferSize ];
		m.get (0, 0, b); // récupère tous the pixels de la matrice m dans b
		BufferedImage image = new BufferedImage (m.cols(),m.rows(), type);
		final byte [] targetPixels = ((DataBufferByte)image.getRaster().getDataBuffer()).getData();
		System.arraycopy(b, 0, targetPixels, 0, b.length); // copy de b vers targetPixels
		return image ;
	}

}
