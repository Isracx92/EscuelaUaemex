import java.util.ArrayList;

public class Futbolista extends SeleccionFutbol implements Deportista {

	public String nombre;
	public int numPlayera;
	private ArrayList<Patrocinador> listaPatrocinador = new ArrayList<Patrocinador>();

	public Futbolista(int id, String nomSeleccion) {
		super(id, nomSeleccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entrenar(String velocidad) {
		// TODO Auto-generated method stub
	}

	@Override
	public void entrenar(String velocidad, String Fuerza) {
		// TODO Auto-generated method stub
	}

	public void addPatrocinador(Patrocinador patrocinador) {
		listaPatrocinador.add(patrocinador);
	}

	public ArrayList<Patrocinador> getListaPatrocinador() {
		return listaPatrocinador;
	}

	public void setListaPatrocinador(ArrayList<Patrocinador> listaPatrocinador) {
		this.listaPatrocinador = listaPatrocinador;
	}

}
