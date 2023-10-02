
public class Futbolista extends Club {

	String nombre;
	int nomPlayera;
	private String posicion;

	public Futbolista(String nombreClub) {
		super(nombreClub);
	}

	@Override
	public void entrenar(String velocidad) {
	}

	@Override
	public void entrenar(String velocidad, String Fuerza) {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNomPlayera() {
		return nomPlayera;
	}

	public void setNomPlayera(int nomPlayera) {
		this.nomPlayera = nomPlayera;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Futbolista [nombre=" + nombre + ", nomPlayera=" + nomPlayera + ", posicion=" + posicion
				+ ", nombreClub=" + nombreClub + "]";
	}

}
