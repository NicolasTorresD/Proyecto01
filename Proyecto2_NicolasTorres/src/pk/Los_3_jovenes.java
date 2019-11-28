package pk;
import java.util.Scanner;

public class Los_3_jovenes {
	private Scanner sn;

	public void chat(Jugador j1) {
		sn = new Scanner(System.in);
		int opcion;
		int opcion2;
		System.out.println("Juan:  Hey " + j1.getNombre()+ " como estas?");
		System.out.println("Juan:  Estamos intentando abrir la puerta azul de el sabio");
		System.out.println("Juan:  ¿Nos ayudas?");
		System.out.println("1.SI  2.NO");
		opcion = sn.nextInt();
		if(opcion == 1) {
			System.out.println("Marcos:  Genial!!");
			System.out.println("=== LOS 3 JOVENES Y " + j1.getNombre() + "EMPUJAN LA PUERTA ===");
			System.out.println("=== DE REPENTE EMPIEZA A SALIR UN GRAN RESPLANDOR DE LA PUERTA ===");
			System.out.println("Marcos:  Sabes mejor ya nos vamos");
			System.out.println("=== LOS 3 JOVENES SALEN CORRIENDO DE LA CASA DEL SABIO ===");
			System.out.println("MIENTRAS QUE " + j1.getNombre() + " BAJA A LA SALA , LA CUAL ESTABA DETRAS DE LA PUERTA ");
		}
		else {
			System.out.println("Kevin:  Enserio, estas seguro?");
			System.out.println("1.Ayudar  2.No ayudar");
			opcion2 = sn.nextInt();
			if(opcion2 == 1){
				System.out.println("Marcos:  Genial!!");
				System.out.println("=== LOS 3 JOVENES Y " + j1.getNombre() + "EMPUJAN LA PUERTA ===");
				System.out.println("=== DE REPENTE EMPIEZA A SALIR UN GRAN RESPLANDOR DE LA PUERTA ===");
				System.out.println("Marcos:  Sabes mejor ya nos vamos");
				System.out.println("=== LOS 3 JOVENES SALEN DE LA CASA DEL SABIO ===");
				System.out.println("=== MIENTRAS QUE " + j1.getNombre() + " BAJA A LA SALA , LA CUAL ESTABA DETRAS DE LA PUERTA  ===");
			}
			else {
				System.out.println("=== "+j1.getNombre()+ "SE QUE MIRANDO, MIENTRAS LOS DEMAS ABREN LA PUERTA === ");
				System.out.println("=== DE REPENTE EMPIEZA A SALIR UN GRAN REAPLANDOR DE LA PUERTA ===");
				System.out.println("Juan:  oye sabes que mejor vamonos de aqui");
				System.out.println("=== LOS 3 JOVENES SALEN CORRIENDO DE LA CASA DEL SABIO ===");
				System.out.println(j1.getNombre() + " SE EMPIEZA A PREGUNTAR QUE HAY ALLI DEBAJO" );
				System.out.println("=== Y EMPIEZA A BAJAR A ESE LUGAR DETRAS DE LA PUERTA === ");
			}
		}

	}

}
