package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

	/**
	 * Un metodo para pedir un n�mero por teclado y con control de errores inluido
	 * 
	 * @return un numero
	 */
	public static int contar() {
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		try {
			numero = sc.nextInt();
		} catch (InputMismatchException ex) {
			System.err.println("Error, introduzca un n�mero");
			sc.next();
		}
		
		return numero;
	}

	/**
	 * Metodo contar pero con un control para establecer un n�mero m�ximo
	 * 
	 * @param debes introducir el limite maximo que aceptas como numero (numero limite se
	 *              admitir� como numero v�lido)
	 * @return numero por debajo del limite establecido
	 */
	public static int contar(int limite) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		boolean numeroValido = true;

		do {
			numeroValido = true;
			try {
				numero = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Error, introduzca un n�mero");
				sc.next();
			}
			if (numero > limite) {
				numeroValido = false;
				System.out.println("El numero introducido es demasiado grande, el limite es: " + limite);
			}
		} while (!numeroValido);
		
		return numero;
	}
	/**
	 * Metodo contar pero con un control para establecer un n�mero m�nimo y un n�mero m�ximo
	 * los numeros limites se admitiran como v�lidos
	 * @param establece el limiteInferior
	 * @param establece el limiteSuperior
	 * @return numero entre los limites establecidos
	 */
	public static int contar(int limiteInferior, int limiteSuperior) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		boolean numeroValido = true;

		do {
			numeroValido = true;
			try {
				numero = sc.nextInt();
			} catch (InputMismatchException ex) {
				System.err.println("Error, introduzca un n�mero");
				sc.next();
			}
			if (numero < limiteInferior || numero > limiteSuperior) {
				numeroValido = false;
				System.out.println("El numero introducido no es valido, atento a los limites que son:\n"
						+ "Limite minimo: " + limiteInferior + "\n" + "Limite m�ximo: " + limiteSuperior);
			}
		} while (!numeroValido);
		
		return numero;
	}

	/**
	 * Un metodo para pedir un texto por teclado y con control de errores inluido
	 * 
	 * @return Texto introducido por el usuario
	 */
	public static String leer() {
		Scanner sc = new Scanner(System.in);
		String leer = "";
		try {
			leer = sc.nextLine();
			leer.trim();
		} catch (InputMismatchException ex) {
			System.err.println("Error, introduzca un n�mero");
			sc.next();
		}
		
		return leer;
	}

	/**
	 * Generador de numeros random
	 * @param limite maximo al que quieres que llegue la generacion de numeros (si
	 *               pones 10 por ejemplo te generar� del 1 al 10)
	 * @return devuelve el numero aleatorio generado
	 */
	public static int numeroRandom(int limite) {

		int valor = (int) Math.floor(Math.random() * limite);

		return valor;

	}

}
