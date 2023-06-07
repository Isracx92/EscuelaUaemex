package cola;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {

		/*
		 * El LinkedList maestra se usa mas para la secuencia de elementos utilizando
		 * nodos
		 */
		Queue<String> cola = new LinkedList<>();
		cola.add("Elemento 1");
		cola.add("Elemento 2");
		cola.add("Elemento 3");

		String primerElemento = cola.peek();
		System.out.println("Primer elemento: " + primerElemento);

		String elementoEliminado = cola.poll();
		System.out.println("Elemento eliminado: " + elementoEliminado);

		System.out.println("Elementos en la cola:");
		for (String elemento : cola) {
			System.out.println(elemento);
		}

		boolean estaVacia = cola.isEmpty();
		System.out.println("La cola está vacía: " + estaVacia);

		int tamano = cola.size();
		System.out.println("Tamaño de la cola: " + tamano);
	}

}
