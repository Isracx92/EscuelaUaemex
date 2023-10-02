package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Persona;

public class PersonaDAOImp implements PersonaDAO<Persona> {

	List<Persona> PS = new ArrayList<Persona>();
	Scanner Oas = new Scanner(System.in);
	PersonaInputStream PI = new PersonaInputStream();
	PersonaOutputStream PO = new PersonaOutputStream();

	@Override
	public void ConsultarTodo() {
		for (int i = 0; i < PS.size(); i++) {
			System.out.println(PS.get(i));
		}
	}

	@Override
	public void Agregar(Persona persona) {
		PS.add(persona);
		PO.Escribir(persona);
	}

	@Override
	public void Eliminar(int id) {
		for (int i = 0; i < PS.size(); i++) {
			if (PS.get(i).getId() == id) {
				PS.remove(i);
			}
			PO.Escribir(PS.get(i));
		}

	}

	@Override
	public void EliminarTodo() {
		PS.clear();

	}

	@Override
	public Persona BuscarNombre(String Nombre) {
		Persona a = null;
		for (int i = 0; i < PS.size(); i++) {
			if (PS.get(i).getNombre() == Nombre) {
				a = PS.get(i);
			}
		}
		return a;

	}

	@Override
	public void ActualizarTodo(Persona persona) {
		for (int i = 0; i < PS.size(); i++) {
			if (persona.getId() == PS.get(i).getId()) {
				PS.get(i).setId(persona.getId());
				PS.get(i).setNombre(persona.getNombre());
				PS.get(i).setEdad(persona.getEdad());
				PO.Escribir(persona);
			}
		}
	}

	@Override
	public void ActualizarNombre(Persona persona) {
		for (int i = 0; i < PS.size(); i++) {
			if (persona.getId() == PS.get(i).getId()) {
				PS.get(i).setNombre(persona.getNombre());
				PO.Escribir(persona);
			}
		}

	}

	@Override
	public void ActualizarEdad(Persona persona) {
		for (int i = 0; i < PS.size(); i++) {
			if (persona.getId() == PS.get(i).getId()) {
				PS.get(i).setEdad(persona.getEdad());
				PO.Escribir(persona);
			}
		}

	}

}
