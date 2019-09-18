package pk;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("¿Como te llamas?:");
		 String nombre = in.nextLine();
		 System.out.println("<----------\n>"+nombre + " ¿Cual clase vas a elegir?:");
	     System.out.println("1-Guerrero");
	 	 System.out.println("2-Picaro");
	 	 System.out.println("3-Arquero");
		 int select = 0;
		 int oro = 0;
		 int ataque =0;
		 int vida=0;
		 int pocion=3;
		 if(select == 0) {
			String clase = in.nextLine();
		 	if(clase.equals("1")) {
		 		Jugador j1 = new Jugador(nombre,105,25); 
		 		select +=1;
		 		vida=105;
		 		ataque=25;
		 		oro += 10;
		 		System.out.println("Tus estadisticas son:\nSalud:105\nAtaque:25\noro=10");
		 	}
		 	else if(clase.equals("2")) {
		 		Jugador j1 = new Jugador(nombre,70,40);
		 		select +=1;
		 		vida=70;
		 		ataque=40;
		 		oro+= 25;
		 		System.out.println("Tus estadisticas son:\nSalud:70\nAtaque:45\noro=25");
		 	}
		 	else if(clase.equals("3")) {
		 		Jugador j1 = new Jugador(nombre,90,35);
		 		vida=90;
		 	    ataque=ataque +35;
		 		System.out.println("Tus estadisticas son:\nSalud:90\nAtaque:35\noro=20");
		 		select+=1;
		 		oro += 20;
		 	}
		 	else {
		 		System.out.println("<---------->\nSeleccione una clase valida ");
		 	}
		 }
		 
		 boolean jugadroVivo = true;
		 while(jugadroVivo==true) {
		 	System.out.println("Te encuentras actualmente en el pueblo,\n¿Hacia donde quieres ir?");
		 	System.out.println("1-Torre\n2-Tienda\n3-Ver estadisticas");
		 	String opcion = in.nextLine();
		 	System.out.println("<------------>");
		 	if(opcion.equals("1")) {
		 		int vidaActual=vida;
		 		int enemigosD=0;
		 		int enemigoVida=60;
		 		int enemigoAtaq=10;
		 		int oroBase=2;
		 		int ganancia=0;
		 		boolean enemigoVivo = true;
		 		while(enemigoVivo==true) {
		 			System.out.println("Te encuentras en una habitacion vacia\n¿Que es lo que quieres hacer?");
		 			System.out.println("1-Avanzar\n2-Regresar al pueblo");
		 			String accion = in.nextLine();
		 			if(accion.equals("1")) {
		 				System.out.println("Te encontraste a un enemigo\n<---------->");
		 				enemigoVida=enemigoVida+(10*enemigosD);
			 			enemigoAtaq=enemigoAtaq+(4*enemigosD);
		 				while(enemigoVida>0) {
		 					System.out.println("¿Que accion tomaras?(Vida actual:)"+vidaActual+"/"+vida);
		 					System.out.println("1-Atacar\n2-Posicion defensiva\n3-Usar pocion(Tienes:"+pocion+")");
		 					String accionComb =in.nextLine();
                            if(accionComb.equals("1")) {
                            	enemigoVida=enemigoVida-ataque;
                            	System.out.println("Golpeas al enemigo con tu arma y le inflinges "+ataque+" de daño");
                            	System.out.println("El enemigo contraataca y recibes "+enemigoAtaq+" de daño");
                            	vidaActual=vidaActual-enemigoAtaq;
                            }
                            else if(accionComb.equals("2")) {
                            	System.out.println("Te posicionas mejor para recibir menos daño");
                            	enemigoAtaq=enemigoAtaq-2;
                            	System.out.println("El enemigo intenta atacar y logra hacerte "+enemigoAtaq+" de daño");
                            	
                            }
                            else if(accionComb.equals("3")) {
                            	if(pocion>0) {
                            		System.out.println("Te tomas una pocion y recuperas 50 de vida");
                            		System.out.println("El enemigo ataca y te hace "+enemigoAtaq+" de daño");
                            		vidaActual=vidaActual+50;
                            	}
                            	else if(pocion==0) {
                            		System.out.println("No te quedan pociones");
                            		System.out.println("Pierdes tiempo buscando alguna pocion y te hacen mas daño\n-"+(enemigoAtaq*2)+"de vida");
                            		
                            	}
                            }
		 					}
		 				System.out.println("Venciste a tu enemigo:");
		 				enemigosD=enemigosD+1;
		 				ganancia=enemigosD+(oroBase*(enemigosD/5));
		 				oro=oro+ganancia;
		 				System.out.println("Ganaste "+ganancia+" de oro");
		 				
		 			}
		 			else if(accion.equals("2")) {
		 				enemigoVivo=false;
		 				continue;
		 			}
		 		}
		 		
		 		
		 		
		 	}
		 	else if(opcion.equals("2")) {
		 		System.out.println("¿Que quieres comprar?");
		 		System.out.println("Tu oro actual: "+oro+"\n1-Mejorar arma:15 de oro\n2-Mejorar resistencia:15 de oro\n3-Comprar pocion:5 de oro\n4-salir");
		 		String opcionTienda = in.nextLine();
		 		if (opcionTienda.equals("1")) {
		 			if(oro>=15) {
		 				oro=oro-15;
		 				ataque=ataque+5;
		 				System.out.println("Mejoraste tu arma y tu ataque aumento en 5");
		 				opcionTienda="0";
		 				oro=oro-15;
		 			}
		 			else if(oro<15) {
		 				System.out.println("No tienes oro suficiente");
		 				opcionTienda="0";
		 			}
		 		if(opcionTienda.equals("2")) {
		 			if(oro>=15) {
		 				oro=oro-15;
		 				vida=vida+10;
		 				System.out.println("Mejoraste tu armadura y tu vida aumento en 10");
		 				opcionTienda="0";
		 				oro=oro-15;
		 			}
		 			else if(oro<15) {
		 				System.out.println("No tienes oro suficiente");
		 				opcionTienda="0";
		 			
		 			}
		 		}
		 		if(opcionTienda.equals("3")) {
		 			if(oro>=5) {
		 				oro=oro-5;
		 				pocion=pocion+1;
		 				System.out.println("Compraste una pocion");
		 			}
		 			else if(oro<5) {
		 				System.out.println("No tienes oro suficiente");
		 				opcionTienda="0"; 
		 			}
		 		}
		 		else if(opcionTienda.equals("4")) {
		 			
		 		}
		 	}
		 	}	
		 	else if(opcion.equals("3")) {
		 		System.out.println("Tus estadisticas son:\nAtaque:"+ataque+"\nVida:"+vida+"\nOro:"+oro);
		 		
		 	}

	    
	}
}
}