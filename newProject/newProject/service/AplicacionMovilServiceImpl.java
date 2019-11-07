package newProject.service;

import newProject.jerarquia.AplicacionMovil;
import newProject.utils.ScannerUtils;

public class AplicacionMovilServiceImpl implements AplicacionMovilService {

	@Override
	public AplicacionMovil crearAplicacionMovil() {
		AplicacionMovil nuevaAplicacion = new AplicacionMovil();

		System.out.println("  Nueva aplicaci�n M�vil:");

		nuevaAplicacion.setLenguajeDeProgramacion(ScannerUtils.preguntarCadenaPorConsola("    Lenguaje de programaci�n:"));
		nuevaAplicacion.setLineasDeCodigo(ScannerUtils.preguntarNumeroPorConsola("    Lineas de c�digo:", null));
		nuevaAplicacion.setCasosDeTests(ScannerUtils.preguntarNumeroPorConsola("    Casos de test:", null));
		nuevaAplicacion.setTecnologiaHibrida(ScannerUtils.preguntarBooleanPorConsola("    Tecnolog�a h�brida:"));

		System.out.println("-----------------------------------------");
		System.out.println("  Aplicaci�n m�vil creada");

		return nuevaAplicacion;
	}

}
