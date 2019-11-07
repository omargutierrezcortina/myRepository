package newProject.main;

import java.util.ArrayList;
import java.util.List;

import newProject.jerarquia.AplicacionIOT;
import newProject.jerarquia.AplicacionMovil;
import newProject.jerarquia.AplicacionWeb;
import newProject.service.AplicacionIOTServiceImpl;
import newProject.service.AplicacionMovilServiceImpl;
import newProject.service.AplicacionWebServiceImpl;
import newProject.utils.ScannerUtils;

public class LeerAplicacionArrayList {

	/**
	 * Metodo main (ejecutable)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Empezamos el programa");

		/* Preguntamos al usuario el tipo de aplicaci�n */

		String[] opciones = { "1 - Aplicaci�n Web", "2 - Aplicaci�n M�vil", "3 - Aplicaci�n IOT" };
		int tipoAplicacion = ScannerUtils.preguntarNumeroPorConsola("�Qu� tipo de aplicaci�n quieres crear?", opciones);

		switch (tipoAplicacion) {
		case 1:
			/* En caso de que sea 1 - Aplicaci�n Web */
			System.out.println("  Introduzca los siguientes datos para crear varias Aplicaci�n Web");

			AplicacionWebServiceImpl aplicacionWebService = new AplicacionWebServiceImpl();	
			List<AplicacionWeb> aplicacionesWeb = new ArrayList<AplicacionWeb>();

			aplicacionesWeb.add(aplicacionWebService.crearAplicacionWeb());
			aplicacionesWeb.add(aplicacionWebService.crearAplicacionWeb());

			// Para imprimir la informaci�n de las aplicaciones web
			for (int i = 0; i < aplicacionesWeb.size(); i++) {
				System.out.println("  AppWeb " + (i + 1) + ": " + aplicacionesWeb.get(i));
			}
			break;
		case 2:
			/* En caso de que sea 2 - Aplicaci�n M�vil */
			System.out.println("  Introduzca los siguientes datos para crear varias Aplicaci�n M�vil");

			AplicacionMovilServiceImpl aplicacionMovilService = new AplicacionMovilServiceImpl();	
			List<AplicacionMovil> aplicacionesMovil = new ArrayList<AplicacionMovil>();

			aplicacionesMovil.add(aplicacionMovilService.crearAplicacionMovil());
			aplicacionesMovil.add(aplicacionMovilService.crearAplicacionMovil());

			// Para imprimir la informaci�n de las aplicaciones m�vil
			for (int i = 0; i < aplicacionesMovil.size(); i++) {
				System.out.println("  AppMovil " + (i + 1) + ": " + aplicacionesMovil.get(i));
			}
			break;
		case 3:
			/* En caso de que sea 3 - Aplicaci�n IOT */
			System.out.println("  Introduzca los siguientes datos para crear varias Aplicaci�n IOT");

			AplicacionIOTServiceImpl aplicacionIOTService = new AplicacionIOTServiceImpl();
			List<AplicacionIOT> aplicacionesIOT = new ArrayList<AplicacionIOT>();

			aplicacionesIOT.add(aplicacionIOTService.crearAplicacionIOT());
			aplicacionesIOT.add(aplicacionIOTService.crearAplicacionIOT());

			// Para imprimir la informaci�n de las aplicaciones IOT
			for (int i = 0; i < aplicacionesIOT.size(); i++) {
				System.out.println("  AppIOT " + (i + 1) + ": " + aplicacionesIOT.get(i));
			}
			break;
		default:
			System.out.println("Fin del programa");
			break;
		}
		
	}

}
