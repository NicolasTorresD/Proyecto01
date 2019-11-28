package pk;

public class Armadura {
	private int proteccion;
	private String tipo;
	public Armadura(int proteccion, String tipo) {
		super();
		this.proteccion = proteccion;
		this.tipo = tipo;
	}
	public int getProteccion() {
		return proteccion;
	}
	public void setProteccion(int proteccion) {
		this.proteccion = proteccion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int bloqueo(Jugador j1) {
		int bloqueo = j1.getDefensa() + getProteccion();
		return bloqueo;
	}


}
