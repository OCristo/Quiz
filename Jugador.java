package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
	Scanner sc = new Scanner(System.in);

	private String nombre;
	private int edad;
	private int puntuacion;
	private static ArrayList<Jugador> jugadores = new ArrayList<>();
	/**
	 * Constructor jugador vacio
	 */
	public Jugador() {

	}
	/**
	 * Constructor de jugador
	 * @param el nombre del jugador
	 * @param la edad del jugador
	 */
	public Jugador(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
		this.puntuacion = 0;
	}
	/**
	 * Get para obtener el nombre de un jugador
	 * @return el nombre del jugador
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Set para establecer un nuevo nombre a un jugador 
	 * @param nuevo nombre del jugador
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Get para obtener la edad de un jugador
	 * @return la edad del jugador
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Set para establecer una nueva edad para un jugador
	 * @param nueva edad del jugador
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Get para obtener la puntuacion de un jugador
	 * @return la puntuacion del jugador 
	 */
	public int getPuntuacion() {
		return puntuacion;
	}
	/**
	 * Set para establecer la puntuacion de un jugador
	 * @param la nueva puntuacion del jugador
	 */
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	/**
	 * Get est�tico para obtener la lista de jugadore
	 * @return ArrayList con jugadores
	 */
	public static ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	/**
	 * Jugadores por defecto
	 */
	public static void datosFicticios() {

		Jugador paco = new Jugador("paco", 15);
		Jugador manolo = new Jugador("manolo", 18);
		Jugador eldelmedio_de_los_chichos = new Jugador("El del medio de los chichos", 62);
		jugadores.add(paco);
		jugadores.add(manolo);
		jugadores.add(eldelmedio_de_los_chichos);
	}
	/**
	 * Metodo utilizado para crear un nuevo objeto de tipo jugador.
	 * Para ello pedir� su noombre y edad.
	 * A�adir� al nuevo objeto jugador dentro de la ArrayList jugadores
	 */
	public static void crearNuevoJugador() {

		System.out.println("Introduce el nombre del nuevo jugador");
		String nombre = Metodos.leer();
		System.out.println("Introduce su edad");
		int edad = Metodos.contar();

		Jugador newJugador = new Jugador(nombre, edad);
		jugadores.add(newJugador);

	}
	/**
	 * Metodo est�tico que se utiliza para mostrar una lista de los nombres de los jugadores actuales
	 * 
	 * @param mensaje que se mostrar� de encabezado junto a la lista
	 */
	public static void mostrarJugadores(String mensaje) {
		
		System.out.println(mensaje);
		for (Jugador jugador : Jugador.getJugadores()) {
			System.out.println(jugador.getNombre());
		}
	}
	/**
	 * Metodo utilizado para eliminar un jugador
	 * Primero muestra una lista con los jugadores actuales
	 * y despues pedir� que introduzcas el nombre del jugador que quieres eliminar
	 */
	public static void eliminarJugador() {
		Jugador jugadoreliminar = new Jugador();
		String eliminar = "";
		
		mostrarJugadores("Estos son los jugadores actuales: ");

		System.out.println("Que jugador quieres eliminar, introduce su nombre");
		eliminar = Metodos.leer();

		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equalsIgnoreCase(eliminar)) {
				jugadoreliminar = jugador;
			}
		}
		jugadores.remove(jugadoreliminar);
	}
	/**
	 * Metodo que mostrar� una lista de los jugadores con sus puntuaciones
	 */
	public static void mostrarPuntuaciones() {
		System.out.println("Puntuaciones");
		for (Jugador jugador : jugadores) {
			System.out.println("El jugador "+jugador.getNombre()+" tiene: "+jugador.getPuntuacion()+" Puntos");
		}
		
	}
	/**
	 * Metodo llamado por un jugador para iniciar una partida
	 */
	public void jugar() {
		ArrayList<Integer> numeroYaSalido = new ArrayList<Integer>();
		Respuesta respuestaCorrecta = new Respuesta();
		int numeroRandom = 0;
		boolean repetido = false;
		
		Juego juego = new Juego(Jugador.getJugadores(), Pregunta.getPreguntas());

		
		System.out.println("De cuantas preguntas quieres hacer la partida? El maximo de preguntas actual es: "+ juego.getPreguntas().size());
		int preguntas = Metodos.contar(1,juego.getPreguntas().size());
		for (int i = 0; i < preguntas; i++) {
			do {
			numeroRandom = Metodos.numeroRandom(juego.getPreguntas().size());
			repetido = false;
			/*
			 * Foreach que comprueba que el numero aleatorio
			 * utilizado para sacar la pregunta no se repita
			 */
			for (Integer numero : numeroYaSalido) {

				if (numeroRandom == numero) {
					repetido = true;
				}
			}
			}while(repetido);

			Pregunta pregunta = juego.getPreguntas().get(numeroRandom);

			System.out.println("\n" + pregunta.getPregunta());

			numeroYaSalido.add(numeroRandom);

			System.out.println("Posibles respuestas: ");
			for (Respuesta respuesta : pregunta.getRespuestas()) {

				System.out.println(respuesta.getEnunciado());
				if (respuesta.isEsCorrecta()) {
					respuestaCorrecta = respuesta;
				}
			}

			System.out.println("\n Cual es tu respuesta: ");
			int respuesta = Metodos.contar();

			if (respuesta == respuestaCorrecta.codigoRespuesta()) {
				this.puntuacion += 10;
				System.out.println("Felicidades, acertastes");
			} else {
				this.puntuacion -= 5;
				System.out.println("Error");
			}

		}

	}

}
