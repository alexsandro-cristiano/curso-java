package mundopc;

import com.gm.mundopc.*;

public class MundoPC {

	public static void main(String[] args) {

		Monitor monitorHP = new Monitor("ching", 20D);
		Teclado teclado = new Teclado("com fio", "ching");
		Raton raton = new Raton("com fio", "piratones");
		
		Computadora comp = new Computadora("HP", monitorHP, teclado, raton);
		
		Orden orden1 = new Orden();
		
		orden1.agregarComputadora(comp);
		
		
		
		orden1.mostrarOrden();
		
		
	}

}
