package mochila;

public class Main {
	public static void main(String[] args) {

		final int NUM_OBJETOS = 8;
		final float CAPACIDAD = 25;

		Objeto[] objetos = new Objeto[NUM_OBJETOS];
		float[] pesos = { 2, 2, 4, 1, 2, 3, 12, 6 };
		int[] valores = { 4, 6, 8, 3, 6, 9, 12, 8 };

		for (int i = 0; i < NUM_OBJETOS; i++) {
			objetos[i] = new Objeto(pesos[i], valores[i]);
		}

		Mochila mochila = new Mochila(CAPACIDAD);

		mochila.llenarMochila(objetos);
	}

}
