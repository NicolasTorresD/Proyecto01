package pk;
import java.util.Scanner;

public class Jugador {
	private String nombre = "Ark";
	private String clase;
	private int level = 1;
	private int exp= 0;
	private int vida = 28;
	private int vidamx = 28;
	private int dinero = 0;
	private int roca_magica = 0;
	private int fuerza = 3;
	private int defensa= 2;
	private int suerte = 3;
	private int inteligencia = 3;
	private Scanner sn;
	private Scanner sn2;
	public Jugador( String nombre, String clase,int level, int exp, int vida,int vidamx , int dinero, int roca_magica, int fuerza,
			int defensa, int suerte, int inteligencia) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.level = level;
		this.exp = exp;
		this.vida = vida;
		this.vidamx = vidamx;
		this.dinero = dinero;
		this.roca_magica = roca_magica;
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.suerte = suerte;
		this.inteligencia = inteligencia;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getVida() {
		return vida;
	}
	public void setVidamx(int vidamx) {
		this.vidamx = vidamx;
	}


	public int getVidamx() {
		return vidamx;
	}


	public void setVida(int vida) {
		if(vida > getVidamx() ) {
		this.vida = getVidamx();
		}
		else if(vida < 0) {
			this.vida = 0;
		}
		else
			this.vida = vida;

	}
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public int getRoca_magica() {
		return roca_magica;
	}
	public void setRoca_magica(int roca_magica) {
		this.roca_magica = roca_magica;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getSuerte() {
		return suerte;
	}
	public void setSuerte(int suerte) {
		this.suerte = suerte;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}


	public void cambiar_nombre(){
		sn = new Scanner(System.in);
		boolean salir = false;
		String opcion;
		String cambio;
		while(!salir){

		           System.out.println("¿Quiere cambiar de nombre?");
		           System.out.println("SI");
		           System.out.println("NO");

		           System.out.println("Escribe una de las opciones");
		           opcion = sn.nextLine();

		           switch(opcion){
		               case "si":
		            	   System.out.println("escriba nuevo nombre");
		            	   cambio = sn.nextLine();
		            	   setNombre(cambio);
		            	   System.out.println("<Bienvenido " + getNombre()+">");
		            	   salir=true;
		                   break;
		                case "no":
		                   System.out.println("<Bienvenido " + getNombre()+">");
		                   salir = true;
		                   break;
		                default:
		                   System.out.println("Solo si o no");


		           }
		}

	}

	public void clase() {
		sn2 = new Scanner(System.in);
		int opcion;
		String cambio;
		System.out.println("Elige tu Clase: ");
		System.out.println("                1.Guerrero");
		System.out.println("                2.Mago");
		System.out.println("                3.Asesino");
		System.out.println("                4.Arquero");
		System.out.println("                5.Sacerdote");
		opcion = sn2.nextInt();
		if(opcion == 1){
			cambio = "Guerrero";
			setClase(cambio);}
		else if(opcion == 2)
			{cambio = "Mago";
			setClase(cambio);}
		else if(opcion == 3)
			{cambio = "Asesino";
			setClase(cambio);}
		else if(opcion == 4)
			{cambio = "Arquero";
			setClase(cambio);}
		else
			{cambio = "Sacerdote";
			setClase(cambio);}

		}
	public void subir_nivel() {
		if(getExp() == getLevel()*40) {
			int cambio = getVidamx() + 5;
			setVidamx(cambio);
			int cambio2 = getVida() + 5;
			setVida(cambio2);
			int cambio3 = getDefensa() + 1;
			setDefensa(cambio3);
			int cambio4 = getFuerza() + 1;
			setFuerza(cambio4);
			int cambio5 = getInteligencia() + 1;
			setInteligencia(cambio5);
			int cambio6 = getSuerte() + 1;
			setSuerte(cambio6);


		}
	}


}
