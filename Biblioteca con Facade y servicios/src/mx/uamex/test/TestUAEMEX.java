package mx.uamex.test;
import java.util.ArrayList;
import java.util.List;
import mx.uamex.dao.*;
import mx.uamex.dto.*;

public class TestUAEMEX {
	
	AlumnoDAO alumnodao = new AlumnoDAO();
	ProfesorDAO profesordao = new ProfesorDAO();
	PrestamoDAO prestamodao = new PrestamoDAO();
	LibroDAO librodao = new LibroDAO();
	
	public void CrearPrestamo(Prestamo prestamo) {
		prestamodao.AgregarPrestamo(prestamo);
	}
	public void CrearLibro(Libro libro) {
		librodao.AgregarLibro(libro);
	}
	public void CrearALumno(Alumno alumno) {
		alumnodao.agregarAlumno(alumno);
	}
	public void CrearProfesor(Profesor profesor) {
		profesordao.AgregarProfesor(profesor);
	}
	
	public void ConsultarPrestamo(int id) {
		Prestamo p= prestamodao.Buscar(id);
		System.out.println("La busqueda desde id es: "+ p.toString());	
	}
	
	public void ConsultarTodos() {
		List<Prestamo> prestamos= prestamodao.MostrarLista();
		for (Prestamo p: prestamos) {
			System.out.println(p.toString());
		}
		
	}
}
