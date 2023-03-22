package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class LibroFacade {

	LibroDAO libroDao= new LibroDAO();
	
	public void agregarLibro(Libro libro) {
		libroDao.AgregarLibro(libro);
	}
	
	public void leerLibro() {
		libroDao.MostrarLista();
	}
	
	public void actualizarLibro(Libro libro) {
		libroDao.ActualizarLibro(libro);
	}
	public void eliminarLibro(Libro libro) {
		libroDao.EliminarLibro(libro);
	}
}
