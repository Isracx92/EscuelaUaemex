package Principal;

public class MetodoShell {
	public void Shell(int m[]) {

		int salto, aux, i;
		boolean cambios = true;

		for (salto = m.length / 2; salto != 0; salto /= 2) {
			while (cambios) {
				cambios = false;
			}
			for (i = salto; i < m.length; i++) {
				if (m[i - salto] > m[i]) {
					aux = m[i];
					m[i] = m[i - salto];
					m[i - salto] = aux;
					cambios = true;
				}
			}
		}
		System.out.println("\nDatos ordenados de menor a mayor:");
		for (int k = 0; k < m.length; k++) {
			System.out.print(m[k] + " ");
		}

	}
}
