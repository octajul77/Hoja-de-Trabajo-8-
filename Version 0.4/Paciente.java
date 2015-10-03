//Julio Gonzalez 14096
public class Paciente implements Comparable<Paciente> { 
    
    private String nombre;
    private String prioridad;
    private String sintoma;

	public Paciente(String nombre, String sintoma, String prioridad) {
		super();
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.prioridad = prioridad;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    
  
	public int compareTo(Paciente otroPaciente) {
		return prioridad.compareTo(otroPaciente.getPrioridad());
	}
    
}