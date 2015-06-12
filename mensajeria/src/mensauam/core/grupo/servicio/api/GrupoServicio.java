package mensauam.core.grupo.servicio.api;

import mensauam.core.grupo.GrupoAlumno;
import mensauam.core.usuario.Usuario;

/**
 * Interface que gestiona los grupos de alumnos y estudio 
 * 
 *
 */
public interface GrupoServicio {

	GrupoAlumno crear(String nombreGrupo, boolean esPrivado, boolean esModerado,
			Usuario creador);

}
