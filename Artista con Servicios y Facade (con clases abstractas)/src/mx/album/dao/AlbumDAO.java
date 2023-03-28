package mx.album.dao;
import mx.album.dto.*;
import java.util.List;
import java.util.ArrayList;

public class AlbumDAO {

	List<Album> albums= new ArrayList<Album>();
	int id=0;
	
	public void agregarAlbum(Album album) {
		album.setId(id+1);
		albums.add(album);
		id++;	
	}
	
	public void actualizarAlbum (Album album) {
		  for (int i = 0; i < albums.size(); i++) {
	          if(albums.get(i).getId()== album.getId()){
	              albums.get(i).setNombreAlbum(album.getNombreAlbum());;
	               albums.get(i).setGenero(album.getGenero());;
	                albums.get(i).setFechaLanzamiento(album.getFechaLanzamiento());;
	          }
		  }
	}
		
	
	public void eliminarAlbum(Album album) {
		albums.remove(album);
		
	}
	 public List<Album> MostrarListaDeAlbums() {
		 return albums;
		 }
	
}
