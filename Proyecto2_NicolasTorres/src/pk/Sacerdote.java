package pk;

public class Sacerdote extends Jugador {
	public Sacerdote(String nombre, String clase, int level, int exp, int vida, int vidamx, int dinero, int roca_magica,
			int fuerza, int defensa, int suerte, int inteligencia) {
		super(nombre, clase, level, exp, vida, vidamx, dinero, roca_magica, fuerza, defensa, suerte, inteligencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void subir_nivel() {
		// TODO Auto-generated method stub
		super.subir_nivel();
		if(getExp() == getLevel()*40) {
			int cambio = getVidamx() + 5;
			setVidamx(cambio);
			int cambio2 = getVida() + 5;
			setVida(cambio2);
			int cambio3 = getDefensa() + 2;
			setDefensa(cambio3);
			int cambio4 = getFuerza() + 1;
			setFuerza(cambio4);
			int cambio5 = getInteligencia() + 2;
			setInteligencia(cambio5);
			int cambio6 = getSuerte() + 1;
			setSuerte(cambio6);
		}
	}
	

}
