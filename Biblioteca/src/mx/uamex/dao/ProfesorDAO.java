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
		
	}
	
	public void EliminarProfesor(Profesor profesor) {
		profesores.remove(profesor);
		
	}
	public void MostrarLista() {
		 System.out.println(profesores);
		 }
	
	

}
