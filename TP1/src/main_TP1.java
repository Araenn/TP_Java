import java.io.*;

public class main_TP1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double a = 7;
		double b = 0;
		double c = 5;
		
		Eq2Deg test = new Eq2Deg();
		
		try {
			test.solution(a, b, c);}
		catch(ArithmeticException e) {
			System.out.println("Division par zéro !");
			System.exit(0);
		}
		
		double[] res = test.get_racines();
		test.show();
	}

}
