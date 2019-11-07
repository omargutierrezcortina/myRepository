package newProject.service;

import newProject.jerarquia.AplicacionWeb;
import newProject.utils.ScannerUtils;

public class AplicacionWebServiceImpl implements AplicacionWebService {

	@Override
	public AplicacionWeb crearAplicacionWeb() {
		AplicacionWeb nuevaAplicacion = new AplicacionWeb();

		System.out.println("  Nueva aplicación Web:");

		nuevaAplicacion.setLenguajeDeProgramacion(ScannerUtils.preguntarCadenaPorConsola("    Lenguaje de programación:"));
		nuevaAplicacion.setLineasDeCodigo(ScannerUtils.preguntarNumeroPorConsola("    Lineas de código:"));
		nuevaAplicacion.setCasosDeTests(ScannerUtils.preguntarNumeroPorConsola("    Casos de test:"));
		nuevaAplicacion.setFrameworkBackend(ScannerUtils.preguntarCadenaPorConsola("    Framework backend:"));
		nuevaAplicacion.setFrameworkFrontend(ScannerUtils.preguntarCadenaPorConsola("    Framework frontend:"));

		System.out.println("-----------------------------------------");
		System.out.println("  Aplicación web creada");

		return nuevaAplicacion;
	}

}
