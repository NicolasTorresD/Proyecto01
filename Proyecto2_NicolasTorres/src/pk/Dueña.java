package pk;

public class Due�a implements NPC {
	private int opcion;


	public void chat(Jugador j1) {

		System.out.println("ME: Hola Se�ora");
		System.out.println("Due�a:  Pero miren quien esta aqui");
		System.out.println("Due�a:  viniste a romper mas telares??");
		System.out.println("ME:  No vine a romper nada se�ora,vine a pedir perdon por lo de ayer");
		System.out.println("Due�a:  Bueno eso no me lo esperaba ");
		System.out.println("Due�a:  Pero que no vuelva a ocurrir, �esta bien " + j1.getNombre()+ "?" );
		System.out.println("===== "+j1.getNombre() +" VUELVE A LA CASA DEL SABIO =====" );
	}

}
