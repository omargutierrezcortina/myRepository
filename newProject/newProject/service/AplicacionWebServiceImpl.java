package newProject.service;

import newProject.jerarquia.AplicacionWeb;
import newProject.utils.ScannerUtils;

public class AplicacionWebServiceImpl implements AplicacionWebService {

	@Override
	public AplicacionWeb crearAplicacionWeb() {
		AplicacionWeb nuevaAplicacion = new AplicacionWeb();

		System.out.println("  Nueva aplicaci�n Web:");

		nuevaAplicacion.setLenguajeDeProgramacion(ScannerUtils.preguntarCadenaPorConsola("    Lenguaje de programaci�n:"));
		nuevaAplicacion.setLineasDeCodigo(ScannerUtils.preguntarNumeroPorConsola("    Lineas de c�digo:"));
		nuevaAplicacion.setCasosDeTests(ScannerUtils.preguntarNumeroPorConsola("    Casos de test:"));
		nuevaAplicacion.setFrameworkBackend(ScannerUtils.preguntarCadenaPorConsola("    Framework backend:"));
		nuevaAplicacion.setFrameworkFrontend(ScannerUtils.preguntarCadenaPorConsola("    Framework frontend:"));

		System.out.println("-----------------------------------------");
		System.out.println("  Aplicaci�n web creada");

		return nuevaAplicacion;
	}

}
