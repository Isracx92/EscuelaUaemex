package Principal;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opc, num;

		MetodoLlenar llenar = new MetodoLlenar();
		MetodoBurbuja MB = new MetodoBurbuja();
		MetodoDeInsercionDirecta MID = new MetodoDeInsercionDirecta();
		MetodoSeleccion MS = new MetodoSeleccion();
		MetodoQuickSort QS = new MetodoQuickSort();
		MetodoShell SM = new MetodoShell();
		MetodoAckerman MA = new MetodoAckerman();
		MetodoHanoi MH = new MetodoHanoi();
		BusquedaSecuencial BS = new BusquedaSecuencial();
		BusquedaBinaria BB = new BusquedaBinaria();

		System.out.println("Programa de Ordenamiento");
		Scanner Oas = new Scanner(System.in);
		System.out.println("Dame el tama\u00f1o de las filas");
		int F = Oas.nextInt();
		System.out.println("Dame el tama\u00f1o de las columnas");
		int C = Oas.nextInt();

		int[] m = new int[F];

		System.out.println("MENU PARA ORDENAR");
		System.out.println("1.METODO BURBUJA");
		System.out.println("2.METODO DE INSERCION");
		System.out.println("3.METODO DE SELECCION");
		System.out.println("4.METODO DE QUICKSORT");
		System.out.println("5.METODO SHELL");
		System.out.println("6.METODO ACKERMAN");
		System.out.println("7.METODO HANOI");
		System.out.println("8.BUSQUEDA SECUENCIAL");
		System.out.println("9.BUSQUEDA BINARIA");

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

		case 4:
			llenar.llenarNumeros(m);
			QS.quicksort(m, 0, F - 1);
			System.out.println(Arrays.toString(m));
			break;

		case 5:
			llenar.llenarNumeros(m);
			SM.Shell(m);
			break;

		case 6:
			int resultados = MA.ackerman(F, C);
			System.out.println("Ackerman(" + F + "," + C + ")=" + resultados);
			break;

		case 7:
			int numDiscos = 3;
			char torreInicial = 'A';
			char torreAuxiliar = 'B';
			char torreDestino = 'C';
			MH.resolverTorresDeHanoi(numDiscos, torreInicial, torreAuxiliar, torreDestino);

			break;

		case 8:
			llenar.llenarNumeros(m);
			System.out.println("¿Cual es el numero que quieres buscar?");
			num = Oas.nextInt();
			BS.buscarElemento(m, num);
			break;

		case 9:
			llenar.llenarNumeros(m);
			System.out.println("¿Cual es el numero que quieres buscar?");
			num = Oas.nextInt();
			BB.BusquedaBinaria(m, num);
			break;

		}
	}
}
