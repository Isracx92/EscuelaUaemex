package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Profesor;

public class ProfesorDAO {
	List <Profesor> profesores= new ArrayList<Profesor>();
	int id=0;
	
	public void AgregarProfesor(Profesor profesor) {
		profesor.setId(id+1);
		profesores.add(profesor);
		id++;
		
	}
	
	public void ActualizarProfesor (Profesor profesor) {
		for (int i = 0; i < profesores.size(); i++) {
	          if(profesores.get(i).getId()==profesor.getId()) {
	        	  	profesores.get(i).setNombre(profesor.getNombre()); 
	        	  	  profesores.get(i).setApellidoMaterno(profesor.getApellidoMaterno());
	        	  	  	profesores.get(i).setApellidoPaterno(profesor.getApellidoPaterno());
	        	  	  	  profesores.get(i).setGenero(profesor.getGenero());
	        	  	  	  	profesores.get(i).setNumeroEmpleado(profesor.getNumeroEmpleado());;
	        	  }
	          }
		
	}
	
	public void EliminarProfesor(Profesor profesor) {
		profesores.remove(profesor);
		
	}
	public void MostrarLista() {
		 System.out.println(profesores);
		 }
	
	

}
