package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class PrestamoFacade {
	
	PrestamoDAO prestamoDao= new PrestamoDAO();
	
	public void create(Prestamo prestamo) {
		prestamoDao.AgregarPrestamo(prestamo);
	}
	
	public void read() {
		prestamoDao.MostrarLista();
		
	}
	
	public void update(Prestamo prestamo) {
		prestamoDao.ActualizarPrestamos(prestamo);
	}
	public void delete(Prestamo prestamo) {
		prestamoDao.EliminarPrestamo(prestamo);
	}
}
