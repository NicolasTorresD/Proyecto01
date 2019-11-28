package pk;

public class Arma {
	private String tipo_arma;
	private int da�o_arma;
	public Arma( String tipo_arma, int da�o_arma) {
		super();
		this.tipo_arma = tipo_arma;
		this.da�o_arma = da�o_arma;
	}
	public String getTipo_arma() {
		return tipo_arma;
	}
	public void setTipo_arma(String tipo_arma) {
		this.tipo_arma = tipo_arma;
	}
	public int getDa�o_arma() {
		return da�o_arma;
	}
	public void setDano_arma(int da�o_arma) {
		this.da�o_arma = da�o_arma;
	}	
	public int ataque(Jugador j1) {
		int ataque = getDa�o_arma() + j1.getFuerza();
		return ataque;
	}
	public int ataque_area(Jugador j1) {
		float area =(float)((getDa�o_arma() + j1.getFuerza())*0.834);
		return (int)area;
	}

	public int ataque_cargado(Jugador j1) {
		float cargado = (float)((getDa�o_arma() + j1.getFuerza())*1.5);
		int costo = j1.getRoca_magica() - 1;
		j1.setRoca_magica(costo);
		return (int)cargado;
	}

}
