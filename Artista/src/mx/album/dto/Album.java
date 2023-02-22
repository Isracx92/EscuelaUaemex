package mx.album.dto;

import java.util.List;

public class Album{
	private int id;
	private String nombreAlbum;
	private List<Cancion>Album;
	private String FechaLanzamiento;
	private String Genero;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreAlbum() {
		return nombreAlbum;
	}
	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	public List<Cancion> getAlbum() {
		return Album;
	}
	public void setAlbum(List<Cancion> album) {
		Album = album;
	}
	public String getFechaLanzamiento() {
		return FechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		FechaLanzamiento = fechaLanzamiento;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", nombreAlbum=" + nombreAlbum + ", Album=" + Album + ", FechaLanzamiento="
				+ FechaLanzamiento + ", Genero=" + Genero + "]";
	}
	

}
