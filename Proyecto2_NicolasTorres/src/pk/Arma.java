package pk;

public class Arma {
	private String tipo_arma;
	private int daño_arma;
	public Arma( String tipo_arma, int daño_arma) {
		super();
		this.tipo_arma = tipo_arma;
		this.daño_arma = daño_arma;
	}
	public String getTipo_arma() {
		return tipo_arma;
	}
	public void setTipo_arma(String tipo_arma) {
		this.tipo_arma = tipo_arma;
	}
	public int getDaño_arma() {
		return daño_arma;
	}
	public void setDano_arma(int daño_arma) {
		this.daño_arma = daño_arma;
	}	
	public int ataque(Jugador j1) {
		int ataque = getDaño_arma() + j1.getFuerza();
		return ataque;
	}
	public int ataque_area(Jugador j1) {
		float area =(float)((getDaño_arma() + j1.getFuerza())*0.834);
		return (int)area;
	}

	public int ataque_cargado(Jugador j1) {
		float cargado = (float)((getDaño_arma() + j1.getFuerza())*1.5);
		int costo = j1.getRoca_magica() - 1;
		j1.setRoca_magica(costo);
		return (int)cargado;
	}

}
