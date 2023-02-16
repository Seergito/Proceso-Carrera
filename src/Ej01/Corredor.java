package Ej01;

public class Corredor extends Thread {
	
	private String nombre;
	private int dorsal;
	private Pista pista;
	
	public Corredor(String nombre,int dorsal,Pista pista) {
		this.nombre=nombre;
		this.dorsal=dorsal;
		this.pista=pista;
	}
	
	public void run() {
		int t=pista.correr(nombre, dorsal);
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pista.meta(dorsal, t);
		
	}
	

}
