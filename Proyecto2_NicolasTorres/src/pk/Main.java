package pk;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j1 = new Jugador("Ark","nose",1,0,30,30,0,0,3,2,3,3);
		Mago M1 = new Mago(j1.getNombre(),"Mago",1,0,30,30,0,0,3,2,3,3);
		Guerrero G1 = new Guerrero(j1.getNombre(),"Guerrero",1,0,30,30,0,0,3,2,3,3);
		Asesino A1 = new Asesino(j1.getNombre(),"Asesino",1,0,30,30,0,0,10,2,5,3);
		Arquero Ar1 = new Arquero(j1.getNombre(),"Arquero",1,0,30,30,0,0,10,2,5,3);
		Sacerdote S1 =  new Sacerdote(j1.getNombre(),"Sacerdote",1,0,30,30,0,0,3,2,3,3);
		Amuleto Am1 = new Amuleto(1,3,1,2);
		Torres T1 = new Torres();
		Enemigo e1 = new Enemigo("Caballero",15,4,3,1,3,2);
		Arma a1 = new Arma("none", 3);
		Dagas D1 = new Dagas("Dagas", 4);
		Varita V1 = new Varita("Varita" ,3);
		Baston B1 = new Baston("Baston" , 3);
		Espada E1 = new Espada("Espada",3);
		Arco Ac1 = new Arco("Arco", 4);
		Armadura g1 = new Armadura(5,"cota de malla");
		Items i1 = new Items(5,5,5);		
		Anillo m1 = new Anillo(7);
		Combate c1 = new Combate();
		Sabio s1 = new Sabio();
		Dueña d1 = new Dueña();
		Los_3_jovenes L3 = new Los_3_jovenes();
		Yomii Y1 = new Yomii();
		Naomi N1 = new Naomi();
		System.out.println("============ Bienvenido ============");
		j1.cambiar_nombre();
		j1.clase();
		System.out.println("haz que tu clan de "+j1.getClase()+" se sienta orgulloso" );
		s1.chat(j1);
		d1.chat(j1);
		L3.chat(j1);
		Y1.chat(j1);
		N1.chat(j1);
		Y1.chat2(j1);
		N1.chat2(j1);
		T1.torre(Am1,c1, j1, e1, a1, m1, g1, i1, M1, G1, A1, Ar1, S1, V1, E1, D1, B1, Ac1);
		Y1.chat3(j1, i1);






		
	}

}
