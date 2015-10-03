
/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Ochoa 14096
 * -------------------------------------------------
 *Main:
 *Esta clase es la encargada de interactuar con el usuario y mostrarle
 *el orden en el cual serán ordenados los datos.
 * 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println ("------BIENVENIDO AL HOSPITAL VIDA MEDICA--------");
		/**
		 * Inicialización del vectorHeap y otras variables para el almacenamiento de pacientes
		 * 
		 **/
		VectorHeap<Paciente> emergencias = new VectorHeap<Paciente>();
		int contadorPacientes= 0;  
		String infoPaciente; //String que almacena la informacón  del paciente
		String[] clasificacionInfo; //array donde se guarda separada la informacion 
		Paciente temporal; //Se crea un objeto temporal tipo Patient
			
		/**
		 * Lectura del archivo 
		 **/ 
		FileReader fileReader = new FileReader("src\\pacientes.txt");
		BufferedReader lector = new BufferedReader(fileReader);
		
		
		/**
		 * Ciclo mediante el cual será leída cada una de las líneas del  archivo
		 */
		while((infoPaciente = lector.readLine())!=null){
			//Se hace la separacion de informacion
			clasificacionInfo = infoPaciente.split(", ");
			//Se agrega a vector heap el pasciente ya con la info separada
			emergencias.add(new Paciente(clasificacionInfo[0],clasificacionInfo[1],clasificacionInfo[2]));
			//Se incrementa contador
			contadorPacientes++;
		}
		
		//Cierre del lector
		lector.close();
		

		/**
		 * Ciclo mediante el cual será impreso en orden de prioridad la atención de clientes
		 * 
		 */
		System.out.println("\nA continuación se mostrará el orden en el que serán \natendidos los pacientes:");
		System.out.println("\nOrden Correcto:");
		for(int i=0; i<contadorPacientes; i++){
			temporal = emergencias.remove();
			System.out.println("Nombre: "+temporal.getNombre()+", Causa: "+temporal.getSintoma()+", Prioridad: "+temporal.getPrioridad());
		}
		
	}

}
