package pk;

public class Personaje {
	String nombre;
	int vida;
	int ataque;
	
	public Personaje(String nombre, int vida, int ataque) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	

}
