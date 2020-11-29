package Hilos;

import java.util.Random;

import Buffer.Cangreburger;
import SeccionCritica.CocinerosRabiosos;

public class PecesHambrientos extends Thread {
	private Cangreburger burger;
	private int idNumero;
	private CocinerosRabiosos cocinero;
	private boolean esperando;
	
	public PecesHambrientos (Cangreburger burger, int id) {
		this.burger = burger;
		this.idNumero = id;
	}
	
	
	@Override
	public void run() {
		int contador = 0;
		esperando = false;
		cocinero = new CocinerosRabiosos(burger, idNumero);
		while (true) {
			if ((burger.getCantidad() == 0) && (cocinero.getAmborguesa() == 0)) {
				try {
					Thread.sleep(rng());
					esperando = true;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			} else if ((burger.getCantidad() != 0) && (cocinero.getAmborguesa() == 0)) {
				contador = burger.pillar();
			} else if ((burger.getCantidad() == 0) && (cocinero.getAmborguesa() != 0)) {
				contador++;
			}

			System.out.println("Cangreburgers comidas por " + this.idNumero + " cliente : " + contador);
			try {
				Thread.sleep(rng());
				esperando = true;
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


	public Cangreburger getBurger() {
		return burger;
	}


	public void setBurger(Cangreburger burger) {
		this.burger = burger;
	}


	public int getIdNumero() {
		return idNumero;
	}


	public void setIdNumero(int id) {
		this.idNumero = id;
	}


	public boolean isEsperando() {
		return esperando;
	}


	public void setEsperando(boolean esperando) {
		this.esperando = esperando;
	}

	

}
