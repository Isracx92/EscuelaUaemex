package mx.uamex.dao;

import mx.uamex.dto.Alumno;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
	List<Alumno> alumnos= new ArrayList<Alumno>();	

	int id=0;
	
	
	public void AgregarAlumno(Alumno alumno) {

		alumno.setId(id+1);
		alumnos.add(alumno);
		id++;	
	}
	
	public void actualizar (Alumno alumno) {
		
	}
	public void eliminar(Alumno alumno) {
		alumnos.remove(alumno);
		
	}
	 public void MostrarLista() {
		 System.out.println(alumnos);
		 }
	 }

