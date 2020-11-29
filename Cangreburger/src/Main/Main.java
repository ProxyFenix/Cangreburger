package Main;


import java.util.ArrayList;
import java.util.Scanner;

import Buffer.Cangreburger;
import Hilos.PecesHambrientos;
import SeccionCritica.CocinerosRabiosos;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cangreburger burger = new Cangreburger();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cuantos cocineros habrá en este turno: ");
		int numCocinero = sc.nextInt();
		System.out.println("Introduzca cuantos peces habrá en este turno: ");
		int numPeces = sc.nextInt();
		
		CocinerosRabiosos[] cocinero = new CocinerosRabiosos[numCocinero];
		PecesHambrientos[] pez = new PecesHambrientos[numPeces];
		
//		cocineros = new ArrayList<CocinerosRabiosos>();
//		peces = new ArrayList<PecesHambrientos>();
		
		for (int i = 0; i < cocinero.length;i++) {
			cocinero[i] = new CocinerosRabiosos(burger,i);
		}
		for (int i = 0; i < pez.length;i++) {
			pez[i] = new PecesHambrientos(burger,i);
			
		}
		
		for (CocinerosRabiosos cocineros : cocinero) {
			cocineros.start();
		}
		
		for (PecesHambrientos peces : pez) {
			peces.start();
		}
		
			

		
	}
	
}
