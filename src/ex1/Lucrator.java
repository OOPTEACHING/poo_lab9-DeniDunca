package ex1;

public class Lucrator {
	private String nume;
	private CalendarLucru calendar = new CalendarLucru();

	public Lucrator(String nume) {
		this.nume = nume;
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		boolean esteGasita = false;
		for (int i = 0; i <= calendar.getZile().length; i++) {
			if (calendar.getZile()[i].getNume().equals(zi)) {
				esteGasita = true;
				if (calendar.getZile()[i].getEsteLucratoare()) {
					System.out.println("Lucratorul " + nume + " lucreaza " + calendar.getZile()[i].getNume());
				} else {
					// new Throwable().printStackTrace();
					throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
				}
			}
		}
		if (!esteGasita) {
			System.out.println(zi + " nu este o zi a saptamanii");
		}
	}
}
