package pk;

public class Dueña implements NPC {
	private int opcion;


	public void chat(Jugador j1) {

		System.out.println("ME: Hola Señora");
		System.out.println("Dueña:  Pero miren quien esta aqui");
		System.out.println("Dueña:  viniste a romper mas telares??");
		System.out.println("ME:  No vine a romper nada señora,vine a pedir perdon por lo de ayer");
		System.out.println("Dueña:  Bueno eso no me lo esperaba ");
		System.out.println("Dueña:  Pero que no vuelva a ocurrir, ¿esta bien " + j1.getNombre()+ "?" );
		System.out.println("===== "+j1.getNombre() +" VUELVE A LA CASA DEL SABIO =====" );
	}

}
