
import javax.swing.JOptionPane;

public class main_TP1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Choisir les coefficients a, b et c : ");
		String[] coeff = input.split(",");
		double a = Double.parseDouble(coeff[0]);
		double b = Double.parseDouble(coeff[1]);
		double c = Double.parseDouble(coeff[2]);
		
		Eq2Deg test = new Eq2Deg();
		
		try {
			test.solution(a, b, c);
			
		    }
		catch(ArithmeticException e) {
			System.out.println("Division par zéro !");
			System.exit(0);
		}
		
		
		test.show();
	    Frame aff = new Frame();
		System.out.println("test");
	}

}
