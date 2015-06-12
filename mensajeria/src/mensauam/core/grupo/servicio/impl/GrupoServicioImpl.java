package mensauam.core.grupo.servicio.impl;

import mensauam.core.grupo.GrupoAlumno;
import mensauam.core.grupo.GrupoEstudio;
import mensauam.core.grupo.servicio.api.GrupoServicio;
import mensauam.core.usuario.Usuario;

public class GrupoServicioImpl implements GrupoServicio{

	private static GrupoServicio _servicio = null;
	
	private GrupoServicioImpl(){}
	
	public static GrupoServicio getInstance() {
		
		if(_servicio == null){
			_servicio = new GrupoServicioImpl();
		}
		
		return _servicio;
	}

	@Override
	public GrupoAlumno crear(String nombreGrupo, boolean esPrivado,
			boolean esModerado, Usuario creador) {
		
		GrupoAlumno grupo = new GrupoAlumno(nombreGrupo, esPrivado, esModerado, creador);
		
		return grupo;
		
	}

	@Override
	public GrupoEstudio crear(String nombreGrupo, String pregunta,
			Usuario creador) {
		
		GrupoEstudio grupo = new GrupoEstudio(nombreGrupo, pregunta, creador);
		
		return grupo;
		
	}		

	
}
