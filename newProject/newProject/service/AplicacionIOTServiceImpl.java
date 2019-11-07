package newProject.service;

import newProject.jerarquia.AplicacionIOT;
import newProject.utils.ScannerUtils;

public class AplicacionIOTServiceImpl implements AplicacionIOTService {

	@Override
	public AplicacionIOT crearAplicacionIOT() {
		AplicacionIOT nuevaAplicacion = new AplicacionIOT();

		System.out.println("  Nueva aplicaci�n IOT:");

		nuevaAplicacion.setLenguajeDeProgramacion(ScannerUtils.preguntarCadenaPorConsola("    Lenguaje de programaci�n:"));
		nuevaAplicacion.setLineasDeCodigo(ScannerUtils.preguntarNumeroPorConsola("    Lineas de c�digo:", null));
		nuevaAplicacion.setCasosDeTests(ScannerUtils.preguntarNumeroPorConsola("    Casos de test:", null));

		System.out.println("-----------------------------------------");
		System.out.println("  Aplicaci�n IOT creada");

		return nuevaAplicacion;
	}

}
