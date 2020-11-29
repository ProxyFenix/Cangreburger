package SeccionCritica;

import java.util.Random;

import Buffer.Cangreburger;
import Hilos.PecesHambrientos;

public class CocinerosRabiosos extends Thread {
	private Cangreburger burgers;
	private int idNumero;
	private PecesHambrientos pez;
	private int amborguesa;
	
	public CocinerosRabiosos(Cangreburger burgers, int id) {
		this.burgers = burgers;
		this.idNumero = id;

	}


	public void run() {
		pez = new PecesHambrientos(burgers, idNumero);
		int contador = 0;
		int amborguesa = 1;
		while (true) {
			contador++;
			//Está el pez esperando?
			if (pez.isEsperando() == false) {
				burgers.meter(contador);
			}
			System.out.println("Cangreburgers servidas por " + this.idNumero + " cocinero : " + contador);
			System.out.println("Cangreburgers a la espera: " + burgers.getCantidad());
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


	public PecesHambrientos getPez() {
		return pez;
	}


	public void setPez(PecesHambrientos pez) {
		this.pez = pez;
	}


	public int getAmborguesa() {
		return amborguesa;
	}


	public void setAmborguesa(int amborguesa) {
		this.amborguesa = amborguesa;
	}

	

	
}
