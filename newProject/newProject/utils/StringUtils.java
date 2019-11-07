package newProject.utils;

public class StringUtils {

	/**
	 * Devuelve true en caso de que una cadena se nula o sea una cadena vacia
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean isNullOrEmpty(String cadena) {
		return (cadena == null || "".equals(cadena));
	}

}
