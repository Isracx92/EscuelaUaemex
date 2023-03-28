package mx.album.dao;
import mx.album.dto.*;
import java.util.List;
import java.util.ArrayList;

public class ArtistaDAO {
	List<Artista> artistas= new ArrayList<Artista>();
	int id=0;
	
	public void agregarArtista(Artista artista) {
		artista.setId(id+1);
		artistas.add(artista);
		id++;	
	}
	
	public void actualizarArtista (Artista artista) {
		  for (int i = 0; i < artistas.size(); i++) {
	          if(artistas.get(i).getId()== artista.getId()){
	              artistas.get(i).setNombreArtistico(artista.getNombreArtistico());
	              	artistas.get(i).setId(artista.getId());
	          }
		  }
	}
		
	
	public void eliminarArtista(Artista artista) {
		artistas.remove(artista);
		
	}
	 public List<Artista> MostrarListaDeArtistas() {
		 return artistas;
		 }
	
}
