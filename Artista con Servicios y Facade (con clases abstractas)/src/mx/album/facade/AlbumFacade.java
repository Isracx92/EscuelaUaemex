package mx.album.facade;
import mx.album.dto.*;
import mx.album.dao.*;
import mx.album.servicios.*;

public abstract class AlbumFacade implements Servicios{

	AlbumDAO albumDao= new AlbumDAO();
	
	@Override
	public void agregarAlbum(Album album) {
		albumDao.agregarAlbum(album);
	}
	
	@Override
		public void actualizarAlbum(Album album) {
		albumDao.actualizarAlbum(album);
	}
	
	@Override
		public void mostrarAlbum() {
		albumDao.MostrarListaDeAlbums();
	}
	
	@Override
		public void eliminarAlbum(Album album) {
		albumDao.eliminarAlbum(album);
	}
}
