package mochila;

import java.util.Arrays;

public class Mochila {

	private float capacidad;

	public Mochila(float c) {
		capacidad = c;
	}

	public void llenarMochila(Objeto[] objetos) {

		Arrays.sort(objetos, new ObjetoComparador());

		float pesoMochila = 0;
		float valorMochila = 0;

		int i = 0;
		int[] solucion = new int[objetos.length];

		while ((i < objetos.length) && (pesoMochila + objetos[i].getPeso() <= capacidad)) {
			pesoMochila += (float) objetos[i].getPeso();
			valorMochila += (float) objetos[i].getValor();
			solucion[i] = i;
			i++;
		}
		if (i <= objetos.length && pesoMochila < capacidad) {
			float capacidadRestante = capacidad - pesoMochila;

			valorMochila += (float) objetos[i].getValorPeso() * capacidadRestante;
			pesoMochila = capacidad;
		}

		System.out.println("Capacidad de la mochila: " + capacidad);
		System.out.println("Peso de la mochila después del proceso: " + pesoMochila);
		System.out.println("Valor de la mochila después del proceso: " + valorMochila);
		System.out.print("Objetos insertados en la mochila: ");
		for (int j = 0; j < i; j++) {
			System.out.print(solucion[j] + " ");
		}
	}

}
