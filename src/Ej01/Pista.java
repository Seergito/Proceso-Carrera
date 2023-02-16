package Ej01;

public class Pista {
	
	private boolean salida;
	private int tiempo;
	private double resultado;
	public Pista() {
		super();
		salida=false;
	}

	public synchronized void pistoletazo() {
		
		System.out.println("Preparados...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Listos...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("YA!");
		salida=true;
		notifyAll();
		
	}	
	public synchronized int correr(String nombre, int dorsal) {
		
		while(salida==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
		tiempo=(int)(9000+Math.random()*3000);
		return tiempo;
	}
	
	
	public synchronized void meta(int dorsal,int tiempo) {	
		resultado=(double)tiempo/1000;
		System.out.println(dorsal+" tarda "+resultado);				
	}

}
