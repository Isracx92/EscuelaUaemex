package DAO;

public interface PersonaDAO<Persona> {

	public void Agregar(Persona persona);

	public void EliminarTodo();

	public void ConsultarTodo();

	Model.Persona BuscarNombre(String Nombre);

	void ActualizarTodo(Model.Persona persona);

	void Eliminar(int id);

	void ActualizarEdad(Model.Persona persona);

	void ActualizarNombre(Model.Persona persona);

}
