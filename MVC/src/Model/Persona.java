package Model;

import java.io.Serializable;

public class Persona implements Serializable {

	public int id;
	public String Nombre;
	public int Edad;

	public Persona(int id, String Nombre, int Edad) {
		this.Edad = Edad;
		this.id = id;
		this.Nombre = Nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}

}
