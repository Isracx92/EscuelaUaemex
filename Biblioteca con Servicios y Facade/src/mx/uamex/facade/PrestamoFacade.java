package mx.uamex.facade;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class PrestamoFacade {
	
	PrestamoDAO prestamoDao= new PrestamoDAO();
	
	public void agregarPrestamo(Prestamo prestamo) {
		prestamoDao.AgregarPrestamo(prestamo);
	}
	
	public void leerPrestamo() {
		prestamoDao.MostrarLista();
		
	}
	
	public void actualizarPrestamo(Prestamo prestamo) {
		prestamoDao.ActualizarPrestamos(prestamo);
	}
	public void eliminarPrestamo(Prestamo prestamo) {
		prestamoDao.EliminarPrestamo(prestamo);
	}
}
