package EjemploDAO;

import java.util.Scanner;

import DAO.PersonaDAO;
import DAO.PersonaDAOImp;
import Model.Persona;

public class EjemploDAO {

	public static void main(String[] args) {
		int opc, Edad;
		int ID = 0;
		String Nombre;
		Scanner Oas = new Scanner(System.in);
		PersonaDAO PP = new PersonaDAOImp();
		do {
			System.out.println("Hola ¿Que operacion quieres realizar?");
			System.out.println("1.Agregar una persona");
			System.out.println("2.Actualizar a una persona");
			System.out.println("3.Buscar a una persona");
			System.out.println("4.Mostrar todo");
			System.out.println("5.Eliminar a una persona");
			System.out.println("6.Eliminar todo");
			System.out.println("7.Salir");

			opc = Oas.nextInt();
			switch (opc) {

			case 1:
				System.out.println("Dame los datos de la persona");
				Nombre = Oas.next();
				Edad = Oas.nextInt();
				PP.Agregar(new Persona(ID, Nombre, Edad));
				break;

			case 2:
				System.out.println("Las siguientes opciones son para actualizar");
				System.out.println("1.Actualizar solo el Nombre de una persona");
				System.out.println("2.Actualizar la Edad de una persona");
				System.out.println("3.Actualizar a una Persona(Todos sus datos)");
				opc = Oas.nextInt();
				switch (opc) {
				case 1:
					System.out.println("Dame los datos de la persona");
					Nombre = Oas.next();
					Edad = Oas.nextInt();
					PP.ActualizarNombre(new Persona(ID, Nombre, Edad));
					break;
				case 2:
					System.out.println("Dame los datos de la persona");
					Nombre = Oas.next();
					Edad = Oas.nextInt();
					PP.ActualizarEdad(new Persona(ID, Nombre, Edad));
					break;
				case 3:
					System.out.println("Dame los datos de la persona");
					Nombre = Oas.next();
					Edad = Oas.nextInt();
					PP.ActualizarTodo(new Persona(ID, Nombre, Edad));
					break;
				}
				break;

			case 3:
				System.out.println("Dame los datos de la persona");
				Nombre = Oas.next();
				PP.BuscarNombre(Nombre);
				break;

			case 4:
				PP.ConsultarTodo();
				break;

			case 5:
				System.out.println("Dame el Id de la persona");
				ID = Oas.nextInt();
				PP.Eliminar(ID);
				break;

			case 6:
				PP.EliminarTodo();
				break;
			}
			ID++;
			System.out.println("\n");
		} while (opc != 7);
		System.out.println("Termino el Programa");
	}
}
