package Principal;

public class BusquedaSecuencial {

	public static int buscarElemento(int[] m, int num) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == num) {
				return i;
			}
		}
		return -1;
	}
}
