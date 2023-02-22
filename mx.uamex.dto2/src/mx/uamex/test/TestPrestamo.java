package mx.uamex.test;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import mx.uamex.dto.*;

public class TestPrestamo {
	public static void main(String []args) {
		Alumno alumno1=new Alumno();
		
		alumno1.setId(1);
		alumno1.setNombre("Diego");
		alumno1.setNumerodeCuenta(20227102);
		alumno1.setApellidoPaterno("Rivera");
		alumno1.setApellidoMaterno("Ruiz");
		
		
		Libro Libro1= new Libro();
		Libro1.setId(1);
		Libro1.setNombre("Calculo");
		Libro1.setCategoria("Matematicas");
		Libro1.setEditorial("Alfaomega");
		Libro1.setIsbn(344);
		Libro1.setStock(2);
		
		Libro Libro2= new Libro();
		Libro2.setId(1);
		Libro2.setNombre("Fundamentos de Programacion");
		Libro2.setCategoria("Programacion");
		Libro2.setEditorial("Alfaomega");
		Libro2.setIsbn(2324);
		Libro2.setStock(5);
		
		List<Libro> listalibros=new ArrayList<>();
		listalibros.add(Libro1);
		listalibros.add(Libro2);
		
		Prestamo prestamo1= new Prestamo();
		Date fechaInt= new Date();
		prestamo1.setId(1);
		prestamo1.setFolio(234);
		prestamo1.setFechainicio(fechaInt);
		prestamo1.setLibros(listalibros);
		prestamo1.setPersona(alumno1);

		System.out.println(prestamo1);
		
	}
}
