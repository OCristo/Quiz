package quiz;

import java.util.ArrayList;
import java.util.Random;

public class Juego {

	private ArrayList<Jugador> jugadores;
	private ArrayList<Pregunta> preguntas;
	/**
	 * Constructor de juego
	 * @param ArrayList con jugadores que participaran en el juego
	 * @param ArrayList con las preguntas del juego
	 */
	public Juego(ArrayList<Jugador> jugadores, ArrayList<Pregunta> preguntas) {
		
		this.jugadores = jugadores;
		this.preguntas = preguntas;
	}
	/**
	 * Get para obtener los jugadores de un juego
	 * @return ArrayList con jugadores
	 */
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	/**
	 * Get para obtener las preguntas de un juego
	 * @return ArrayList con preguntas
	 */
	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}
	
	
	
	
	
}
