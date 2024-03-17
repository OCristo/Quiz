package quiz;

import java.util.Scanner;

public class Quiz {

	/*
	 * Crear un proyecto �Quiz� que sea una aplicaci�n que implemente un juego con
	 * preguntas cortas.
	 * 
	 * Crear la clase Jugador con los atributos nombre, edad, puntuaci�n.
	 * 
	 * Crear la clase Pregunta con los atributos necesarios para almacenar la
	 * pregunta, 3 opciones de respuesta y la soluci�n a la pregunta (respuesta
	 * correcta).
	 * 
	 * Crear la clase Juego con los atributos jugadores (que ser� un array de
	 * objetos Jugador) y preguntas (ser� un array de objetos Pregunta).
	 * 
	 * Tendr�is que crear un objeto de tipo Juego con datos ficticios que tenga
	 * m�nimo 3 jugadores y 10 preguntas.
	 * 
	 * Crear un m�todo �jugar()� que ser� invocado por un jugador y que de manera
	 * aleatoria har� 3 de las preguntas que tiene el juego. Por cada respuesta
	 * correcta se sumar� 10 a la puntuaci�n y si hay un fallo se le restar� 5 a la
	 * puntuaci�n.
	 * 
	 * Crear un men� que te permita a�adir nuevos jugadores, eliminar jugadores,
	 * jugar, mostrar puntuaciones, a�adir nuevas preguntas al juego.
	 ** 
	 * A las clases se le pueden a�adir m�s atributos si se ve necesario. Crear los
	 * m�todos que consider�is necesarios para estructurar vuestro c�digo. Debe
	 * haber control de errores.
	 ** 
	 * Obligatorio entregar un documento pdf con el manual de usuario y
	 * especificaci�n t�cnica del c�digo.
	 ** 
	 * Obligatorio entrevista de pr�cticas.
	 */
	
	public static void main(String[] args) {

		final String MENU = "Que quieres hacer\nPulsa 1 para a�adir nuevos jugadores"
				+ "\nPulsa 2 para eliminar jugadores"
				+ "\nPulsa 3 para jugar"
				+ "\nPulsa 4 para mostrar puntuaciones"
				+ "\nPulsa 5 para a�adir nuevas preguntas al juego"
				+ "\nPulsa 6 para salir";
		Pregunta.preguntasIniciales();
		Jugador.datosFicticios();
		int opcion=0;
		do {
		System.out.println(MENU);
		opcion=Metodos.contar(1,6);
		
		switch(opcion) {
		
		case 1:
			Jugador.crearNuevoJugador();
			break;
		case 2:
			Jugador.eliminarJugador();
			break;
		case 3:
			Jugador.mostrarJugadores("Estos son los jugadores disponibles actualmente");
			System.out.println("Con que jugador quieres iniciar una partida");
			String jugadorSelec = Metodos.leer();
			for (Jugador jugador : Jugador.getJugadores()) {
				if(jugador.getNombre().equalsIgnoreCase(jugadorSelec)) {
					jugador.jugar();
				}
			}
			break;
		case 4:
			Jugador.mostrarPuntuaciones();
			break;
		case 5:
			Pregunta.crearPregunta();
			break;
		case 6:
			System.out.println("FIN");
			break;
		
		}
	}while(opcion != 6);

	}

}
