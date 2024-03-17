package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Respuesta {

	private String enunciado;
	private boolean esCorrecta;
	
	/**
	 * Constructor Respuesta
	 * @param el enunciado de la respuesta
	 * @param booleano si la respuesta es Correcta o no
	 */
	public Respuesta(String enunciado, boolean esCorrecta) {
		
		this.enunciado = enunciado;
		this.esCorrecta = esCorrecta;
	}
	/**
	 * Constructor Respuesta
	 * @param el enunciado de la respuesta
	 */
	public Respuesta(String enunciado) {
		
		this.enunciado = enunciado;
		this.esCorrecta = false;
	}

	/**
	 * Constructor de Respuesta vac�o
	 */
	public Respuesta() {
		
	}

	/**
	 * Get del enunciado de la respuesta
	 * @return enunciado de la respuesta
	 */
	public String getEnunciado() {
		return enunciado;
	}
	/**
	 * Set para establecer el enunciado de una respuesta
	 * @param el nueo enunciado de la respuesta
	 */
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	/**
	 * Get sobre si la respuesta es correcta o no
	 * @return booleano sobre si es correcta o no
	 */
	public boolean isEsCorrecta() {
		return esCorrecta;
	}
	/**
	 * Set si una respuesta es correcta o no
	 * @param Booleano sobre si la respuesta es correcta o no
	 */
	public void setEsCorrecta(boolean esCorrecta) {
		this.esCorrecta = esCorrecta;
	}

	/**
	 * Metodo utilizado para crear una ArrayList de objetos de tipo respuesta que ser�n introducidas dentro de un objeto pregunta
	 * Al crear las respuestas tendras que especificar cuantas posibles respuestas tendr� la ArrayList
	 * y al terminar de poner los enunciados de las respuestas tendr�s de especificar cual es la respuesta correcta
	 * @return ArrayList con respuestas a una pregunta
	 */
	public static ArrayList<Respuesta> crearRespuestas(){
		
		System.out.println("Cuantas respuestas va a tener tu pregunta (Son v�lidas entre 1 y 6 respuestas)");
		int numeroRespuestas = Metodos.contar(1,6);
		
		ArrayList<Respuesta> respuestas = new ArrayList<>();
		
		for(int i = 1; i<=numeroRespuestas; i++) {
			System.out.println("Escribe el enunciado de la "+ i + "� respuesta");
			String enunciado = Metodos.leer();
		
			/////////////////////
			Respuesta r = new Respuesta(i+"- "+enunciado);
			
			respuestas.add(r);
		}
		System.out.println("Estas son las respuestas que has introducido");
		for (Respuesta respuesta : respuestas) {
			System.out.println(respuesta.getEnunciado());
		}
		System.out.println("Cual es la respuesta correcta");
		String respuestaCorrecta = ""+Metodos.contar(0,numeroRespuestas);

		for (Respuesta respuesta : respuestas) {
			if(respuesta.getEnunciado().contains(respuestaCorrecta)) {
				respuesta.setEsCorrecta(true);
			}
		}
		
		return respuestas;
	}
	/**
	 * Un metodo de respuesta que te devuelve el numero de la respuesta
	 * @return numero de la respuesta
	 */
	public int codigoRespuesta() {
		
		char primerCharEnunciado = this.enunciado.charAt(0);
		int codigo = primerCharEnunciado- '0';
		
		return codigo;
	}
	
	
}
