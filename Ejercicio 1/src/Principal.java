
public class Principal {

	public static void main(String[] args) {

		Patrocinador patrocinador1 = new Patrocinador();
		patrocinador1.setNombreMarca("Nike");
		patrocinador1.setRepresentante("Juan");
		Patrocinador patrocinador2 = new Patrocinador();
		patrocinador2.setNombreMarca("Coca-cola");
		patrocinador2.setRepresentante("Jacobo");
		Patrocinador patrocinador3 = new Patrocinador();
		patrocinador3.setNombreMarca("Adidas");
		patrocinador3.setRepresentante("Sander");

		Futbolista futbolista = new Futbolista(1, "America");
		futbolista.addPatrocinador(patrocinador1);
		futbolista.addPatrocinador(patrocinador2);
		futbolista.addPatrocinador(patrocinador3);

		System.out.println(futbolista.getListaPatrocinador());

	}
}
