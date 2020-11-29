package Buffer;

public class Cangreburger {
	private int cantidad = 0;
	private boolean cocinada = false;
	
	
	public Cangreburger() {}
	
	public synchronized int pillar() {
		while(cocinada == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		cocinada = false;
		notifyAll();
		return cantidad--;
	}
	
	public synchronized void meter(int valor) {
		while(cocinada == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		cantidad = valor; 
		cocinada = true;
		notifyAll();
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isCocinada() {
		return cocinada;
	}
	public void setCocinada(boolean cocinada) {
		this.cocinada = cocinada;
	}
	
	
}
