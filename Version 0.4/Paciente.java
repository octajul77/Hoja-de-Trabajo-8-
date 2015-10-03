/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Ochoa 14096
 * -------------------------------------------------
 *Paciente:
 *Esta clase es la encargada de crear objetos de tipo paciente
 *con su nombre, sintoma y prioridad para poder determinar
 *el orden en el cual serán atendidos
 * 
 */
public class Paciente implements Comparable<Paciente> { 
    
    //Inicializaicón de variables
    private String nombre;
    private String prioridad;
    private String sintoma;

  /**
   * Método: Paciente (Constructor)
   * Funcionalidad:
   * Crear un nuevo objeto de tipo paciente.
   * @param nombre, sintoma, prioridad
   * */
     public Paciente(String nombre, String sintoma, String prioridad) {
		super();
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.prioridad = prioridad;
	}	

//Setters y Getters	
public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    public String getNombre() {
        return nombre;
    }
	
 public String getSintoma() {
        return sintoma;
    }
	
    public String getPrioridad() {
        return prioridad;
    }

    //Implemetación de la clase compareTo
    /**
     * Método: compareTo
     * Funcionalidad:
     * Este método está encargado de comprar los pacientes y determinar cuál tiene mayor prioridad de
     * atención
     * @param otroPaciente 
     * @return paciente con mayor prioridad
     * */
	public int compareTo(Paciente otroPaciente) {
		return prioridad.compareTo(otroPaciente.getPrioridad());
	}
    
}
