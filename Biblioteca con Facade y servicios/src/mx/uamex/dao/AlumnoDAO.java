package mx.uamex.dao;

import mx.uamex.dto.Alumno;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
	List<Alumno> alumnos= new ArrayList<Alumno>();	
	int id=0;
	
	
	public void agregarAlumno(Alumno alumno) {
		alumno.setId(id+1);
		alumnos.add(alumno);
		id++;	
	}
	
	public void actualizarAlumno (Alumno alumno) {
		  for (int i = 0; i < alumnos.size(); i++) {
	          if(alumnos.get(i).getId()== alumno.getId()){
	              alumnos.get(i).setNombre(alumno.getNombre());
	               alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
	                alumnos.get(i).setApellidoPaterno(alumno.getApellidoPaterno());
	                 alumnos.get(i).setGenero(alumno.getGenero());
	                  alumnos.get(i).setNumerodeCuenta(alumno.getNumerodeCuenta());
	          }
		  }
	}
		
	
	public void eliminarAlumno(Alumno alumno) {
		alumnos.remove(alumno);
		
	}
	 public List<Alumno> MostrarListaDeALumnos() {
		 return alumnos;
		 }
	 }

