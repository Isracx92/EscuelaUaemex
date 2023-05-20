package Principal;

public class BusquedaBinaria {
	public static int BusquedaBinaria(int m[], int num) {

		int izquierda = 0;
		int derecha = m.length - 1;

		while (izquierda <= derecha) {
			int medio = izquierda + (derecha - izquierda) / 2;

			if (m[medio] == num) {
				return medio;
			}

			if (m[medio] < num) {
				izquierda = medio + 1;
			} else {
				derecha = medio - 1;
			}
		}

		return -1;
	}
}
