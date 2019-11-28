package pk;

public class Torres {
	public void torre(Amuleto am1,Combate c1,Jugador j1,Enemigo e1 , Arma a1, Anillo m1, Armadura g1,Items i1,Mago M1,Guerrero G1,Asesino A1,Arquero Ar1,Sacerdote S1,Varita V1,Espada E1,Dagas D1,Baston B1,Arco Ac1) {
		System.out.println("Haz de demostrar tu valentia y superar esta torre para seguir con tu camino");
		System.out.println(j1.getNombre() + " entra a la torre");
		boolean salir = false;
		while(!salir) {
			c1.combate(j1, e1, a1, m1, g1, i1, M1, G1, A1, Ar1, S1, D1, B1, E1, V1, Ac1);
			if(j1.getVida() == 0) {
				System.out.println("Game Over");
				salir = true;
			}
			else {
			c1.combate(j1, e1, a1, m1, g1, i1, M1, G1, A1, Ar1, S1, D1, B1, E1, V1, Ac1);
			if(j1.getVida() == 0) {
				System.out.println("Game Over");
				salir = true;
				}
			else {
			e1.level_enemigo(2);
			c1.combate(j1, e1, a1, m1, g1, i1, M1, G1, A1, Ar1, S1, D1, B1, E1, V1, Ac1);
			if(j1.getVida() == 0) {
				System.out.println("Game Over");
				salir = true;
				}
			else {
			e1.level_enemigo(3);
			c1.combate(j1, e1, a1, m1, g1, i1, M1, G1, A1, Ar1, S1, D1, B1, E1, V1, Ac1);
			if(j1.getVida() == 0) {
				System.out.println("Game Over");
				salir = true;
				}
			else{
			e1.level_enemigo(4);
			c1.combate(j1, e1, a1, m1, g1, i1, M1, G1, A1, Ar1, S1, D1, B1, E1, V1, Ac1);
			if(j1.getVida() == 0) {
				System.out.println("Game Over");
				salir = true;
				}
			else {
			System.out.println("felicidades has ganado");
			System.out.println("haz recibido un amuleto");
			System.out.println(j1.getNombre() + " se coloca el amuleto");
			am1.colocar_amuleto(j1);
			salir = true;}
			}
			}

		}
			}
		}
	}

}
