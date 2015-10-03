//Julio Gonzalez 14096
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Se crea el vector heap para guardar a cada paciente
		VectorHeap<Paciente> emergencias = new VectorHeap<Paciente>();
		
		//Se lee el archivo 
		FileReader fileReader = new FileReader("pacientes.txt");
		BufferedReader lector = new BufferedReader(fileReader);
		
		//contador
		int contadorPacientes= 0;
		//Stirng guarda linea de info del .txt
		String infoPaciente;
				
		//array donde se guarda separada la informacion 
		String[] clasificacionInfo;
		
		
		
		//Ciclo donde se lee el archivo linea por linea
		while((infoPaciente = lector.readLine())!=null){
			//Se hace la separacion de informacion
			clasificacionInfo = infoPaciente.split(", ");
			//Se agrega a vector heap el pasciente ya con la info separada
			emergencias.add(new Paciente(clasificacionInfo[0],clasificacionInfo[1],clasificacionInfo[2]));
			//Se incrementa contador
			contadorPacientes++;
		}
		
		
		
		//Se cierra el lector
		lector.close();
		
		//Se crea un objeto temporal tipo Patient
		Paciente temporal;
		
		//Ciclo de impresion de pacientes a partir del hospital (VectorHeap)
		for(int i=0; i<contadorPacientes; i++){
			temporal = emergencias.remove();
			System.out.println("Nombre: "+temporal.getNombre()+", Causa: "+temporal.getSintoma()+", Prioridad: "+temporal.getPrioridad());
		}
		
	}

}