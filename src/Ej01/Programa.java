package Ej01;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pista pista = new Pista();
			Corredor corredor1=new Corredor("MariLoli", 1, pista);
			Corredor corredor2=new Corredor("Juanjo", 2, pista);
			Corredor corredor3=new Corredor("PedroPicapiedra", 3, pista);
			Corredor corredor4=new Corredor("Oscar", 4, pista);
			Corredor corredor5=new Corredor("Kingkong", 5, pista);
			Corredor corredor6=new Corredor("Mimi", 6, pista);
			Corredor corredor7=new Corredor("Vicente", 7, pista);
			Corredor corredor8=new Corredor("Cenicienta", 8, pista);
			
			pista.pistoletazo();
			corredor1.start();
			corredor2.start();
			corredor3.start();
			corredor4.start();
			corredor5.start();
			corredor6.start();
			corredor7.start();
			corredor8.start();
			
	}

}
