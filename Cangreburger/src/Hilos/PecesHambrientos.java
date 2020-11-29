package Hilos;

import java.util.Random;

import Buffer.Cangreburger;

public class PecesHambrientos extends Thread {
	private Cangreburger burger;
	private int idNumero;
	
	public PecesHambrientos (Cangreburger burger, int id) {
		this.burger = burger;
		this.idNumero = id;
	}
	
	
	@Override
	public void run() {
		int contador = 0;
		while (true) {
			if (burger.getCantidad() == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			contador = burger.pillar();
			System.out.println("Cangreburgers comidas por " + idNumero + " cliente : " + contador);
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

	

}
