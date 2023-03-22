package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class AlumnoFacade {

	AlumnoDAO alumnoDao= new AlumnoDAO();
	
	public void create(Alumno alumno) {
		alumnoDao.agregarAlumno(alumno);
	}
	
	public void read(){
		alumnoDao.MostrarListaDeALumnos();
		
	} 
	
	public void update(Alumno alumno) {
		alumnoDao.actualizarAlumno(alumno);
	}
	
	public void delete(Alumno alumno) {
		alumnoDao.eliminarAlumno(alumno);
	}
	
	
}
