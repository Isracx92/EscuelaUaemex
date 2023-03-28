package mx.album.facade;
import mx.album.dto.*;
import mx.album.dao.*;
import mx.album.servicios.*;

public abstract class CancionFacade implements Servicios {
	
	CancionDAO cancionDao = new CancionDAO();
	
	@Override
	public void agregarCancion(Cancion cancion) {
	cancionDao.agregarCancion(cancion);
	}

	@Override
	public void actualizarCancion(Cancion cancion) {
	cancionDao.actualizarCancion(cancion);
	}

	@Override
	public void mostrarCancion() {
	cancionDao.MostrarListaDeCanciones();
}

	@Override
	public void eliminarCancion(Cancion cancion) {
	cancionDao.eliminarCancion(cancion);
}
}
