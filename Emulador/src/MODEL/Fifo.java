package MODEL;

import java.util.ArrayList;

import ALGORITMO.AlgoritmoNoApropiativo;
import ALGORITMO.Proceso;

public class Fifo extends AlgoritmoNoApropiativo {
	
	public Fifo (ArrayList<Proceso> procesos) {
		super.procesos = procesos;
		cicloATM = 0;
	}
	

	/**
	 * En el FIFO, nos dejamos de tonterias porque solo hay que meter un único coso que hacer, que viene a ser
	 * pasar al siguiente proceso conforme termine el anterior.
	 */
	public void run() {	
		for (int i = 0; i < procesos.size(); i++) {
			ejecutarTarea(procesos.get(i));	
		}
		//Aqui iria el calculo del Ip, si supiera como hacerlo (Viernes)
		//Aaaah, pero ahora ya se (Domingo)
		//Soy un poco bestia?
		//Si.
		double ipSum = listaCocientes.get(0) + listaCocientes.get(1) + listaCocientes.get(2)
		+ listaCocientes.get(3) + listaCocientes.get(4);
		double ipRen = ipSum/5;
		System.out.println("El rendimiento de este algoritmo es: " + ipRen);
		
	}
	
	
}
