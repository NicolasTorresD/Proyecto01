package pk;

import java.util.Scanner;


public class Sabio implements NPC{

	private int opcion;
	private int vida = 10;
	private Scanner sn;

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}




	@Override
	public void chat(Jugador j1) {
		System.out.println("Sabio:  ¡¡¡"+ j1.getNombre()+"!!!");
		System.out.println("Sabio:  ¿Que paso ayer con los telares de la fabrica?");
		sn = new Scanner(System.in);
		System.out.println("1.Excusa");
		System.out.println("2.La verdad");
		opcion = sn.nextInt();

		switch(opcion){
		     	case 1:
		     		System.out.println("ME:  Yo no fui, las gallinas se metieron en la fabrica y destrulleron los telares.");
		     		System.out.println("Sabio:  ¡Basta de excusas!");
		     		System.out.println("Sabio:  Ahora vas y le pides perdon a la dueña");
		     		System.out.println(j1.getNombre() + "se dirigio donde la dueña a pedir perdon");
		     		break;
		     	case 2:
		            System.out.println("ME:  Estaba jugando con las gallinas y en un momento se metieron en la fabrica y no las pude controlar.");
		            System.out.println("Sabio:  Esta bien, pero mas cuidado para la proxima");
		            System.out.println("Sabio:  ahora vas y le pides perdon a la dueña ");
		            System.out.println("====="+j1.getNombre() + " SE DIRIGIO RUMBO A LA FABRICA =====");
		            break;
		     	case 3:
		     		System.out.println(j1.getNombre() + " toma el cuchillo de la cocina y se lo entierra en la yugular");
		     		System.out.println("=======GAME OVER=======");
		     		break;
		     	default:
		     		System.out.println("solo 1 o 2");
		}
	}
}
