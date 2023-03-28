package mx.album.facade;

import mx.album.dto.*;
import mx.album.dao.*;
import mx.album.servicios.*;

public abstract class ArtistaFacade implements Servicios {
	
	ArtistaDAO artistaDao = new ArtistaDAO();
	
	@Override
	public void agregarArtista(Artista artista) {
	artistaDao.agregarArtista(artista);
}

	@Override
	public void actualizarArtista(Artista artista) {
	artistaDao.actualizarArtista(artista);
}

	@Override
	public void mostrarArtista() {
	artistaDao.MostrarListaDeArtistas();
}

	@Override
	public void eliminarArtista(Artista artista) {
	artistaDao.eliminarArtista(artista);
}
}
