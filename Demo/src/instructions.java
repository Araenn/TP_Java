public class instructions {
	public double truc[][];
	instructions() // Pour une initialisation dans le constructeur
	{truc=new double[3][3]; //instanciation du tableau
	for (int i =0;i<truc.length;i++) { 
		for (int j =0;j<truc[0].length;j++)
			truc[i][j]=i+j;
		}
	}
	public void Aff()
	{ for (int i =0;i<truc.length;i++)
	{
	for (int j =0;j<truc[0].length;j++)
	System.out.print(truc[i][j]+" ");
	System.out.println(" ");
	}
	}
	public static void main(String[] args)
	{
	instructions toto;
	toto=new instructions();
	toto.Aff();
	}
}