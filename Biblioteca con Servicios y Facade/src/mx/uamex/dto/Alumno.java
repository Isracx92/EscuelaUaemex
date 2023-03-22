package mx.uamex.dto;

public class Alumno extends Persona{
	private int id;
	private int numerodeCuenta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumerodeCuenta() {
		return numerodeCuenta;
	}
	public void setNumerodeCuenta(int numerodeCuenta) {
		this.numerodeCuenta = numerodeCuenta;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", numerodeCuenta=" + numerodeCuenta + ", "+ super.getNombre()+" "+super.getApellidoPaterno()+" "+super.getApellidoMaterno()+ " ,"+super.getGenero()+ "]";
	}
	
	
}
