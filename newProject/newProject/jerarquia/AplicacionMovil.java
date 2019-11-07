package newProject.jerarquia;

import java.util.Arrays;

public class AplicacionMovil extends AplicacionSoftware {

	private boolean tecnologiaHibrida;
	String[] permisos = { "camara", "microfono", "altavoces", "bateria" };

	/**
	 * Constructor
	 */
	public AplicacionMovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * 
	 * @param lenguajeDeProgramacion
	 * @param persistente
	 * @param lineasDecodigo
	 * @param complejidad
	 * @param casosDeTests
	 */
	public AplicacionMovil(String lenguajeDeProgramacion, boolean persistente, int lineasDecodigo, double complejidad,
			int casosDeTests) {
		super(lenguajeDeProgramacion, persistente, lineasDecodigo, complejidad, casosDeTests);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tecnologiaHibrida
	 */
	public boolean isTecnologiaHibrida() {
		return tecnologiaHibrida;
	}

	/**
	 * @param tecnologiaHibrida the tecnologiaHibrida to set
	 */
	public void setTecnologiaHibrida(boolean tecnologiaHibrida) {
		this.tecnologiaHibrida = tecnologiaHibrida;
	}

	/**
	 * @return the permisos
	 */
	public String[] getPermisos() {
		return permisos;
	}

	/**
	 * @param permisos the permisos to set
	 */
	public void setPermisos(String[] permisos) {
		this.permisos = permisos;
	}

	@Override
	public String toString() {
		return super.toString() + "AplicacionMovil [tecnologiaHibrida=" + tecnologiaHibrida + ", permisos="
				+ Arrays.toString(permisos) + "]";
	}

	/**
	 * Metodo que se encarga de imprimir una cadena con la informacion de la
	 * AplicacionMovil
	 */
	public void imprimirStackTecnologico() {
		String cadena = "El lenguaje de programaci�n utilizado es ".concat(this.getLenguajeDeProgramacion());

		if (this.isTecnologiaHibrida() == true) {
			cadena = cadena.concat(", utiliza tecnolog�a h�brida");
		} else {
			cadena = cadena.concat(", utiliza tecnolog�a nativa");
		}

		System.out.println(cadena);
	}

}
