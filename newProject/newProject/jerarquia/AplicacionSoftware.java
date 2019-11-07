package newProject.jerarquia;

public class AplicacionSoftware {

	private String lenguajeDeProgramacion;
	private boolean persistente;
	private int lineasDeCodigo;
	private double complejidad;
	private int casosDeTests;

	/**
	 * Constructor vacio
	 */
	public AplicacionSoftware() {

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
	public AplicacionSoftware(String lenguajeDeProgramacion, boolean persistente, int lineasDecodigo,
			double complejidad, int casosDeTests) {
		super();
		this.lenguajeDeProgramacion = lenguajeDeProgramacion;
		this.persistente = persistente;
		this.lineasDeCodigo = lineasDecodigo;
		this.complejidad = complejidad;
		this.casosDeTests = casosDeTests;
	}

	/**
	 * @return the lenguajeDeProgramacion
	 */
	public String getLenguajeDeProgramacion() {
		return lenguajeDeProgramacion;
	}

	/**
	 * @param lenguajeDeProgramacion the lenguajeDeProgramacion to set
	 */
	public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
		this.lenguajeDeProgramacion = lenguajeDeProgramacion;
	}

	/**
	 * @return the persistente
	 */
	public boolean isPersistente() {
		return persistente;
	}

	/**
	 * @param persistente the persistente to set
	 */
	public void setPersistente(boolean persistente) {
		this.persistente = persistente;
	}

	/**
	 * @return the lineasDeCodigo
	 */
	public int getLineasDeCodigo() {
		return lineasDeCodigo;
	}

	/**
	 * @param lineasDeCodigo the lineasDeCodigo to set
	 */
	public void setLineasDeCodigo(int lineasDeCodigo) {
		this.lineasDeCodigo = lineasDeCodigo;
	}

	/**
	 * @return the complejidad
	 */
	public double getComplejidad() {
		return complejidad;
	}

	/**
	 * @param complejidad the complejidad to set
	 */
	public void setComplejidad(double complejidad) {
		this.complejidad = complejidad;
	}

	/**
	 * @return the casosDeTests
	 */
	public int getCasosDeTests() {
		return casosDeTests;
	}

	/**
	 * @param casosDeTests the casosDeTests to set
	 */
	public void setCasosDeTests(int casosDeTests) {
		this.casosDeTests = casosDeTests;
	}

	/**
	 * Metodo que calcula la calidad del codigo
	 * 
	 * @return
	 */
	public double calcularCalidad() {
		double calidad = 100.0;
		if (complejidad >= 11 && complejidad < 20) {
			calidad = calidad - 10;
		} else if (complejidad >= 21 && complejidad <= 50) {
			calidad = calidad - 30;
		} else if (complejidad >= 50) {
			calidad = calidad - 50;
		} else if (lineasDeCodigo >= 5000 && casosDeTests <= 3000) {
			calidad = calidad - 20;
		}
		return calidad;
	}

	/**
	 * Metodo toString
	 */
	public String toString() {
		return "AplicacionSoftware [lenguajeDeProgramacion=" + this.lenguajeDeProgramacion + ", persistente="
				+ this.persistente + ", lineasDecodigo=" + this.lineasDeCodigo + ", complejidad=" + this.complejidad
				+ ", casosDeTests=" + this.casosDeTests + "]";
	}

}
