
public class SeleccionFutbol {

	protected int id;
	protected String nomSeleccion;

	public SeleccionFutbol(int id, String nomSeleccion) {
		this.id = id;
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

}
