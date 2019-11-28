package pk;

public class Enemigo {
	private String nombre;
	private int vida = 0;
	private int defensa = 0;
	private int ataque =3;
	private int level = 1;
	private int drop = 0;
	private int drop2 = 0;

	public Enemigo(String nombre, int vida, int defensa, int ataque, int level, int drop, int drop2) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
		this.ataque = ataque;
		this.level = level;
		this.drop = drop;
		this.drop2 = drop2;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getDrop() {
		return drop;
	}
	public void setDrop(int drop) {
		this.drop = drop;
	}


	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		if(vida <= 28 ) {
		this.vida = vida;}
		else if(vida >= 0 ) {
			this.vida = vida;}
		else {
			vida = 0;

		}

	}	
	public int getDrop2() {
		return drop2;
	}
	public void setDrop2(int drop2) {
		this.drop2 = drop2;
	}


	public void EntregarDrop(Jugador jugador) 
	{
		int experienciaJugador = jugador.getExp() + drop;
		jugador.setExp(experienciaJugador);
		int dineroJugador = jugador.getDinero() + drop2;
		jugador.setDinero(dineroJugador);
	}
	public void level_enemigo(int nivel) {
		if(nivel > getLevel()) {
			int cambio = (int)(getVida()*(nivel*0.75));
			setVida(cambio);
			int cambio2 = (int)(getAtaque()*(nivel*0.75));
			setAtaque(cambio2);
			int cambio3 = (int)(getDefensa()*(nivel*0.75));
			setDefensa(cambio3);
			int cambio4 = (int)(getDrop()*(nivel*0.75));
			setDrop2(cambio4);
			int cambio5 = (int)(getDrop2()*(nivel*0.75));
			setDrop2(cambio5);
			setLevel(nivel);
			}
		else if (nivel == 1) {
			setVida(15);
			setDefensa(4);
			setAtaque(3);
			setDrop(3);
			setDrop2(2);

		}

	}

	public void crearEnemigo(int n) {
		Enemigo enemigo[]=new Enemigo[n+1]; 
		for (int i = 1; i<=n;i++) {
		enemigo[i] = new Enemigo( "Caballero",15,4,15,1,3,2);
		System.out.println(enemigo[i]);
		}




	}

}
