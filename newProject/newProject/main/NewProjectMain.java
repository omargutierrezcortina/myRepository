package newProject.main;

import newProject.jerarquia.AplicacionIOT;
import newProject.jerarquia.AplicacionMovil;
import newProject.jerarquia.AplicacionWeb;
import newProject.jerarquia.ProtocoloIntercambio;

public class NewProjectMain {

	public static void main(String[] args) {
		
		AplicacionMovil aplicacion1 = new AplicacionMovil(); 
		aplicacion1.setLenguajeDeProgramacion("kotlin");
		aplicacion1.setTecnologiaHibrida(true);
		
		System.out.println(aplicacion1.calcularCalidad());
		
		aplicacion1.imprimirStackTecnologico();
		
		
		AplicacionWeb aplicacion2 = new AplicacionWeb(); 
		aplicacion2.setLenguajeDeProgramacion("Java");
		aplicacion2.setFrameworkBackend("Microservicios");
		aplicacion2.setFrameworkFrontend("AngularJS");
		
		System.out.println(aplicacion2.calcularCalidad());
		
		aplicacion2.imprimirStackTecnologico();
		
		
		AplicacionIOT aplicacion3 = new AplicacionIOT(); 
		aplicacion3.setLenguajeDeProgramacion("Vue");
		aplicacion3.setWifi(true);
		aplicacion3.setInterfazGrafica(true);
		aplicacion3.setProtocoloIntercambio(ProtocoloIntercambio.HTTP);
		
		System.out.println(aplicacion3.calcularCalidad());
		
		aplicacion3.imprimirStackTecnologico();
	} 

}
