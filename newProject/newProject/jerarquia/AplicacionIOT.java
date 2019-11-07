package newProject.jerarquia;

import newProject.utils.StringUtils;

public class AplicacionIOT extends AplicacionSoftware {

	// ATRIBUTOS

	public boolean interfazGrafica;
	public boolean wifi;
	public ProtocoloIntercambio protocoloIntercambio;

	/**
	 * Constructor
	 */
	public AplicacionIOT() {
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
	public AplicacionIOT(String lenguajeDeProgramacion, boolean persistente, int lineasDecodigo, double complejidad,
			int casosDeTests) {
		super(lenguajeDeProgramacion, persistente, lineasDecodigo, complejidad, casosDeTests);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the interfazGrafica
	 */
	public boolean isInterfazGrafica() {
		return interfazGrafica;
	}

	/**
	 * @param interfazGrafica the interfazGrafica to set
	 */
	public void setInterfazGrafica(boolean interfazGrafica) {
		this.interfazGrafica = interfazGrafica;
	}

	/**
	 * @return the wifi
	 */
	public boolean isWifi() {
		return wifi;
	}

	/**
	 * @param wifi the wifi to set
	 */
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	/**
	 * @return the protocoloIntercambio
	 */
	public ProtocoloIntercambio getProtocoloIntercambio() {
		return protocoloIntercambio;
	}

	/**
	 * @param protocoloIntercambio the protocoloIntercambio to set
	 */
	public void setProtocoloIntercambio(ProtocoloIntercambio protocoloIntercambio) {
		this.protocoloIntercambio = protocoloIntercambio;
	}

	@Override
	public String toString() {
		return super.toString() +  "AplicacionIOT [interfazGrafica=" + interfazGrafica + ", wifi=" + wifi + ", protocoloIntercambio="
				+ protocoloIntercambio + "]";
	}

	/**
	 * Metodo que se encarga de imprimir una cadena con la informacion de la
	 * AplicacionIOT
	 */
	public void imprimirStackTecnologico() {
		String cadena = "";
		
		if (!StringUtils.isNullOrEmpty(this.getLenguajeDeProgramacion())) {
			cadena = cadena.concat("El lenguaje de programación utilizado es ").concat(this.getLenguajeDeProgramacion());
		}
		
		if (this.getProtocoloIntercambio() != null) {
			cadena = cadena.concat(", el protocolo utilizado es ").concat(this.getProtocoloIntercambio().name());
		}
		
		System.out.println(cadena);
	}

}
