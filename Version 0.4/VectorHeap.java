/**
 * Universidad del Valle de Guatemala
 * Algortimos y estrcutura de datos
 * Seccion 10- Hoja de Trabajo 2
 * -------------------------------------------------
 * Laboratorio #8
 * @author Freddy Ruíz 14592/ Julio Gonzales 14096
 * -------------------------------------------------
 *VectorHeap
 *Clase tomada del libro Java Structures capitulo 13 implementacion de vector Heap
 * 
 */

import java.util.Vector;
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>{
	
	protected Vector<E> data;
	
	
	/**
	 * Método: VectorHeap (Constructor sin parámetros)
	 * post: constructs a new priority queue
	 */
	public VectorHeap(){
		
		data = new Vector<E>();
	}
	
	/**
	 * Método: VectorHeap(Vector<E> v) (Constructor con parámetros)
	 * post:constructs a new priority queue from an unordered vector
	 */
	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size()); //we know ultimate size
		for(i=0; i<v.size(); i++){
			//add elements to heap
			add(v.get(i));
		}
	}
	/**
	 * Método: parent(int i) (Static)
	 * @Param i
	 *	pre: 0<=i<size
	 *	post: returns parent of node at location i
	 */
	protected static int parent(int i){
		return (i-1)/2;
	}
	
	
	/**
	 * Método: left(int i)  (Static)
	 * pre: 0<=i<size
	 * post: returns index of left child of note at location i
	 * @param i
	 * @return 2*i+1
	 */
	protected static int left(int i){
		
		return 2*i+1;
	}
	
	
	/**
	 * Método: right
	 * pre: 0<=i<size
	 * post: returns index of right child of node at location i
	 * @param i
	 * @return 2*(i+1)
	 */
	protected static int right(int i){
		//pre: 0<=i<size
		//post: returns index of right child of node at location i
		return 2*(i+1);
	}
	
	
	
	
	
	
	
	/**
	 * Método: percolateUp
	 * pre: 0<=leaf<size
	 * post: moves node at index lead up to appropiate position
	 * @param leaf
	 */
	protected void percolateUp(int leaf){
		
		int parent = parent(leaf);
		E value = data.get(leaf);
		while(leaf>0 &&
				(value.compareTo(data.get(parent))<0)){
			data.set(leaf, data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}
	
	/**
	 * Método pushDownRoot:
	 *pre: 0<=root<size
	 *post: moves node at index root down to appropiate position in subtree 
	 * @param root
	 */
	protected void pushDownRoot(int root){
		
		int heapSize = data.size();
		E value = data.get(root);
		while(root<heapSize){
			int childpos = left(root);
			if(childpos<heapSize){
				if((right(root) < heapSize) &&
						((data.get(childpos+1)).compareTo(data.get(childpos))<0)){
					childpos++;
				}
				//Assert: childpos indexes smaller of two children
				if((data.get(childpos)).compareTo(value)<0){
					data.set(root, data.get(childpos));
					root = childpos; //keep moving down
				} else {
					data.set(root, value);
					return;
				}
			} else {
				data.set(root, value);
				return;
			}
		}
	}
	
	
	
/*
 * Implementación de los métodos de la clase
 * PriorityQueue
 */
	
	/**
	 * Método: getFirst()
	 * pre: !isEmpty()
	 * post: returns the minimum value in priority queue
	 */
	public E getFirst() {
		return data.get(0);
	}

	/**
	 * Método: remove()
	 * pre: !isEmpty()
	 * post: removes and returns the minimum value in priority queue
	 */
	public E remove() {
		
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if(data.size()>1){pushDownRoot(0);};
		return minVal;
	}

	/**
	 * Método: remove()
	 * pre: value is non-null comparable
	 * post: value is added to priority queue
	 */
	public void add(E value) {
		data.add(value);
		percolateUp(data.size()-1);
	}
	
	public int size() {
		return 0;
	}

	public void clear() {
		}
	
	public boolean isEmpty() {
		return false;
	}


}
