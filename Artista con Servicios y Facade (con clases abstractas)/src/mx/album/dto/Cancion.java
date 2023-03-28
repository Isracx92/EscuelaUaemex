package mx.album.dto;
import java.util.List;
public class Cancion{
	private int id;
	private String nombreCancion;
	private String FechaLanzamiento;
	private String Compositor;
	private String Genero;
	private Persona persona;
	//private List<Cancion>Cancion;
	/*public List<Cancion> getCancion() {
		return Cancion;
	}
	public void setCancion(List<Cancion> cancion) {
		Cancion = cancion;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreCancion() {
		return nombreCancion;
	}
	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}
	public String getFechaLanzamiento() {
		return FechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		FechaLanzamiento = fechaLanzamiento;
	}
	public String getCompositor() {
		return Compositor;
	}
	public void setCompositor(String compositor) {
		Compositor = compositor;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombreCancion=" + nombreCancion + ", FechaLanzamiento=" + FechaLanzamiento
				+ ", Compositor=" + Compositor + ", Genero=" + Genero + ", persona=" + persona + "]"; }
	public void setCancion(List<Cancion> listaCancion) {
		// TODO Auto-generated method stub
		
	} }