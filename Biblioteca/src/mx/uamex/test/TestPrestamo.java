package mx.uamex.test;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import mx.uamex.dto.*;
import mx.uamex.dao.*;

public class TestPrestamo {
	public static void main(String []args) {
		Alumno alumno=new Alumno();
		AlumnoDAO alumnos= new AlumnoDAO();
		ProfesorDAO profesores= new ProfesorDAO();
		Profesor profesor= new Profesor();
		Libro libro= new Libro();
		Libro libro2= new Libro();
		LibroDAO libros= new LibroDAO();
		PrestamoDAO prestamos= new PrestamoDAO();
		Prestamo prestamo= new Prestamo();

		
		alumno.setNombre("Roy");
		alumno.setApellidoPaterno("Mejias");
		alumno.setApellidoMaterno("Rojas");
		alumno.setGenero("Masculino");
		alumno.setNumerodeCuenta(128377);
		alumnos.AgregarAlumno(alumno);
		
		libro.setId(1);
		libro.setNombre("Calculo");
		libro.setCategoria("Matematicas");
		libro.setEditorial("Alfaomega");
		libro.setIsbn(344);
		libro.setStock(2);
		
		libro2.setId(1);
		libro2.setNombre("Fundamentos de Programacion");
		libro2.setCategoria("Programacion");
		libro2.setEditorial("Alfaomega");
		libro2.setIsbn(2324);
		libro2.setStock(5);
		
		libros.AgregarLibro(libro);
		libros.AgregarLibro(libro2);
		
		Date fechaInt= new Date();
		prestamo.setId(1);
		prestamo.setFolio(234);
		prestamo.setFechainicio(fechaInt);
		prestamo.setLibros(libros);
		prestamo.setPersona(alumno);


		alumnos.MostrarLista();
		prestamos.MostrarLista();
				
		
	
	
	}
}
