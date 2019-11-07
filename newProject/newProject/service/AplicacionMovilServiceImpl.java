package newProject.service;

import newProject.jerarquia.AplicacionMovil;
import newProject.utils.ScannerUtils;

public class AplicacionMovilServiceImpl implements AplicacionMovilService {

	@Override
	public AplicacionMovil crearAplicacionMovil() {
		AplicacionMovil nuevaAplicacion = new AplicacionMovil();

		System.out.println("  Nueva aplicación Móvil:");

		nuevaAplicacion.setLenguajeDeProgramacion(ScannerUtils.preguntarCadenaPorConsola("    Lenguaje de programación:"));
		nuevaAplicacion.setLineasDeCodigo(ScannerUtils.preguntarNumeroPorConsola("    Lineas de código:", null));
		nuevaAplicacion.setCasosDeTests(ScannerUtils.preguntarNumeroPorConsola("    Casos de test:", null));
		nuevaAplicacion.setTecnologiaHibrida(ScannerUtils.preguntarBooleanPorConsola("    Tecnología híbrida:"));

		System.out.println("-----------------------------------------");
		System.out.println("  Aplicación móvil creada");

		return nuevaAplicacion;
	}

}
