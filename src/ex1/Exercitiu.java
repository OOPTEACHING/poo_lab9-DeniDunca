package ex1;

public class Exercitiu {

	int g(String zi) throws ExceptieZiNelucratoare
	{
		if(zi == "Duminica")
		{
			throw new ExceptieZiNelucratoare();
		}
		return 1;
	}
	void f() throws ExceptieZiNelucratoare
	{
		try
		{
			g("Duminica");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Nu a fost accesat bine array-ul");
		}
	}
}

