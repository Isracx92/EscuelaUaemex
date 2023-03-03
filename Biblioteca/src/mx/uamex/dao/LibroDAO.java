package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Libro;

public class LibroDAO {
	List<Libro> libros= new ArrayList<Libro>();	
	int id=0;

	
	public void AgregarLibro(Libro libro) {
		libro.setId(id+1);
		libros.add(libro);
		id++;
		
	}
	
	public void ActualizarLibro (Libro libro) {
		
	}
	
	public void EliminarLibro(Libro libro) {
		libros.remove(libro);
		
	}
	public void MostrarLista() {
		 System.out.println(libros);
		 }
}
