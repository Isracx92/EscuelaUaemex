package Principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opc;

		MetodoLlenar llenar = new MetodoLlenar();
		MetodoBurbuja MB = new MetodoBurbuja();
		MetodoDeInsercionDirecta MID = new MetodoDeInsercionDirecta();
		MetodoSeleccion MS = new MetodoSeleccion();

		System.out.println("Programa de Ordenamiento");
		Scanner Oas = new Scanner(System.in);
		System.out.println("Dame el tama\u00f1o de las filas");
		int F = Oas.nextInt();

		int[] m = new int[F];

		System.out.println("MENU PARA ORDENAR");
		System.out.println("1.METODO BURBUJA");
		System.out.println("2.METODO DE INSERCION");
		System.out.println("3.METODO DE SELECCION");

		opc = Oas.nextInt();

		switch (opc) {

		case 1:

			llenar.llenarNumeros(m);
			MB.MetodoBurbuja(m);

			break;

		case 2:
			llenar.llenarNumeros(m);
			MID.MetodoDeInsercionDirecta(m);

			break;

		case 3:
			llenar.llenarNumeros(m);
			MS.MetodoSeleccion(m);
			break;

		}
	}
}
