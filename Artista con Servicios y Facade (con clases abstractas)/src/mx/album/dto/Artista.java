package mx.album.dto;

public class Artista extends Persona {
	
	private int id;
	private String nombreArtistico;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreArtistico() {
		return nombreArtistico;
	}
	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nombreArtistico=" + nombreArtistico + "]";
	}
	
	
}
