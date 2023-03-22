package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class AlumnoFacade {

	AlumnoDAO alumnoDao= new AlumnoDAO();
	
	public void agregarAlumno(Alumno alumno) {
		alumnoDao.agregarAlumno(alumno);
	}
	
	public void leerAlumno(){
		alumnoDao.MostrarListaDeALumnos();
		
	} 
	
	public void actualizarAlumno(Alumno alumno) {
		alumnoDao.actualizarAlumno(alumno);
	}
	
	public void eliminarAlumno(Alumno alumno) {
		alumnoDao.eliminarAlumno(alumno);
	}
	
	
}
