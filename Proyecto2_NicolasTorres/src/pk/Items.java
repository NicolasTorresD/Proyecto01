package pk;
import java.util.Scanner;

public class Items {
	private int bulbo_curativo;
	private int bulbo_milagroso;
	private int bulbo_mistico;
	private Scanner sn;
	public Items(int bulbo_curativo, int bulbo_milagroso, int bulbo_mistico) {
		super();
		this.bulbo_curativo = bulbo_curativo;
		this.bulbo_milagroso = bulbo_milagroso;
		this.bulbo_mistico = bulbo_mistico;
	}
	public int getBulbo_curativo() {
		return bulbo_curativo;
	}
	public void setBulbo_curativo(int bulbo_curativo) {
		if(bulbo_curativo >= 0) {
			this.bulbo_curativo = bulbo_curativo;}
	}
	public int getBulbo_milagroso() {
		return bulbo_milagroso;
	}
	public void setBulbo_milagroso(int bulbo_milagroso) {
		this.bulbo_milagroso = bulbo_milagroso;
	}
	public int getBulbo_mistico() {
		return bulbo_mistico;
	}
	public void setBulbo_mistico(int bulbo_mistico) {
		this.bulbo_mistico = bulbo_mistico;
	}

	public void mostrar_items() {
		System.out.println("1.bulbo curativo: " + getBulbo_curativo());
		System.out.println("2.bulbo milagroso: " + getBulbo_milagroso());
		System.out.println("3.bulbo mistico: " + getBulbo_mistico());
	}

	public void curacion(Jugador j1) {
		System.out.println("1.bulbo curativo: " + getBulbo_curativo());
		System.out.println("2.bulbo milagroso: " + getBulbo_milagroso());
		System.out.println("3.bulbo mistico: " + getBulbo_mistico());
		sn = new Scanner(System.in);
		int opcion;
		opcion = sn.nextInt();
		if(opcion == 1) {
			int cura = j1.getVida() + 20;
			j1.setVida(cura);
			int gasto = getBulbo_curativo() - 1;
			setBulbo_curativo(gasto);
			}
		else if(opcion == 2) {
			int cura2 = j1.getVida() + 70;
			j1.setVida(cura2);
			int gasto2 = getBulbo_milagroso() - 1;
			setBulbo_milagroso(gasto2);
			}
		else {
			int cura3 = j1.getVida() + 150;
			j1.setVida(cura3);
			int gasto3 = getBulbo_mistico() - 1;
			setBulbo_mistico(gasto3);

		}
	}

}
