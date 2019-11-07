package newProject.utils;

import java.util.Scanner;

public class ScannerUtils {
	
	/**
	 * Solicitar cadena de texto por consola
	 * 
	 * @param text Texto que se muestra para preguntar por consola
	 * @return
	 */
	public static String preguntarCadenaPorConsola(String text) {
		System.out.println(text);
		String entradaTeclado;
		Scanner entradaEscaner = new Scanner(System.in);
		entradaTeclado = entradaEscaner.nextLine();

		return entradaTeclado;
	}

	/**
	 * Solicitar número por consola
	 * 
	 * @param text     Texto que se muestra para preguntar por consola
	 * @param opciones En caso de ser distinto de null se itera sobre las opciones
	 *                 para mostrarlas por consola
	 * @return
	 */
	public static int preguntarNumeroPorConsola(String text, String[] opciones) {
		System.out.println(text);

		// En caso de recibir opciones se muestran por consola
		if (opciones != null && opciones.length > 0) {
			for (String opcion : opciones) {
				System.out.println(opcion);
			}
		}

		int entradaTeclado;
		Scanner entradaEscaner = new Scanner(System.in);
		entradaTeclado = entradaEscaner.nextInt();

		return entradaTeclado;
	}
	
	public static int preguntarNumeroPorConsola(String text) {
		return preguntarNumeroPorConsola(text, null);
	}

	/**
	 * Solicitar boolean por consola (introduciendo 0 - NO y 1 -SI)
	 * 
	 * @param text Texto que se muestra para preguntar por consola
	 * @return
	 */
	public static boolean preguntarBooleanPorConsola(String text) {
		String[] opciones = { "0 - NO", "1 - SI" };
		int entradaTeclado = preguntarNumeroPorConsola(text, opciones);

		if (entradaTeclado == 1) {
			return true;
		} else {
			return false;
		}
	}

}
