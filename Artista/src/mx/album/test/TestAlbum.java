package mx.album.test;
import mx.album.dto.*;
import java.util.ArrayList;
import java.util.List;

public class TestAlbum {
	public static void main(String[]args) {
		Artista Artista1=new Artista();
	
	Artista1.setId(1);
	Artista1.setNombre("Jose Romulo");
	Artista1.setApellidoMaterno("Sosa");
	Artista1.setApellidoPaterno("Ortiz");
	Artista1.setFechaNacimiento("1948");
	Artista1.setNombreArtistico("Jose Jose");
	
	Cancion Cancion1=new Cancion();
	Cancion1.setId(12);
	Cancion1.setNombreCancion("El triste");
	Cancion1.setCompositor("Roberto Cantoral");
	Cancion1.setFechaLanzamiento("1970");
	Cancion1.setGenero("Regional Mexicana");
	
	Cancion Cancion2=new Cancion();
	Cancion2.setId(12);
	Cancion2.setNombreCancion("El amar y el querer");
	Cancion2.setCompositor("Manuel Alejandro");
	Cancion2.setFechaLanzamiento("1977");
	Cancion2.setGenero("Regional Mexicana");
	
	List<Cancion>ListaCancion= new ArrayList();
	ListaCancion.add(Cancion1);
	ListaCancion.add(Cancion2);
	
	Cancion ListaCancion2= new Cancion();
	ListaCancion2.setCancion(ListaCancion);
	ListaCancion2.setPersona(Artista1);
	
	System.out.println(ListaCancion2);
	
	
	
	
	}

}
