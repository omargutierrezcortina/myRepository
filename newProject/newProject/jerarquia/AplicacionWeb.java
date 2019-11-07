package newProject.jerarquia;

import newProject.utils.StringUtils;

public class AplicacionWeb extends AplicacionSoftware {

	private String frameworkBackend;
	private String frameworkFrontend;
	
	/**
	 * Constructor vacio
	 */
	public AplicacionWeb() {
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
	public AplicacionWeb(String lenguajeDeProgramacion, boolean persistente, int lineasDecodigo, double complejidad,
			int casosDeTests) {
		super(lenguajeDeProgramacion, persistente, lineasDecodigo, complejidad, casosDeTests);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the frameworkBackend
	 */
	public String getFrameworkBackend() {
		return frameworkBackend;
	}

	/**
	 * @param frameworkBackend the frameworkBackend to set
	 */
	public void setFrameworkBackend(String frameworkBackend) {
		this.frameworkBackend = frameworkBackend;
	}

	/**
	 * @return the frameworkFrontend
	 */
	public String getFrameworkFrontend() {
		return frameworkFrontend;
	}

	/**
	 * @param frameworkFrontend the frameworkFrontend to set
	 */
	public void setFrameworkFrontend(String frameworkFrontend) {
		this.frameworkFrontend = frameworkFrontend;
	}

	@Override
	public String toString() {
		return super.toString() + "AplicacionWeb [frameworkBackend=" + frameworkBackend + ", frameworkFrontend=" + frameworkFrontend + "]";
	}

	/**
	 * Metodo que se encarga de imprimir una cadena con la informacion de la
	 * AplicacionWeb
	 */
	public void imprimirStackTecnologico() {
		String cadena = "";
		
		if (!StringUtils.isNullOrEmpty(this.getLenguajeDeProgramacion())) {
			cadena = cadena.concat("El lenguaje de programación utilizado es ").concat(this.getLenguajeDeProgramacion());
		}
		
		if (!StringUtils.isNullOrEmpty(this.getFrameworkBackend())) {
			cadena = cadena.concat(", el framework de backend es ").concat(this.getFrameworkBackend());
		}
		
		if (!StringUtils.isNullOrEmpty(this.getFrameworkFrontend())) {
			cadena = cadena.concat(" y el framework de frontend es ").concat(this.getFrameworkFrontend());
		}
		
		System.out.println(cadena);
	}

}