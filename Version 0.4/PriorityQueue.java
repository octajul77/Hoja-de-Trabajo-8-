/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Gonzales 14096
 * -------------------------------------------------
 * PriorityQueue
 * Esta interfaz se en listan todos los métodos necesarios
 * para el manejo de una PriorityQueue.
 * 
 * Clase tomada del libro Java Structures capitulo 13 
 * 
 */
public interface PriorityQueue<E extends Comparable<E>>{
	public E getFirst();
	public E remove();
	public void add(E value);
	public boolean isEmpty();
	public int size();
	public void clear();
	}
	
	
