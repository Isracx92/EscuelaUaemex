package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class LibroFacade {

	LibroDAO libroDao= new LibroDAO();
	
	public void create(Libro libro) {
		libroDao.AgregarLibro(libro);
	}
	
	public void read() {
		libroDao.MostrarLista();
	}
	
	public void update(Libro libro) {
		libroDao.ActualizarLibro(libro);
	}
	public void delete(Libro libro) {
		libroDao.EliminarLibro(libro);
	}
}
