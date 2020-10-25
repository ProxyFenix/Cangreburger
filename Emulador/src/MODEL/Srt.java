package MODEL;

import java.util.ArrayList;

import ALGORITMO.AlgoritmoApropiativo;
import ALGORITMO.Proceso;

public class Srt extends AlgoritmoApropiativo {

	Proceso procesosEnCola;
	
	

	public Srt(ArrayList<Proceso> proceso) {
		super.procesos = proceso;
		cicloATM = 0;
		procesosEnCola = procesos.get(0);
	}


	/**
	 * En el SJF, consiste en ir metiendo el trabajo más corto segun vaya llegando, solo que hay que crear una cola
	 * me acabo de despertar y me duele ya la cabeza
	 */
	public void run() {	
		
		//Está vacía la lista? No? Y por qué paras? NO PARES
		while(!procesos.isEmpty()) {
			//Llega antes que el ciclo? Sep
			//Pues lo quitamos de en medio de la lista original
			if (procesosEnCola.getTiempoLlegada() <= cicloATM) {
				ejecutarTarea(procesosEnCola);
				procesos.remove(procesosEnCola);
				nextRun();
				
			}
			//La misma burrada de antes
			
		}
		double ipSum = listaCocientes.get(0) + listaCocientes.get(1) + listaCocientes.get(2)
		+ listaCocientes.get(3) + listaCocientes.get(4);
		double ipRen = ipSum/5;
		System.out.println("El rendimiento de este algoritmo es: " + ipRen);
		
	}
	/**
	 * Ahora que tenemos eso listo, ejecutamos segun el orden que queremos
	 */
	public void nextRun() {
		//Preparamos la otra lista de procesos
		if (!procesos.isEmpty()) {
			procesosEnCola = procesos.get(0);
		}
		for (int i = 1; i < procesos.size(); i++) {
			if (procesos.get(i).getTiempoLlegada() <= cicloATM) {
				
					procesosEnCola = procesos.get(i);
				
			}
		}
		
	}
	
}

	

