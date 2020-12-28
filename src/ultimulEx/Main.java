package ultimulEx;

public class Main {

	public static void main(String[] args) {
	ClasaC x;
	x = new ClasaC();
	try
	{
		((ClasaA)x).g();
	}
	catch(Exceptie1 e)
	{
		System.out.println(e.string1);
	}

	}

}
