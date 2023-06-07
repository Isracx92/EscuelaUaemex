package Monedas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int monedas[] = { 50, 20, 10, 5, 1 };
		int cantidad[] = { 0, 0, 0, 0, 0 };
		Scanner Oas = new Scanner(System.in);

		System.out.println("Ingresa un Numero:");
		int num = Oas.nextInt();
		cantidad[0] = num;
		for (int i = 0; i < 5; i++) {
			cantidad[i] = num / monedas[i];
			while (cantidad[i] > 0 && cantidad[i] != num - 1) {
				int res = num - (monedas[i] * cantidad[i]);
				for (int j = 0; j < 5; j++) {
					if (j > i) {
						cantidad[j] = res / monedas[j];
						res -= monedas[j] * cantidad[j];
					}
					System.out.println(cantidad[j] + " monedas de " + monedas[j]);
				}
				System.out.println("----------------------");
				cantidad[i]--;
			}
		}
	}
}
