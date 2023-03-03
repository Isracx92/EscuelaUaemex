package mx.uamex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.Prestamo;

public class PrestamoDAO {
	
	List<Prestamo> prestamos= new ArrayList<Prestamo>();
	int id=0;
	
	public void AgregarPrestamo(Prestamo prestamo) {
		prestamo.setId(id+1);
		prestamos.add(prestamo);
		id++;
		
	}
	
	public void ActualizarPrestamos (Prestamo prestamo) {
		
	}
	
	public void EliminarPrestamo(Prestamo prestamo) {
		prestamos.remove(prestamo);
		
	}
	public void MostrarLista() {
		 System.out.println(prestamos);
		 }
	
}
