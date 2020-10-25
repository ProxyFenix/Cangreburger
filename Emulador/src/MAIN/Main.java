package MAIN;

import java.util.ArrayList;
import java.util.Scanner;

import ALGORITMO.Proceso;
import MODEL.Fifo;
import MODEL.Roundrobin;
import MODEL.Sjf;
import MODEL.Srt;

public class Main {
	
	private static Fifo FifoAlgor;
	private static Sjf SjfAlgor;
	private static Srt SrtAlgor;
	private static Roundrobin RRAlgor;
	private static Proceso proceso;

	public static void main(String[] args) {
		
		//Añadimos los procesos a la lista
		ArrayList<Proceso> proceso = new ArrayList<>();
		proceso.add(new Proceso('A',0,5));
        proceso.add(new Proceso('B',2,4));
        proceso.add(new Proceso('C',3,3));
        proceso.add(new Proceso('D',5,2));
        proceso.add(new Proceso('E',6,3));
        
        
        //Le pasamos un mensaje al usuario para que introduzca un quantum para el Red Robin digo Round Robin

//        escribirQuantum();
        
        //Instanciamos las clases previas a la ejecución
        FifoAlgor = new Fifo(proceso);
        SjfAlgor = new Sjf(proceso);
        SrtAlgor = new Srt(proceso);
//      RRAlgor = new Roundrobin(proceso, quantum);
        
        
        //Encendemos los algoritmos y rezamos lo que sepamos para que no haya aniquilación de materia
        //Ya de paso, metemos un switch y lo elegimos
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el proceso, 1 para FIFO, 2 para SJF, 3 para SRT y 4 para RR");
        System.out.println("(4 en construcción)");
        int eleccion = sc.nextInt();
        
        switch (eleccion) {
        	case 1:
        		FifoAlgor.run();
        		break;
        	case 2:
        		SjfAlgor.run();
        		break;
        	case 3:
                SrtAlgor.run();
        		break;
        	case 4:
        		System.out.println("En proceso de construcción");
//              RRAlgor.run();
        		break;       	
        }
       
	}
	
	/**
	 * Hacemos que el usuario introduzca de cuanto quiere el quantum
	 * @return
	 */
	private static int escribirQuantum() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce de cuanto quieres el quantum del Round Robin: ");
        int quantum = sc.nextInt();
        return quantum;
	}

}
