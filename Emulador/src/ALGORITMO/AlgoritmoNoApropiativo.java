package ALGORITMO;

import java.util.ArrayList;

import ALGORITMO.Proceso;

public abstract class AlgoritmoNoApropiativo {
	
	//Sos padre, debés heredar algo, digo yo
	protected ArrayList<Proceso> procesos;
	protected int cicloATM = 0;
	protected ArrayList<Double> listaCocientes = new ArrayList<>();
	
	
	
	public void ejecutarTarea(Proceso procesosClase) {
		//Cuanto dure el servicio, pues ejecuto tantas veces
		for (int i = 0; i < procesosClase.getTiempoRafaga();i++) {
			cicloATM++;
			procesosClase.ejecutando();
			if (procesosClase.finProceso()) {
				System.out.println("CICLO " + cicloATM + " - Proceso [id=" + procesosClase.getPID() + ", rafaga pendiente="
						+ procesosClase.tiempoRestante() + "] - Terminado");
				//Añadimos los ciclos para más tarde el indice
				double guardarCicloFinal = procesosClase.iP(cicloATM);
				listaCocientes.add(guardarCicloFinal);
				
			} else { 
				System.out.println("CICLO " + cicloATM + " - Proceso [id=" + procesosClase.getPID() + ", rafaga pendiente="
						+ procesosClase.tiempoRestante() + "]");
			}
			
			
		}
		
	}
}
