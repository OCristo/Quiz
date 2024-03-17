package quiz;

import java.util.ArrayList;

public class Pregunta {

	private String pregunta;
	private ArrayList<Respuesta> respuestas;
	private static ArrayList<Pregunta> preguntas = new ArrayList<>();
	
	/**
	 * Constructor de Pregunta
	 * @param El enunciado de la pregunta
	 * @param Una ArrayList con objetos de tipo respuesta
	 */
	public Pregunta(String pregunta, ArrayList<Respuesta> respuesta) {
		
		this.pregunta = pregunta;
		this.respuestas = respuesta;

	}
	/**
	 * Constructor vacio de Pregunta
	 */
	public Pregunta() {

	}
	/**
	 * Get para obtener el enunciado de la pregunta
	 * @return El enunciado de la pregunta
	 */
	public String getPregunta() {
		return pregunta;
	}
	/**
	 * Set para cambiar el enunciado de una pregunta
	 * @param Nuevo enunciado de la pregunta
	 */
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	/**
	 * Get para obtener la ArrayList de las respuestas de una pregunta
	 * @return ArrayList con las respuestas
	 */
	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}
	/**
	 * Get est�tico para obtener la lista con las preguntas del quiz
	 * @return ArrayList con preguntas
	 */
	public static ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}
	/**
	 * Un repertorio de preguntas iniciales para el juego
	 */
	public static void preguntasIniciales() {
		
		ArrayList<Respuesta> respuestas1 = new ArrayList<>();
		Pregunta Pregunta1 = new Pregunta("Quien es el mas guapo de daw",respuestas1);
		
		Respuesta respuesta1 = new Respuesta(1+"- "+"Carlos",false);
		Respuesta respuesta2 = new Respuesta(2+"- "+"Roberto",false);
		Respuesta respuesta3 = new Respuesta(3+"- "+"Pablo",false);
		Respuesta respuesta4 = new Respuesta(4+"- "+"Nathanael",true);
		
		respuestas1.add(respuesta1);
		respuestas1.add(respuesta2);
		respuestas1.add(respuesta3);
		respuestas1.add(respuesta4);
		preguntas.add(Pregunta1);
		
		////////////////////////////////
		
		ArrayList<Respuesta> respuestas2 = new ArrayList<>();
		Pregunta Pregunta2 = new Pregunta("Que pas� en la plaza de Tiananmen?",respuestas2);
		
		Respuesta respuesta5 = new Respuesta(1+"- "+"Una simple manifestacion de estudiantes chinos",false);
		Respuesta respuesta6 = new Respuesta(2+"- "+"Un asesinato en masa",false);
		Respuesta respuesta7 = new Respuesta(3+"- "+"Una manifestacion acabada en masacre masiva",false);
		Respuesta respuesta8 = new Respuesta(4+"- "+"Nada, es una invencion del capitalismo",true);
		
		respuestas2.add(respuesta5);
		respuestas2.add(respuesta6);
		respuestas2.add(respuesta7);
		respuestas2.add(respuesta8);
		preguntas.add(Pregunta2);
		
		ArrayList<Respuesta> respuestas3 = new ArrayList<>();
		Pregunta Pregunta3 = new Pregunta("Cuantas ruedas tiene el coche de Maria Angeles?",respuestas3);
		
		Respuesta respuesta9 = new Respuesta(1+"- "+"a, no s�",true);
		Respuesta respuesta10 = new Respuesta(2+"- "+"Todas, quien le haria algo malo?",false);
		Respuesta respuesta11 = new Respuesta(3+"- "+"Tiene todavia coche?",false);
		Respuesta respuesta12 = new Respuesta(4+"- "+"Si viene en moto, no tiene coche",false);
		
		respuestas3.add(respuesta9);
		respuestas3.add(respuesta10);
		respuestas3.add(respuesta11);
		respuestas3.add(respuesta12);
		preguntas.add(Pregunta3);
		
		ArrayList<Respuesta> respuestas4 = new ArrayList<>();
		Pregunta Pregunta4 = new Pregunta("Si desaparece un bolso en clase a quien se le mira antes?",respuestas4);
		
		Respuesta respuesta13 = new Respuesta(1+"- "+"Carlos",true);
		Respuesta respuesta14 = new Respuesta(2+"- "+"Pablo",false);
		Respuesta respuesta15 = new Respuesta(3+"- "+"Nathanael",false);
		Respuesta respuesta16 = new Respuesta(4+"- "+"Zhetian",false);
		
		respuestas4.add(respuesta13);
		respuestas4.add(respuesta14);
		respuestas4.add(respuesta15);
		respuestas4.add(respuesta16);
		preguntas.add(Pregunta4);
		
		ArrayList<Respuesta> respuestas5 = new ArrayList<>();
		Pregunta Pregunta5 = new Pregunta("De las siguientes personas quien est� siendo perseguido por el tribunal internacional de la haya"
				+ "\n por crimenes de guerra en yugoslavia",respuestas5);
		
		Respuesta respuesta17 = new Respuesta(1+"- "+"M.Rajoy",false);
		Respuesta respuesta18 = new Respuesta(2+"- "+"Javi",true);
		Respuesta respuesta19 = new Respuesta(3+"- "+"Milosevic",false);
		Respuesta respuesta20 = new Respuesta(4+"- "+"Carlos",false);
		
		respuestas5.add(respuesta17);
		respuestas5.add(respuesta18);
		respuestas5.add(respuesta19);
		respuestas5.add(respuesta20);
		preguntas.add(Pregunta5);
		
		ArrayList<Respuesta> respuestas6 = new ArrayList<>();
		Pregunta Pregunta6 = new Pregunta("Quien elijir� al pr�ximo presidente de los Estados Unidos de Am�rica",respuestas6);
		
		Respuesta respuesta21 = new Respuesta(1+"- "+"El pueblo estadounidense en eleciones democr�ticas",false);
		Respuesta respuesta22 = new Respuesta(2+"- "+"Reptilianos metamorfos",false);
		Respuesta respuesta23 = new Respuesta(3+"- "+"Jorge en un s�tano de la UCAM",true);
		Respuesta respuesta24 = new Respuesta(4+"- "+"Alien�genas que nos tienen de cobayas",false);
		Respuesta respuesta25 = new Respuesta(5+"- "+"Vivimos en una simulacion",false);
		
		respuestas6.add(respuesta21);
		respuestas6.add(respuesta22);
		respuestas6.add(respuesta23);
		respuestas6.add(respuesta24);
		respuestas6.add(respuesta25);
		preguntas.add(Pregunta6);
		
		ArrayList<Respuesta> respuestas7 = new ArrayList<>();
		Pregunta Pregunta7 = new Pregunta("A qu� se dedica Zhetian por las tardes",respuestas7);
		
		Respuesta respuesta26 = new Respuesta(1+"- "+"Jugar lol",false);
		Respuesta respuesta27 = new Respuesta(2+"- "+"Estudiar",false);
		Respuesta respuesta28 = new Respuesta(3+"- "+"Resfrexionar sobre metaf�sica de Kant",false);
		Respuesta respuesta29 = new Respuesta(4+"- "+"Trabajar en una f�brica de zara",false);
		Respuesta respuesta30 = new Respuesta(5+"- "+"Elaborar informes sobre todos nosotros para enviarselos al gobierno de China",true);
		
		respuestas7.add(respuesta26);
		respuestas7.add(respuesta27);
		respuestas7.add(respuesta28);
		respuestas7.add(respuesta29);
		respuestas7.add(respuesta30);
		preguntas.add(Pregunta7);
		
		ArrayList<Respuesta> respuestas8 = new ArrayList<>();
		Pregunta Pregunta8 = new Pregunta("Un alumno llega tarde, cual es la razon?",respuestas8);
		
		Respuesta respuesta31 = new Respuesta(1+"- "+"Se qued� dormido",false);
		Respuesta respuesta32 = new Respuesta(2+"- "+"No quiso llegar a tiempo",false);
		Respuesta respuesta33 = new Respuesta(3+"- "+"Ha habido un accidente en la A-30",false);
		Respuesta respuesta34 = new Respuesta(4+"- "+"Un tractorista en huelga lleva 19 dias en la puerta de su casa sin dejarle salir",true);
		
		respuestas8.add(respuesta31);
		respuestas8.add(respuesta32);
		respuestas8.add(respuesta33);
		respuestas8.add(respuesta34);
		preguntas.add(Pregunta8);
		
		ArrayList<Respuesta> respuestas9 = new ArrayList<>();
		Pregunta Pregunta9 = new Pregunta("Que es probable que pase si Pablo termina una clase sin su descansito",respuestas9);
		
		Respuesta respuesta35 = new Respuesta(1+"- "+"Nada",false);
		Respuesta respuesta36 = new Respuesta(2+"- "+"Que le coma el mono",true);
		Respuesta respuesta37 = new Respuesta(3+"- "+"Que cree una cura para el cancer",false);
		Respuesta respuesta38 = new Respuesta(4+"- "+"Que se consentre m�s y aprenda m�s",false);
		
		respuestas9.add(respuesta35);
		respuestas9.add(respuesta36);
		respuestas9.add(respuesta37);
		respuestas9.add(respuesta38);
		preguntas.add(Pregunta9);
		
		ArrayList<Respuesta> respuestas10 = new ArrayList<>();
		Pregunta Pregunta10 = new Pregunta("Como definirias a nuestro queridisimo Presidente de DAW",respuestas10);
		
		Respuesta respuesta39 = new Respuesta(1+"- "+"Una persona muy trabajadora",false);
		Respuesta respuesta40 = new Respuesta(2+"- "+"Siempre atento de las necesidades de la clase",false);
		Respuesta respuesta41 = new Respuesta(3+"- "+"Mocion de censura YA",true);
		
		respuestas10.add(respuesta39);
		respuestas10.add(respuesta40);
		respuestas10.add(respuesta41);
		preguntas.add(Pregunta10);
		
		ArrayList<Respuesta> respuestas11 = new ArrayList<>();
		Pregunta Pregunta11 = new Pregunta("Siempre que mires a Adrian en clase, este a qu� se va a estar dedicando con toda seguridad",respuestas11);
		
		Respuesta respuesta42 = new Respuesta(1+"- "+"Hacer mewing 24/7 como un animal",false);
		Respuesta respuesta43 = new Respuesta(2+"- "+"Estar jugando a pokemon nuzlocke en clase",false);
		Respuesta respuesta44 = new Respuesta(3+"- "+"Planear la proxima visita al kebab los amigos de Molina de Segura",true);
		Respuesta respuesta45 = new Respuesta(4+"- "+"Estar atento a Mariangeles",true);
		
		respuestas11.add(respuesta42);
		respuestas11.add(respuesta43);
		respuestas11.add(respuesta44);
		respuestas11.add(respuesta45);
		preguntas.add(Pregunta11);
		
	}
	/**
	 * Metodo utilizado para crear nuevas preguntas, tendras que introducir un enunciado de la pregunta
	 * y acto seguido crear un ArrayList con las posibles respuestas a la pregunta.
	 * A�adir� la pregunta a la ArrayList de preguntas
	 * @return Un objeto Pregunta
	 */
	public static Pregunta crearPregunta() {
		ArrayList<Respuesta> respuestas = new ArrayList<>();
		String enunciado = "";
		
		System.out.println("Cual ser� el enunciado de la nueva pregunta");
		enunciado = Metodos.leer();
		
		respuestas = Respuesta.crearRespuestas();
		Pregunta pregunta = new Pregunta(enunciado,respuestas);
		preguntas.add(pregunta);
		
		return pregunta;
	}
	
}
