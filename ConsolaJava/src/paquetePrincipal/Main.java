package paquetePrincipal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.out.println("Bienvenidos al CMD del misterio" + "\n"
		+ "Por favor, introduce la opción que te interese usar:" + "\n");
		System.out.println(
				"1) Crear una carpeta dada una ruta y un nombre" + "\n" +
				"2) Crear un fichero dada una ruta y un nombre" + "\n" +
				"3) Listar interfaces disponibles" + "\n" +
				"4) Mostrar la IP del ordenador dado el nombre de la interfaz de red" + "\n" +
				"5) Mostrar la dirección MAC dado el nombre de la interfaz de red" + "\n" +
				"6) Comprobar conectividad con internet" + "\n" +
				"7) Salir" + "\n");
		
		int numero;
		// Definimos un scanner para leer la opción
		Scanner sc = new Scanner(System.in);
		// Introducimos la opción que queramos		
		numero = sc.nextInt();
		

		switch(numero) {
			case 1:
				crearCarpeta();
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;
			case 2:
				crearFichero();
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;
			case 3:
				listarInterfaces();
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;
			case 4:
				mostrarIPs();
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;
			case 5:
				mostrarMAC();
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;
			case 6:
				comprobarConexion();
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;
			case 7:
				System.out.println("Ha cerrado usted el programa");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Hasta luego, pase usted buen día/tarde/noche");
				System.exit(0);
				break;

		}
		
			
		
//		// Este es el código que usaremos para ver si andamios por Windows o por Unix/Linux
//		if (System.getProperty("os.name").startsWith("Windows")) {
//	        // Esto es si es Windows
//			
//			
//	    } else {
//	        // Esto para literalmente cualquier cosa, en nuestro caso, unix
//	    	
//	    } 

	}
	
	// Y aquí, los metodos
	
	private static void crearCarpeta() throws IOException, InterruptedException {
		if (System.getProperty("os.name").startsWith("Windows")) {
	        // Esto es si es Windows
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce la ruta donde quieras crear la carpeta, vaquero.");
			System.out.println("Acto seguido, escribe cómo quieres llamarla.");
			String ruta;
			String nombreCarpeta;
			do {
				ruta = sc.nextLine();
				nombreCarpeta = sc.nextLine();
			} while (!checkRuta(ruta));
			String comando = "cmd.exe /c cd " + ruta + " && mkdir " + nombreCarpeta;
			proceso(comando);

			
		
	    } else {
	        // Esto para literalmente cualquier cosa, en nuestro caso, unix
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Introduce la ruta donde quieras crear la carpeta, vaquero.");
			System.out.println("Acto seguido, escribe cómo quieres llamarla.");
			String ruta;
			String nombreCarpeta;
			do {
				ruta = sc.nextLine();
				nombreCarpeta = sc.nextLine();
			} while (!checkRuta(ruta));
			String comando = "bash " + "cd " + ruta + " || mkdir " + nombreCarpeta;
			proceso(comando);

	    } 
	}
	
	private static boolean checkRuta(String ruta) {
		return new File(ruta).exists();
	}

	private static void crearFichero() throws IOException, InterruptedException {
		if (System.getProperty("os.name").startsWith("Windows")) {
	        // Esto es si es Windows
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce la ruta donde quieras crear el archivo, vaquero.");
			System.out.println("Acto seguido, escribe cómo quieres llamarlo, junto con su extensión.");
			System.out.println("Ejemplo: " + "archivo.txt");
			String ruta;
			String nombreFichero;
			do {
				ruta = sc.nextLine();
				nombreFichero = sc.nextLine();
			} while (!checkRuta(ruta));
			String comando = "cmd.exe /c " + "cd " + ruta + " && type nul > " + nombreFichero;
			proceso(comando);


			
	    } else {
	        // Esto para literalmente cualquier cosa, en nuestro caso, unix
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Introduce la ruta donde quieras crear el archivo, vaquero.");
			System.out.println("Acto seguido, escribe cómo quieres llamarlo, junto con su extensión.");
			System.out.println("Ejemplo: " + "archivo.txt");
			String ruta;
			String nombreFichero;
			do {
				ruta = sc.nextLine();
				nombreFichero = sc.nextLine();
			} while (!checkRuta(ruta));
			String comando = "bash " + " cd " + ruta + " touch " + nombreFichero;
			proceso(comando);


	    } 
	}
	
	
	private static void listarInterfaces() throws IOException, InterruptedException {
		if (System.getProperty("os.name").startsWith("Windows")) {
	        // Esto es si es Windows
			String comando = "cmd.exe /c " + "ipconfig";
			proceso(comando);
	    } else {
	    	String comando = "bash -c" + "ip link show";
			proceso(comando);
	    } 
	}
	
	private static void mostrarIPs() {
		if (System.getProperty("os.name").startsWith("Windows")) {
	        // Esto es si es Windows
			
			
	    } else {
	        // Esto para literalmente cualquier cosa, en nuestro caso, unix
	    	
	    } 
	}
	
	private static void mostrarMAC() {
		if (System.getProperty("os.name").startsWith("Windows")) {
	        // Esto es si es Windows
			
			
	    } else {
	        // Esto para literalmente cualquier cosa, en nuestro caso, unix
	    	
	    } 
	}
	
	private static void comprobarConexion() {
		if (System.getProperty("os.name").startsWith("Windows")) {
	        // Esto es si es Windows
			
			
	    } else {
	        // Esto para literalmente cualquier cosa, en nuestro caso, unix
	    	
	    } 
	}
	
	private static void proceso(String comando) throws IOException, InterruptedException {
		
		ProcessBuilder processBuilder = new ProcessBuilder();
					//Nos preparamos para leer lo que metan en consola 
		// Creamos el creaProcesos, creé un proceso para crear procesos, curioso
					

			
					Process process = Runtime.getRuntime().exec(comando);
					StringBuilder buffer = new StringBuilder();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(process.getInputStream()));

					//Guardamos en un buffer la salida del proceso
					String line;
					while ((line = reader.readLine()) != null) {
						buffer.append(line + "\n");
					}

					if (process.waitFor() == 0) {
						System.out.println(buffer);
						System.out.println("Coño, ha funcionado. El comando ha sido: " + comando);
					} else {
						System.out.println("La liaste vaquero...");
					}
				
	}
}
