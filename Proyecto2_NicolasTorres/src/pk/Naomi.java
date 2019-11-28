package pk;
import java.util.Scanner;

public class Naomi {
	private Scanner sn;
	public void chat(Jugador j1) {
		System.out.println("Naomi:  Pero que esta pasando??");
		System.out.println("Naomi:  Afuera hace un frio atroz");
		System.out.println("=== DE REPENTE NAOMI SE EMPIEZA A CONGELAR");
		System.out.println("ME: Pero que esta pasando!?");
		System.out.println("ME: Naomi!!");
		System.out.println("Me:  Yomii que esta pasando");	
	}
	public void chat2(Jugador j1) {
		int opcion;
		sn = new Scanner(System.in);
		System.out.println("ME:  Aprovechando de que Naomi esta congelada ");
		System.out.println("ME:  Le deberia dar un beso a Naomi??");
		System.out.println("1.Si   2.No");
		opcion = sn.nextInt();
		if(opcion == 1) {
			System.out.println("=== " + j1.getNombre()+ " LE DA UN BESO A NAOMI ===");
			System.out.println("=== " + j1.getNombre()+ " SE DIRIGE A LA BUSQUEDA DE LAS 5 TORRES, ENCONTRANDO LA PRIMERA DE ELLAS ===");

		}
		else if(opcion == 2) {
			System.out.println("ME:  Mejor no , primero tengo que descongelar la");
		System.out.println("=== " + j1.getNombre()+ " SE DIRIGE A LA BUSQUEDA DE LAS 5 TORRES, ENCONTRANDO LA PRIMERA DE ELLAS ===");
		}
	}

}
