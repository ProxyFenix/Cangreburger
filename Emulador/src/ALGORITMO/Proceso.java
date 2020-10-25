package ALGORITMO;

public class Proceso {
	
	private char PID;
	private int tiempoLlegada;
	private int tiempoFinal;
	private int tiempoRafaga;
	private int contador = 0;
	
	
	public Proceso(char PID, int tiempoLlegada, int tiempoRafaga) {
		this.PID = PID;
		this.tiempoLlegada = tiempoLlegada;
		this.tiempoRafaga = tiempoRafaga;
	}


	public char getPID() {
		return PID;
	}

	
	public void setPID(char pID) {
		PID = pID;
	}

	
	public int getTiempoLlegada() {
		return tiempoLlegada;
	}


	public void setTiempoLlegada(int tiempoLlegada) {
		this.tiempoLlegada = tiempoLlegada;
	}


	public int getTiempoFinal() {
		return tiempoFinal;
	}


	public void setTiempoFinal(int tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}


	public int getTiempoRafaga() {
		return tiempoRafaga;
	}


	public void setTiempoRafaga(int tiempoRafaga) {
		this.tiempoRafaga = tiempoRafaga;
	}


	public boolean finProceso() {
		return tiempoRafaga == contador;
	}
	
	public void ejecutando() {
		contador += 1;
	}
	
	public int tiempoRestante() {
		return tiempoRafaga - contador;
	}
	
	/**
	 * Metodo para calcular el indice de penalización
	 * @param cicloATM
	 * @return
	 */
	public double iP(int cicloATM) {
		//Segun la formula de los ejercicios, esto seria tal que el momento en el que termina, menos
		//cuando llega a la cola, partido lo que dura, ergo:
		int numerador = cicloATM - tiempoLlegada;
		int denominador = tiempoRafaga;
		double cociente = numerador/denominador;
		
		System.out.println("Índice de penalización del proceso " + PID + " = " + cociente + "\n");
		return cociente;
	}
	
	
}
