package pk;

public class Amuleto {
	private int masdef;
	private int masFuerza;
	private int masSuerte;
	private int masInt;
	public Amuleto( int masdef, int masFuerza, int masSuerte, int masInt) {
		super();
		this.masdef = masdef;
		this.masFuerza = masFuerza;
		this.masSuerte = masSuerte;
		this.masInt = masInt;
	}
	public int getMasdef() {
		return masdef;
	}
	public void setMasdef(int masdef) {
		this.masdef = masdef;
	}
	public int getMasFuerza() {
		return masFuerza;
	}
	public void setMasFuerza(int masFuerza) {
		this.masFuerza = masFuerza;
	}
	public int getMasSuerte() {
		return masSuerte;
	}
	public void setMasSuerte(int masSuerte) {
		this.masSuerte = masSuerte;
	}
	public int getMasInt() {
		return masInt;
	}
	public void setMasInt(int masInt) {
		this.masInt = masInt;
	}

	public void colocar_amuleto(Jugador j1) {
		int mas_stats_def = j1.getDefensa() + getMasdef();
		j1.setDefensa(mas_stats_def);
		int mas_stats_fuerza = j1.getFuerza() + getMasFuerza();
		j1.setFuerza(mas_stats_fuerza);
		int mas_stats_suerte = j1.getSuerte() + getMasSuerte();
		j1.setSuerte(mas_stats_suerte);
		int mas_stats_int = j1.getInteligencia() + getMasInt();
		j1.setInteligencia(mas_stats_int);
	}

}
