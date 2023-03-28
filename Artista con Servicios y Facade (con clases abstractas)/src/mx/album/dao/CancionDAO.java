package mx.album.dao;
import mx.album.dto.*;
import java.util.List;
import java.util.ArrayList;

public class CancionDAO {

	List<Cancion> canciones = new ArrayList<Cancion>();
	int id=0; 
	
	public void agregarCancion(Cancion cancion) {
		cancion.setId(id+1);
		canciones.add(cancion);
		id++;	
	}
	
	public void actualizarCancion (Cancion cancion) {
		  for (int i = 0; i < canciones.size(); i++) {
	          if(canciones.get(i).getId()== cancion.getId()){
	              canciones.get(i).setNombreCancion(cancion.getNombreCancion());
	              	canciones.get(i).setCompositor(cancion.getCompositor());
	              	  canciones.get(i).setFechaLanzamiento(cancion.getFechaLanzamiento());
	              	  	canciones.get(i).setGenero(cancion.getGenero());
	          }
		  }
	}
		
	
	public void eliminarCancion(Cancion cancion) {
		canciones.remove(cancion);
		
	}
	 public List<Cancion> MostrarListaDeCanciones() {
		 return canciones;
		 }
}	
