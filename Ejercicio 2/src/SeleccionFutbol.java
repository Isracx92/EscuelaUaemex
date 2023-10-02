import java.util.ArrayList;

public class SeleccionFutbol {

	protected int id;
	protected String nomSeleccion;
	private ArrayList<Futbolista> listaFutbolista = new ArrayList<Futbolista>();

	public SeleccionFutbol(int id, String nomSeleccion, Futbolista jugador) {
		this.id = id;
		this.listaFutbolista.add(jugador);
		this.nomSeleccion = nomSeleccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomSeleccion() {
		return nomSeleccion;
	}

	public void setNomSeleccion(String nomSeleccion) {
		this.nomSeleccion = nomSeleccion;
	}

	public void AddFutbolista(Futbolista jugador) {
		listaFutbolista.add(jugador);
	}

	public ArrayList<Futbolista> getListaFutbolista() {
		return listaFutbolista;
	}

	public void setListaFutbolista(ArrayList<Futbolista> listaFutbolista) {
		this.listaFutbolista = listaFutbolista;
	}

	@Override
	public String toString() {
		return "SeleccionFutbol [id=" + id + ", nomSeleccion=" + nomSeleccion + ", listaFutbolista=" + listaFutbolista
				+ "]";
	}

}
