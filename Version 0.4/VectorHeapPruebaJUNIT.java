/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Gonzales 14096
 * -------------------------------------------------
 * PriorityQueuePruebaJUNIT
 * Funcionalidad:
 * En esta clase se encuentran las pruebas JUNIT
 * de los métodos para agregar y remover en un vector 
 * heap
 * 
 */


import static org.junit.Assert.*;

import org.junit.Test;


public class VectorHeapPruebaJUNIT {
	//Inicialización de un objeto de tipo VectorHeap
	VectorHeap<Paciente> emergencias = new VectorHeap<Paciente>();
	
	/**
	 * Nombre de la prueba: agregar
	 * Funcionalidad:
	 * Comprueba que sea adicionado de manera correcta un nuevo paciente
	 * al vector heap
	 **/
	@Test
	public void agregar() {
		emergencias.add(new Paciente("Freddy Ruíz","Dolor de panza","A"));
		emergencias.add(new Paciente("Juan","Moquera","B"));
		assertEquals(2,emergencias.size());
	}
	
	/**
	 * Nombre de la prueba: elimar
	 * Funcionalidad:
	 * Comprueba que sea eliminado de manera correcta un nuevo paciente
	 * al vector heap
	 **/
	@Test
	public void eliminar() {
		emergencias.add(new Paciente("Freddy Ruíz","Dolor de panza","A"));
		emergencias.size();
		emergencias.remove();
		assertEquals(0,emergencias.size());
	
	}

}
