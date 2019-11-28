package pk;
import java.util.Scanner;

public class Combate {
	private int numero_enemigo;
	private Scanner sn;



	public int getNumero_enemigo() {
		return numero_enemigo;
	}
	public void setNumero_enemigo(int numero_enemigo) {
		this.numero_enemigo = numero_enemigo;
	}



	public void combate(Jugador j1,Enemigo e1 , Arma a1, Anillo m1, Armadura g1,Items i1,Mago M1,Guerrero G1,Asesino A1,Arquero Ar1,Sacerdote S1,Dagas D1,Baston B1,Espada E1,Varita V1,Arco Ac1) {
		sn = new Scanner(System.in);
		boolean salir = false;
		int opcion1;
		int opcion2;
		while(!salir){
		           if(j1.getClase() == "Mago") {
		        	   a1 = D1;
		           }
		           else if(j1.getClase() == "Guerrero"){
		        	   a1 = B1;
		           }
		           else if(j1.getClase()== "Asesino") {
		        	   a1 = E1;
		           }
		           else if(j1.getClase()== "Arquero") {
		        	   a1 = Ac1;	   
		           }
		           else
		           		a1 = V1;
		           System.out.println("1.Ataque    3.Item");
		           System.out.println("2.Bloqueo    "   + j1.getNombre()+ " HP: " + j1.getVida());
		           System.out.println("Vida enemigo: "+e1.getVida());
		           opcion1 = sn.nextInt();

		           switch(opcion1){
		               case 1:
		            	   System.out.println("1.ataque   		  2.ataque en area");
		            	   System.out.println("3.ataque cargado   4.ataque elemental");
		            	   opcion2 = sn.nextInt();

		            	   		if(opcion2 == 1)
		            	   			{int resto= e1.getVida() - a1.ataque(j1) ;
		            	   			e1.setVida(resto);
		 		            	    int golpe = j1.getVida() - e1.getAtaque();
				            	    j1.setVida(golpe);}
		            	   		else if(opcion2 == 2)
		            	   			{int resto2 = e1.getVida() - a1.ataque_area(j1);
		            	   			e1.setVida(resto2);
		            	   			int golpe2 = j1.getVida() - e1.getAtaque();
		 		            	    j1.setVida(golpe2);}
		            	   		else if(opcion2 == 3)
		            	   			{int resto3 = e1.getVida() - a1.ataque_cargado(j1);
		            	   			e1.setVida(resto3);
		            	   			int golpe3 = j1.getVida() - e1.getAtaque();
		 		            	    j1.setVida(golpe3);}
		            	   		else
		            	   			{int resto4 = e1.getVida() - m1.ataque_magico(j1);
		            	   			e1.setVida(resto4);
		            	   			int golpe4 = j1.getVida() - e1.getAtaque();
		            	   			j1.setVida(golpe4);
		            	   			break;}
		            	   if(e1.getVida() <= 0) {
		            		    System.out.println("mounstro destruido");
		            		    e1.EntregarDrop(j1);
		            		    System.out.println(j1.getExp());
		            		    System.out.println(j1.getExp());
		            		    e1.setVida(15);
       	   						salir = true;
       	   						break;}
       	   					else if(j1.getVida()<=0){ 
       	   						System.out.println("Mounstro: Intentalo otro dia");
       	   						System.out.println("Game Over");
       	   						salir = true;
       	   						break;}
       	   						break;

		               case 2:
		            	   int golpe2 = g1.bloqueo(j1) - e1.getAtaque();
		            	   int cambio = j1.getVida() - golpe2;
		            	   j1.setVida(cambio);
		            	   break;
		               case 3:
		            	   i1.curacion(j1);}
		}
	}

}
