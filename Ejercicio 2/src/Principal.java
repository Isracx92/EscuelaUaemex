
public class Principal {

	public static void main(String[] args) {

		Futbolista F1 = new Futbolista("America");
		Futbolista F2 = new Futbolista("Cruz Azul");
		Futbolista F3 = new Futbolista("Chivas");
		F1.setNombre("Juan");
		F2.setNombre("Jose");
		F3.setNombre("Carlos");

		SeleccionFutbol SF1 = new SeleccionFutbol(1, "Mexico", F1);
		SF1.AddFutbolista(F2);
		SF1.AddFutbolista(F3);

		System.out.println(SF1.getListaFutbolista().get(0).getNombre());
	}

}
