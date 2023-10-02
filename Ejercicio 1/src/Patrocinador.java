
public class Patrocinador {

	public String nombreMarca;
	private String representante;

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	@Override
	public String toString() {
		return "Patrocinador [nombreMarca=" + nombreMarca + ", representante=" + representante + "]";
	}

}
