package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class ProfesorFacade {

	ProfesorDAO profesorDao= new ProfesorDAO();
	
	public void create(Profesor profesor) {
		profesorDao.AgregarProfesor(profesor);
	}
	
	public void read() {
		profesorDao.MostrarLista();
	}
	
	public void update(Profesor profesor) {
		profesorDao.ActualizarProfesor(profesor);
	}
	
	public void delete(Profesor profesor) {
		profesorDao.EliminarProfesor(profesor);
	}
}
