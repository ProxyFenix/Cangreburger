package Main;


import java.util.ArrayList;
import java.util.Scanner;

import Buffer.Cangreburger;
import Hilos.PecesHambrientos;
import SeccionCritica.CocinerosRabiosos;

public class Main {
	
	private static CocinerosRabiosos cocinero;
	private static PecesHambrientos pez;
	private static Cangreburger burger;
	
//	private static ArrayList<CocinerosRabiosos> cocineros;
//	private static ArrayList<PecesHambrientos> peces;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		burger = new Cangreburger();
		cocinero = new CocinerosRabiosos(burger,1);
		pez = new PecesHambrientos(burger,1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cuantos cocineros habrá en este turno: ");
		int numCocinero = sc.nextInt();
		System.out.println("Introduzca cuantos cocineros habrá en este turno: ");
		int numPeces = sc.nextInt();
		
//		cocineros = new ArrayList<CocinerosRabiosos>();
//		peces = new ArrayList<PecesHambrientos>();
		
		for (int i = 0; i <= numCocinero;i++) {
			cocinero = new CocinerosRabiosos(burger,i);
			cocinero.start();
		}
		for (int i = 0; i <= numPeces;i++) {
			pez = new PecesHambrientos(burger,i);
			pez.start();
		}
		
			

		
	}
	
}
