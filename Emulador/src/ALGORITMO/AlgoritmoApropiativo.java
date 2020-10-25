package ALGORITMO;

import java.util.ArrayList;

import ALGORITMO.Proceso;

public abstract class AlgoritmoApropiativo {

	//Sos padre, debés heredar algo, digo yo
	protected ArrayList<Proceso> procesos;
	protected int cicloATM = 0;
	protected ArrayList<Double> listaCocientes = new ArrayList<>();
	
	
	public void ejecutarTarea(Proceso procesos) {
		//Cuanto dure el servicio, pues ejecuto tantas veces
		for (int i = 0; i < procesos.getTiempoRafaga();i++) {
			cicloATM++;
			procesos.ejecutando();
			if (procesos.finProceso()) {
				System.out.println("CICLO " + cicloATM + " - Proceso [id=" + procesos.getPID() + ", rafaga pendiente="
						+ procesos.tiempoRestante() + "] - Terminado");
				//Añadimos los ciclos para más tarde el indice
				double guardarCicloFinal = procesos.iP(cicloATM);
				listaCocientes.add(guardarCicloFinal);
			} else { 
				System.out.println("CICLO " + cicloATM + " - Proceso [id=" + procesos.getPID() + ", rafaga pendiente="
						+ procesos.tiempoRestante() + "]");
			}
			
		}
		
	}
}
