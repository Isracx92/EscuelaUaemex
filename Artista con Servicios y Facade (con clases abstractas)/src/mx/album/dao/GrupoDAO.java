package mx.album.dao;
import mx.album.dto.*;
import java.util.List;
import java.util.ArrayList;

public class GrupoDAO {
	List<Grupo> grupos = new ArrayList<Grupo>();
	int id=0; 
	
	public void agregarGrupo(Grupo grupo) {
		grupo.setId(id+1);
		grupos.add(grupo);
		id++;	
	}
	
	public void actualizarGrupo (Grupo grupo) {
		  for (int i = 0; i < grupos.size(); i++) {
	          if(grupos.get(i).getId()== grupo.getId()){
	              grupos.get(i).setId(grupo.getId());
	              	grupos.get(i).setNombreGrupo(grupo.getNombreGrupo());
	          }
		  }
	}
		
	
	public void eliminarGrupo(Grupo grupo) {
		grupos.remove(grupo);
		
	}
	 public List<Grupo> MostrarListaDeGrupos() {
		 return grupos;
		 }
}
