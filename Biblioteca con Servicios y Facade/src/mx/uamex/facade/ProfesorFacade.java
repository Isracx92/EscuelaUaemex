package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class ProfesorFacade {

	ProfesorDAO profesorDao= new ProfesorDAO();
	
	public void agregarProfesor(Profesor profesor) {
		profesorDao.AgregarProfesor(profesor);
	}
	
	public void leerProfesor() {
		profesorDao.MostrarLista();
	}
	
	public void actualizarProfesor(Profesor profesor) {
		profesorDao.ActualizarProfesor(profesor);
	}
	
	public void eliminarProfesor(Profesor profesor) {
		profesorDao.EliminarProfesor(profesor);
	}
}
