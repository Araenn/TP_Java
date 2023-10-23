
public class Eq2Deg {

	private double re_x1;
	private double re_x2;
	private double im_x1;
	private double im_x2;
	
	public Eq2Deg() {
		this.re_x1 = 1;
		this.re_x2 = 1;
		this.im_x1 = 0;
		this.im_x2 = 0;
	}
	
	public Eq2Deg(double a, double b, double c) {
		double[] res = solution(a, b, c);
		this.re_x1 = res[0];
		this.re_x2 = res[2];
		this.im_x1 = res[1];
		this.im_x2 = res[3];
	}
	
	public double[] get_racines() {
		double[] res =  {this.re_x1, this.im_x1, this.re_x2, this.im_x2};
		return res;
	}
	

	public double delta(double a, double b, double c) {
		
		return Math.pow(b, 2) - 4*a*c;
	}
	
	public double[] solution(double a, double b, double c)  {
		if (a == 0) {
			throw new ArithmeticException();
		}
		
		double delt = delta(a, b, c);
		if (delt == 0) {
			this.re_x1 = - b / (2*a);
			this.re_x2 = this.re_x1;
		}
		else if (delt > 0) {
			this.re_x1 = (-b + Math.sqrt(delt)) / (2*a);
			this.re_x2 = (-b - Math.sqrt(delt)) / (2*a);
		}
		else {
			this.re_x1 = (-b ) / (2*a);
			this.re_x2 = (-b ) / (2*a);
			this.im_x1 = Math.sqrt(-delt);
			this.im_x2 = - Math.sqrt(-delt);
		}
		double[] res = {this.re_x1, this.im_x1, this.re_x2, this.im_x2};
		return res;
	}
	
	public void show() {
		String show_x1;
		String show_x2;
		
		if (this.im_x1 > 0) {
			show_x1 = this.re_x1 + " + " + this.im_x1 + " i";
		}
		else if (this.im_x1 == 0){
			show_x1 = String.valueOf(this.re_x1);
		}
		else {
			show_x1 = this.re_x1 + " " + this.im_x1 + " i";
		}
		
		if (this.im_x2 > 0) {
			show_x2 = this.re_x2 + " + " + this.im_x2 + " i";
		}
		else if (this.im_x2 == 0){
			show_x2 = String.valueOf(this.re_x2);
		}
		else {
			show_x2 = this.re_x2 + " " + this.im_x2 + " i";
		}
		
		
		
		System.out.println(show_x1);
		System.out.println(show_x2);
	}
}
