package newProject.service;

import newProject.jerarquia.AplicacionIOT;
import newProject.utils.ScannerUtils;

public class AplicacionIOTServiceImpl implements AplicacionIOTService {

	@Override
	public AplicacionIOT crearAplicacionIOT() {
		AplicacionIOT nuevaAplicacion = new AplicacionIOT();

		System.out.println("  Nueva aplicación IOT:");

		nuevaAplicacion.setLenguajeDeProgramacion(ScannerUtils.preguntarCadenaPorConsola("    Lenguaje de programación:"));
		nuevaAplicacion.setLineasDeCodigo(ScannerUtils.preguntarNumeroPorConsola("    Lineas de código:", null));
		nuevaAplicacion.setCasosDeTests(ScannerUtils.preguntarNumeroPorConsola("    Casos de test:", null));

		System.out.println("-----------------------------------------");
		System.out.println("  Aplicación IOT creada");

		return nuevaAplicacion;
	}

}
