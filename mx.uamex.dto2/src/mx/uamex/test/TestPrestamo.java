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
		
		
		
		Alumno alumno2=new Alumno();
		alumno2.setId(2);
		alumno2.setNombre("Antonio Israel");
		alumno2.setNumerodeCuenta(1644471);
		alumno2.setApellidoPaterno("Cruz");
		alumno2.setApellidoMaterno("Hernandez");
		
		Libro Libro3= new Libro();
		Libro3.setId(1);
		Libro3.setNombre("Harry Potter");
		Libro3.setCategoria("Magia");
		Libro3.setEditorial("Bloomsbury Children's Books");
		Libro3.setIsbn(3564);
		Libro3.setStock(7);
		
		Libro Libro4= new Libro();
		Libro4.setId(1);
		Libro4.setNombre("Epistemologia");
		Libro4.setCategoria("Filosofia");
		Libro4.setEditorial("Porrua");
		Libro4.setIsbn(240);
		Libro4.setStock(2);
		
		List<Libro> Listalibro2=new ArrayList<>();
		Listalibro2.add(Libro4);
		Listalibro2.add(Libro4);
		
		
		Prestamo prestamo2= new Prestamo();
		Date fechaInt2= new Date();
		prestamo2.setId(1);
		prestamo2.setFolio(234);
		prestamo2.setFechainicio(fechaInt);
		prestamo2.setLibros(Listalibro2);
		prestamo2.setPersona(alumno2);
		
		Alumno alumno3=new Alumno();
		alumno3.setId(2);
		alumno3.setNombre("Jose");
		alumno3.setNumerodeCuenta(3441231);
		alumno3.setApellidoPaterno("Jesus");
		alumno3.setApellidoMaterno("Martinez");
		
		Libro Libro5= new Libro();
		Libro5.setId(1);
		Libro5.setNombre("The Pragmatic Programmer");
		Libro5.setCategoria("Programacion");
		Libro5.setEditorial("Saron Yitbaken");
		Libro5.setIsbn(3564);
		Libro5.setStock(7);
		
		Libro Libro6= new Libro();
		Libro6.setId(1);
		Libro6.setNombre("Introduccion a la epistemologia");
		Libro6.setCategoria("Filosofia");
		Libro6.setEditorial("Deusto");
		Libro6.setIsbn(240);
		Libro6.setStock(2);
		
		List<Libro> Listalibro3=new ArrayList<>();
		Listalibro3.add(Libro5);
		Listalibro3.add(Libro6);
		
		
		Prestamo prestamo3= new Prestamo();
		Date fechaInt3= new Date();
		prestamo3.setId(1);
		prestamo3.setFolio(234);
		prestamo3.setFechainicio(fechaInt);
		prestamo3.setLibros(Listalibro3);
		prestamo3.setPersona(alumno3);


		System.out.println(prestamo1);
		System.out.println(prestamo2);
		System.out.println(prestamo3);
		
	}
}
