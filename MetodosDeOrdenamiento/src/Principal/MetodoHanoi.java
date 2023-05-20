package Principal;

public class MetodoHanoi {

	public static void resolverTorresDeHanoi(int n, char torreInicial, char torreAuxiliar, char torreDestino) {
		if (n == 1) {
			System.out.println("Mover disco 1 de la torre " + torreInicial + " a la torre " + torreDestino);
		} else {
			resolverTorresDeHanoi(n - 1, torreInicial, torreDestino, torreAuxiliar);
			System.out.println("Mover disco " + n + " de la torre " + torreInicial + " a la torre " + torreDestino);
			resolverTorresDeHanoi(n - 1, torreAuxiliar, torreInicial, torreDestino);
		}
	}
}
