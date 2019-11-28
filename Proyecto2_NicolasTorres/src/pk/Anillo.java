package pk;

public class Anillo {
	private int magia;

	public Anillo(int magia) {
		super();
		this.magia = magia;
	}

	public int getMagia() {
		return magia;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int ataque_magico(Jugador j1) {
		int magico = j1.getInteligencia() + getMagia();

		return magico;
	}

}
