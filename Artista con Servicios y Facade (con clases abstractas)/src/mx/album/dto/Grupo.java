package mx.album.dto;

import java.util.List;

public class Grupo{

	private int id;
	private String nombreGrupo;
	private List<Artista> Artista;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public List<Artista> getArtista() {
		return Artista;
	}
	public void setArtista(List<Artista> artista) {
		Artista = artista;
	}
	@Override
	public String toString() {
		return "Grupo [id=" + id + ", nombreGrupo=" + nombreGrupo + ", Artista=" + Artista + "]";
	}
	
	
}
