package SeccionCritica;

import java.util.Random;

import Buffer.Cangreburger;

public class CocinerosRabiosos extends Thread {
	private Cangreburger burgers;
	private int idNumero;
	
	public CocinerosRabiosos(Cangreburger burgers, int id) {
		this.burgers = burgers;
		this.idNumero = id;
	}


	public void run() {
		int contador = 0;
		while (true) {
			contador++;
			burgers.meter(contador);
			System.out.println("Cangreburgers servidas por " + idNumero + " cocinero : " + contador);
			try {
				Thread.sleep(rng());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	private int rng() {
		Random r = new Random();
		int high = 3000;
		int low = 1000;
		int result = r.nextInt(high-low)+low;
		return result;
	}


	public Cangreburger getBurgers() {
		return burgers;
	}


	public void setBurgers(Cangreburger burgers) {
		this.burgers = burgers;
	}


	public int getIdNumero() {
		return idNumero;
	}


	public void setIdNumero(int id) {
		this.idNumero = id;
	}



	
}
