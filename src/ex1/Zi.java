package ex1;

public class Zi {
	private String nume;
	private boolean esteLucratoare;

	public Zi(String nume, boolean esteLucratoare) {
		this.nume = nume;
		this.esteLucratoare = esteLucratoare;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return this.nume;
	}

	public void setLucratoare() {
		this.esteLucratoare = true;
	}

	public void setNelucratoare() {
		this.esteLucratoare = false;
	}

	public boolean getEsteLucratoare() {
		return this.esteLucratoare;
	}
}
