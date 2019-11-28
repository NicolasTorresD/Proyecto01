package pk;
import java.util.Scanner;

public class Yomii implements NPC {
	private Scanner sn;

	public void chat(Jugador j1) {
		System.out.println("Yomii:  Hey tu!!");
		System.out.println("Yomii:  Ven, acercate lenta mente y abre la caja ");
		System.out.println("=== " + j1.getNombre() + " abre la caja y de alli sale Yomii ===");
		System.out.println("Yomii:  Soy libre!!");
		System.out.println("Yomii:  Gracias por liberar me");
	}
	public void chat2(Jugador j1) {
		System.out.println("Yomii:  Pues no solo me liberas te a mi ");
		System.out.println("Yomii:  Tambien liberaste esta maldicion");
		System.out.println("ME:  Y como termino la maldicion?");
		System.out.println("Yomii:  Pues tienes que completar las 5 torres que se encuantran en el extrerior");

	}

	public void chat3(Jugador j1,Items i1) {
		boolean salir = false;
		int opcion;
		System.out.println("Yomii:  Bueno esa fue la primera torre");
		System.out.println("Yomii:  que quieres hacer ahora");
		while(!salir) {
			sn = new Scanner(System.in);
			System.out.println("1.Ver estadisticas   2. Curarte");
			System.out.println("3.Despertar   4." + "Vida: " +j1.getVida());
			opcion = sn.nextInt();
			if(opcion == 1) {
				System.out.println("Vida: "+ j1.getVida());
				System.out.println("Fuerza: "+ j1.getFuerza());
				System.out.println("Defensa: " + j1.getDefensa());
				System.out.println("Inteligencia: "+ j1.getInteligencia());
				System.out.println("Suerte: "+ j1.getSuerte());
				System.out.println("Level: " + j1.getLevel());
				System.out.println("Exp: " + j1.getExp());
				System.out.println("Dinero: " + j1.getDinero());
			}
			else if(opcion == 2) {
				i1.curacion(j1);	
			}
			else if( opcion == 3) {
				System.out.println("ME: Ufff");
				System.out.println("ME: Que sueño tan raro");
				System.out.println("=== GRACIAS POR JUGAR ===");
				salir = true;
				}

		}
	}

}
