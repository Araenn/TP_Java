/*
public class classe_imbriquee {
	private static double taux = 2;
	
	static class ClasseImbriquee {
		public double calcul(double prix) {
			return prix * taux;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classe_imbriquee.ClasseImbriquee obj = new classe_imbriquee.ClasseImbriquee();
		System.out.println("statique : " + obj.calcul(6));	
	}

}
*/

public class classe_imbriquee {
	private static double taux = 2;
	
	class ClasseImbriquee {
		public double calcul(double prix) {
			return prix * taux;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classe_imbriquee objP = new classe_imbriquee();
		classe_imbriquee.ClasseImbriquee obj;
		obj = objP.new ClasseImbriquee();
		System.out.println("non statique : " + obj.calcul(6));	
	}

}
