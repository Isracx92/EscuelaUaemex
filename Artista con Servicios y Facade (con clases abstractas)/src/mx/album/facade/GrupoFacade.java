package mx.album.facade;
import mx.album.dto.*;
import mx.album.dao.*;
import mx.album.servicios.*;

public abstract class GrupoFacade implements Servicios{

	GrupoDAO grupoDao= new GrupoDAO();
	
	@Override
	public void agregarGrupo(Grupo grupo) {
	grupoDao.agregarGrupo(grupo);
	}
	
	@Override
		public void actualizarGrupo(Grupo grupo) {
	grupoDao.actualizarGrupo(grupo);
	}
	
	@Override
		public void mostrarGrupo() {
	grupoDao.MostrarListaDeGrupos();
	}
	
	@Override
		public void eliminarGrupo(Grupo grupo) {
	grupoDao.eliminarGrupo(grupo);
	}
}
