package ex1;

public class Main {

	public static void main(String[] args) {
		// ex 1
		Lucrator lucrator1 = new Lucrator("Ana");

		try {
			lucrator1.lucreaza("Joi");
			lucrator1.lucreaza("Maine");
			lucrator1.lucreaza("Sambata");
		}
		catch (ExceptieZiNelucratoare ex)
		{
			System.out.println(ex.getMessage());
		} catch (ArrayIndexOutOfBoundsException e)// ex 3
		{
			System.out.println("Nu a fost accesat bine array-ul");
		} finally 
		{
			System.out.println("Am terminat primul bloc try catch");// ex 4
		}

		// ex 2
		Lucrator lucrator2 = null;

		try {
			lucrator2.lucreaza("Joi");
		} catch (ExceptieZiNelucratoare e) {

			System.out.println(e.getMessage());

		} catch (NullPointerException e) {
			System.out.println("Lucratorul nu exista");

		} catch (ArrayIndexOutOfBoundsException e)// ex 3
		{
			System.out.println("Nu a fost accesat bine array-ul");
		}
	}

}
